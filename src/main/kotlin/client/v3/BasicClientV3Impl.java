package client.v3;

import client.common.HTTP_METHOD;
import client.common.HTTP_VERSION;

import java.util.HashMap;
import java.util.Map;

public abstract class BasicClientV3Impl implements BasicClientV3 {

    private String host;

    private int port;

    private HTTP_METHOD requestMethod;

    private HTTP_VERSION httpVersion;

    private String requestHeader;

    private int responseCode;

    private String contentType;

    private Map<String, String> headers = new HashMap<>();

    private String responseMessage;

    public String getHost() {
        return host;
    }

    @Override
    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    @Override
    public void setPort(int port) {
        this.port = port;
    }

    public HTTP_METHOD getRequestMethod() {
        return requestMethod;
    }

    @Override
    public void setRequestMethod(HTTP_METHOD requestMethod) {
        this.requestMethod = requestMethod;
    }

    public HTTP_VERSION getHttpVersion() {
        return httpVersion;
    }

    @Override
    public void setHttpVersion(HTTP_VERSION httpVersion) {
        this.httpVersion = httpVersion;
    }

    public String getRequestHeader() {
        return requestHeader;
    }

    @Override
    public void setRequestHeader(String header) {
        this.requestHeader = header;
    }

    @Override
    public int getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(int responseCode) {
        this.responseCode = responseCode;
    }

    @Override
    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public Map<String, String> getResponseHeader() {
        return headers;
    }

    @Override
    public void setResponseHeader(String key, String value) {
        this.headers.put(key, value);
    }

    @Override
    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }
}
