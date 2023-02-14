package client.v2;

import client.common.HTTP_METHOD;
import client.common.HTTP_VERSION;

public interface BasicClientV2 {

    void setHost(String host);

    void setPort(int port);

    void setRequestMethod(HTTP_METHOD method);

    void setHttpVersion(HTTP_VERSION httpVersion);

    void setHeader(String header);

    void request();

}
