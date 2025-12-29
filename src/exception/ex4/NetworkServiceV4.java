package exception.ex4;


public class NetworkServiceV4 {
    public void sendMessage(String data) {
        String addr = "http://example.com";
        NetworkClientV4 client = new NetworkClientV4(addr);
        client.initError(data);

        try {
            client.connect();
            client.send(data);
        }finally {
            client.disconnect();
        }

    }
}
