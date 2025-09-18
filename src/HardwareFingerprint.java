import java.net.NetworkInterface;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

import oshi.SystemInfo;
import oshi.hardware.Baseboard;
import oshi.hardware.ComputerSystem;
import oshi.hardware.HWDiskStore;
import oshi.hardware.HardwareAbstractionLayer;

public final class HardwareFingerprint {

    private static final String STATIC_SALT_HEX = "9b4f6f7d5a1c4e138f0c2b7a6d9150a2b7a6cd4e2f1a3b5c7d9e0fa1b2c3d4e5";

    private HardwareFingerprint() {}

    public static String computeHex() {
        StringBuilder sb = new StringBuilder(512);
        try {
            SystemInfo si = new SystemInfo();
            HardwareAbstractionLayer hw = si.getHardware();
            ComputerSystem cs = hw.getComputerSystem();
            Baseboard bb = cs.getBaseboard();
            append(sb, cs.getHardwareUUID());
            append(sb, cs.getSerialNumber());
            append(sb, bb.getManufacturer());
            append(sb, bb.getModel());
            append(sb, bb.getSerialNumber());
            append(sb, hw.getProcessor().getProcessorIdentifier().getProcessorID());
            List<String> diskSerials = new ArrayList<>();
            for (HWDiskStore d : hw.getDiskStores()) {
                if (d.getSerial() != null && !d.getSerial().isEmpty()) {
                    diskSerials.add(d.getSerial());
                }
            }
            Collections.sort(diskSerials, String::compareToIgnoreCase);
            for (String s : diskSerials) append(sb, s);

        } catch (Throwable ignore) {}
        try {
            List<String> macs = new ArrayList<>();
            Enumeration<NetworkInterface> nics = NetworkInterface.getNetworkInterfaces();
            while (nics.hasMoreElements()) {
                NetworkInterface ni = nics.nextElement();
                if (ni == null || ni.isLoopback() || !ni.isUp()) continue;
                byte[] mac = ni.getHardwareAddress();
                if (mac != null && mac.length > 0) {
                    macs.add(bytesToHex(mac));
                }
            }
            Collections.sort(macs, String::compareToIgnoreCase);
            for (String m : macs) append(sb, m);
        } catch (Throwable ignore) {}
        sb.append(STATIC_SALT_HEX);
        String out = sha256Hex(sb.toString().getBytes(StandardCharsets.UTF_8));
        //System.out.println("[HardwareFingerprint] HWID=" + out);
        return out;
    }

    private static void append(StringBuilder sb, String s) {
        if (s != null) sb.append(s);
    }

    private static String sha256Hex(byte[] data) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] dig = md.digest(data);
            return bytesToHex(dig);
        } catch (Exception e) {
            throw new RuntimeException("SHA-256 not available", e);
        }
    }

    private static String bytesToHex(byte[] b) {
        StringBuilder out = new StringBuilder(b.length * 2);
        for (byte v : b) out.append(String.format("%02x", v));
        return out.toString();
    }
}
