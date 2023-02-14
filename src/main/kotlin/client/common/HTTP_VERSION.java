package client.common;

import java.util.Arrays;

public enum HTTP_VERSION {

    HTTP0_9("HTTP/0.9"), HTTP1_0("HTTP/1.0"), HTTP1_1("HTTP/1.1"), HTTP2("HTTP/2"), HTTP3("HTTP/3");

    public final String version;

    HTTP_VERSION(String version) {
        this.version = version;
    }

    public static HTTP_VERSION of(int version) {
        return Arrays.stream(values()).filter(it -> it.version.endsWith(String.valueOf(version))).findFirst().orElseThrow();
    }

    public static HTTP_VERSION of(String version) {
        return Arrays.stream(values()).filter(it -> it.version.endsWith(String.valueOf(version))).findFirst().orElseThrow();
    }
}