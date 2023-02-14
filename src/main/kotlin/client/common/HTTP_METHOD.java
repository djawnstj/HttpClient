package client.common;

import java.util.Arrays;

public enum HTTP_METHOD {

    GET("GET"), POST("POST"), PUT("PUT"), PATCH("PATCH"), DELETE("DELETE");

    public final String method;

    HTTP_METHOD(String method) {
        this.method = method;
    }

    public static HTTP_METHOD of(String method) {
        return Arrays.stream(values()).filter(it -> it.method.endsWith(String.valueOf(method))).findFirst().orElseThrow();
    }

}
