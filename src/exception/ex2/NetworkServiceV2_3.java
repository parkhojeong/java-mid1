package exception.ex2;

public class NetworkServiceV2_3 {
    public void sendMessage(String data) {
        String addr = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(addr);
        client.initError(data);

        try {
            client.connect();
            client.send(data);
            client.disconnect();
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("e = " + e.getErrorCode() + ", " + e.getMessage());
        }
    }
}
