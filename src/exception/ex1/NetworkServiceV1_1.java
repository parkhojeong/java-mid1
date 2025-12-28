package exception.ex1;

public class NetworkServiceV1_1 {
    public void sendMessage(String data) {
        String addr = "http://example.com";
        NetworkClientV1 client = new NetworkClientV1(addr);
        client.initError(data);

        client.connect();
        client.send(data);
        client.disconnect();
    }
}
