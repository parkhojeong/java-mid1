package exception.ex3;


import exception.ex3.exception.ConnectExceptionV3;
import exception.ex3.exception.SendExceptionV3;

public class NetworkServiceV3_1 {
    public void sendMessage(String data) {
        String addr = "http://example.com";
        NetworkClientV3 client = new NetworkClientV3(addr);
        client.initError(data);

        try {
            client.connect();
            client.send(data);
        } catch (ConnectExceptionV3 e) {
            System.out.println("[connectError] " + e.getAddress() + ", message="+ e.getMessage());
        } catch (SendExceptionV3 e) {
            System.out.println("[sendError] " + e.getSendData() + "message=" + e.getMessage());
        } finally {
            client.disconnect();
        }

    }
}
