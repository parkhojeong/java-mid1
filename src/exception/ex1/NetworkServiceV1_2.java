package exception.ex1;

public class NetworkServiceV1_2 {
    public void sendMessage(String data) {
        String addr = "http://example.com";
        NetworkClientV1 client = new NetworkClientV1(addr);
        client.initError(data);

        String connectionResult = client.connect();
        if(isError(connectionResult)){
            System.out.println("[connect error]");
            return;
        }

        String sendResult = client.send(data);
        if(isError(sendResult)){
            System.out.println("[send error]");
            return;
        }

        client.disconnect();
    }

    private static boolean isError(String connectionResult) {
        return !connectionResult.equals("success");
    }
}
