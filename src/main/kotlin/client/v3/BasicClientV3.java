package client.v3;

import client.common.HTTP_METHOD;
import client.common.HTTP_VERSION;

public interface BasicClientV3 {

    void setHost(String host);

    void setPort(int port);

    void setRequestMethod(HTTP_METHOD method);

    void setHttpVersion(HTTP_VERSION httpVersion);

    void setRequestHeader(String header);

    void request();

    int getResponseCode();

    String getContentType();

    void setResponseHeader(String key, String value);

    String getResponseMessage();

}
