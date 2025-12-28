package exception.ex2;

public class NetworkClientV2 {
    private final String address;
    public boolean connectError;
    public boolean sendError;

    public NetworkClientV2(String address) {
        this.address = address;
    }

    public void connect() throws NetworkClientExceptionV2 {
        if(connectError){
            throw new NetworkClientExceptionV2("connectError", "NetworkClientV0.connectError: " + address);
        }

        System.out.println("NetworkClientV0.connect: " + address);
    }

    public void send(String data) throws NetworkClientExceptionV2 {
        if(sendError){
            throw new NetworkClientExceptionV2("sendError", "NetworkClientV0.sendError: " + address);
        }
        System.out.println("NetworkClientV0.send:" + data);
    }

    public void disconnect(){
        System.out.println("NetworkClientV0.disconnect: " + address);
    }

    public void initError(String data) {
        if(data.contains("error1")){
            connectError = true;
        }
        if(data.contains("error2")){
            sendError = true;
        }
    }
}
