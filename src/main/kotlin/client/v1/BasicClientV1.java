package client.v1;

public interface BasicClientV1 {

    void request(String method, String httpVersion, String host, int port, String header);

}
