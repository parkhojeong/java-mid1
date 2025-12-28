package exception.ex1;

public class NetworkClientV1 {
    private final String address;
    public boolean connectError;
    public boolean sendError;

    public NetworkClientV1(String address) {
        this.address = address;
    }

    public String connect() {
        if(connectError){
            System.out.println("NetworkClientV0.connectError: " + address);
            return "connectError";
        }

        System.out.println("NetworkClientV0.connect" + address);
        return "success";
    }

    public String send(String data){
        if(sendError){
            System.out.println("NetworkClientV0.sendError: " + address);
            return "sendError";
        }
        System.out.println("NetworkClientV0.send:" + data);
        return "success";
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
