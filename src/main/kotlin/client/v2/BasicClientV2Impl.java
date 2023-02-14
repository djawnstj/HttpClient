package client.v2;

import client.common.HTTP_METHOD;
import client.common.HTTP_VERSION;

public abstract class BasicClientV2Impl implements BasicClientV2 {

    private String host;

    private int port;

    private HTTP_METHOD requestMethod;

    private HTTP_VERSION httpVersion;

    private String header;

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

    public String getHeader() {
        return header;
    }

    @Override
    public void setHeader(String header) {
        this.header = header;
    }

}
