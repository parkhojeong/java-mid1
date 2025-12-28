package exception.ex0;

public class NetworkServiceV0 {
    public void sendMessage(String data) {
        String addr = "http://example.com";
        NetworkClientV0 client = new NetworkClientV0(addr);

        client.connect();
        client.send(data);
        client.disconnect();
    }
}
