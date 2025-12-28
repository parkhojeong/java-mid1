package exception.ex2;

public class NetworkServiceV2_1 {
    public void sendMessage(String data) throws NetworkClientExceptionV2 {
        String addr = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(addr);
        client.initError(data);

        client.connect();
        client.send(data);
        client.disconnect();
    }
}
