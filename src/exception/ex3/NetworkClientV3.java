package exception.ex3;


import exception.ex3.exception.ConnectExceptionV3;
import exception.ex3.exception.NetworkClientExceptionV3;
import exception.ex3.exception.SendExceptionV3;

public class NetworkClientV3 {
    private final String address;
    public boolean connectError;
    public boolean sendError;

    public NetworkClientV3(String address) {
        this.address = address;
    }

    public void connect() throws ConnectExceptionV3 {
        if(connectError){
            throw new ConnectExceptionV3(address, address + " connectError");
        }

        System.out.println("NetworkClientV0.connect: " + address);
    }

    public void send(String data) throws SendExceptionV3 {
        if(sendError){
            throw new SendExceptionV3(data, address + " sendError -" + data);
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
