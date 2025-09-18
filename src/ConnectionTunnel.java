/** ConnectionTunnel - Decompiled by JODE
 * @author Xeon (Deob)
 */

import sun.net.www.protocol.http.AuthenticationInfo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class ConnectionTunnel extends Class481 {

	ProxySelector systemProxySelector = ProxySelector.getDefault();

	Socket openHttpConnectTunnel(String proxyHost, int proxyPort, String proxyAuthHeader) throws IOException {
		try {
			Socket tunnelSocket = new Socket(proxyHost, proxyPort);
			tunnelSocket.setSoTimeout(10000);
			OutputStream out = tunnelSocket.getOutputStream();
			if (proxyAuthHeader == null) {
				out.write(("CONNECT " + this.CONNECT_ADDRESS + ":" + (98195689 * this.connectPort) + " HTTP/1.0\n\n").getBytes(StandardCharsets.ISO_8859_1));
			} else {
				out.write(("CONNECT " + this.CONNECT_ADDRESS + ":" + (this.connectPort * 98195689) + " HTTP/1.0\n" + proxyAuthHeader + "\n\n").getBytes(StandardCharsets.ISO_8859_1));
			}
			out.flush();
			BufferedReader in = new BufferedReader(new InputStreamReader(tunnelSocket.getInputStream()));
			String statusLine = in.readLine();
			if (statusLine != null) {
				if (statusLine.startsWith("HTTP/1.0 200") || statusLine.startsWith("HTTP/1.1 200")) {
					return tunnelSocket;
				}
				if (statusLine.startsWith("HTTP/1.0 407") || statusLine.startsWith("HTTP/1.1 407")) {
					int scanLimit = 0;
					String headerPrefix = "proxy-authenticate: ";
					for (statusLine = in.readLine(); statusLine != null && scanLimit < 50; scanLimit++) {
						if (statusLine.toLowerCase().startsWith(headerPrefix)) {
							String scheme = statusLine.substring(headerPrefix.length()).trim();
							int spaceIdx = scheme.indexOf(' ');
							if (spaceIdx != -1) {
								scheme = scheme.substring(0, spaceIdx);
							}
							throw new IOException_Sub1(scheme);
						}
						statusLine = in.readLine();
					}
					throw new IOException_Sub1("");
				}
			}
			out.close();
			in.close();
			tunnelSocket.close();
			return null;
		} catch (RuntimeException ex) {
			throw ErrorContext.info(ex, "aes.q(" + ')');
		}
	}

	Socket openViaProxy(Proxy proxy) throws IOException {
		try {
			if (proxy.type() == Proxy.Type.DIRECT) {
				return openDirect(-1908230977);
			}
			SocketAddress addr = proxy.address();
			if (!(addr instanceof InetSocketAddress)) {
				return null;
			}
			InetSocketAddress isa = (InetSocketAddress) addr;

			if (proxy.type() == Proxy.Type.HTTP) {
				String preemptiveAuthHeader = null;

				try {
					Class<AuthenticationInfo> authInfoClass = AuthenticationInfo.class;
					Method getProxyAuth = authInfoClass.getDeclaredMethod("getProxyAuth", String.class, Integer.TYPE);
					getProxyAuth.setAccessible(true);
					Object authInfo = getProxyAuth.invoke(null, isa.getHostName(), isa.getPort());
					if (authInfo != null) {
						Method supportsPreemptive = authInfoClass.getDeclaredMethod("supportsPreemptiveAuthorization");
						supportsPreemptive.setAccessible(true);
						if ((Boolean) supportsPreemptive.invoke(authInfo, new Object[0])) {
							Method getHeaderName = authInfoClass.getDeclaredMethod("getHeaderName");
							getHeaderName.setAccessible(true);
							Method getHeaderValue = authInfoClass.getDeclaredMethod("getHeaderValue", URL.class, String.class);
							getHeaderValue.setAccessible(true);
							String headerName = (String) getHeaderName.invoke(authInfo, new Object[0]);
							String headerValue = (String) getHeaderValue.invoke(authInfo, new Object[] { new URL("https://" + this.CONNECT_ADDRESS + "/"), "https" });
							preemptiveAuthHeader = headerName + ": " + headerValue;
						}
					}
				} catch (Exception ignore) {
				}
				Socket tunnel = openHttpConnectTunnel(isa.getHostName(), isa.getPort(), preemptiveAuthHeader);
				if (tunnel == null) {
					return null;
				}
				if (Settings.USE_TLS) {
					return NetSockets.wrapTls(tunnel, this.CONNECT_ADDRESS, Loader.PORT);
				}
				return tunnel;
			}
			if (proxy.type() == Proxy.Type.SOCKS) {
				Socket socksSocket = new Socket(proxy);
				socksSocket.connect(new InetSocketAddress(this.CONNECT_ADDRESS, (98195689 * this.connectPort)));
				if (Settings.USE_TLS) {
					return NetSockets.wrapTls(socksSocket, this.CONNECT_ADDRESS, Loader.PORT);
				}
				return socksSocket;
			}
			return null;
		} catch (RuntimeException ex) {
			throw ErrorContext.info(ex, "aes.r(" + ')');
		}
	}

	public Socket openWithSystemProxies() throws IOException {
		boolean useSystemProxies = Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"));
		if (!useSystemProxies) {
			System.setProperty("java.net.useSystemProxies", "true");
		}
		boolean isHttpsPort = this.connectPort * 98195689 == 443;
		List proxiesPrimary;
		List proxiesFallback;
		try {
			proxiesPrimary = this.systemProxySelector.select(new URI((isHttpsPort ? "https" : "http") + "://" + this.CONNECT_ADDRESS));
			proxiesFallback = this.systemProxySelector.select(new URI((isHttpsPort ? "http" : "https") + "://" + this.CONNECT_ADDRESS));
		} catch (URISyntaxException e) {
			return openDirect(-1850943966);
		}
		proxiesPrimary.addAll(proxiesFallback);
		Object[] proxyArray = proxiesPrimary.toArray();
		IOException_Sub1 authException = null;
		for (Object o : proxyArray) {
			Proxy proxy = (Proxy) o;
			try {
				Socket s = openViaProxy(proxy);
				if (s == null) {
					continue;
				}
				return s;
			} catch (IOException_Sub1 authErr) {
				authException = authErr;
			} catch (IOException ignore) {
			}
		}
		if (authException != null) {
			throw authException;
		}
		return openDirect(-1772806309);
	}

	ConnectionTunnel() {
		/* empty */
	}

	public Socket openWithSystemProxiesAlt(int unusedTag) throws IOException {
		try {
			boolean useSystemProxies = Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"));
			if (!useSystemProxies) {
				System.setProperty("java.net.useSystemProxies", "true");
			}
			boolean isHttpsPort = this.connectPort * 98195689 == 443;
			List proxiesPrimary;
			List proxiesFallback;
			try {
				proxiesPrimary = this.systemProxySelector.select(new URI((isHttpsPort ? "https" : "http") + "://" + this.CONNECT_ADDRESS));
				proxiesFallback = this.systemProxySelector.select(new URI((isHttpsPort ? "http" : "https") + "://" + this.CONNECT_ADDRESS));
			} catch (URISyntaxException e) {
				return openDirect(-1954406666);
			}
			proxiesPrimary.addAll(proxiesFallback);
			Object[] proxyArray = proxiesPrimary.toArray();
			IOException_Sub1 authException = null;
			for (Object o : proxyArray) {
				Proxy proxy = (Proxy) o;
				try {
					Socket s = openViaProxy(proxy);
					if (s == null) {
						continue;
					}
					return s;
				} catch (IOException_Sub1 authErr) {
					authException = authErr;
				} catch (IOException ignore) {
				}
			}
			if (authException != null) {
				throw authException;
			}
			return openDirect(-2133259279);
		} catch (RuntimeException ex) {
			throw ErrorContext.info(ex, "aes.f(" + ')');
		}
	}
}
