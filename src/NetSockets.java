import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import java.io.IOException;
import java.net.Socket;

public final class NetSockets {

    private NetSockets() {}

    public static Socket open(String host, int port, boolean tls) throws IOException {
        if (!tls) {
            Socket s = new Socket(host, port);
            s.setSoTimeout(10000);
            return s;
        }
        SSLSocketFactory f = (SSLSocketFactory) SSLSocketFactory.getDefault();
        SSLSocket s = (SSLSocket) f.createSocket(host, port);
        s.setSoTimeout(10000);

        SSLParameters params = s.getSSLParameters();
        params.setEndpointIdentificationAlgorithm("HTTPS"); // verify hostname against cert
        s.setSSLParameters(params);

        s.startHandshake();
        return s;
    }

    public static SSLSocket wrapTls(Socket plain, String host, int port) throws IOException {
        SSLSocketFactory f = (SSLSocketFactory) SSLSocketFactory.getDefault();
        SSLSocket s = (SSLSocket) f.createSocket(plain, host, port, true);
        s.setSoTimeout(10000);

        SSLParameters params = s.getSSLParameters();
        params.setEndpointIdentificationAlgorithm("HTTPS");
        s.setSSLParameters(params);

        s.startHandshake();
        return s;
    }
}
