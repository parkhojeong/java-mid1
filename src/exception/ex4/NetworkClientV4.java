package exception.ex4;

import exception.ex4.exception.ConnectExceptionV4;
import exception.ex4.exception.SendExceptionV4;

public class NetworkClientV4 {
    private final String address;
    public boolean connectError;
    public boolean sendError;

    public NetworkClientV4(String address) {
        this.address = address;
    }

    public void connect() {
        if(connectError){
            throw new ConnectExceptionV4(address, address + " connectError");
        }

        System.out.println("NetworkClientV0.connect: " + address);
    }

    public void send(String data) throws SendExceptionV4 {
        if(sendError){
            throw new SendExceptionV4(data, address + " sendError -" + data);
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
