package exception.basic.unchecked;

public class Service {

    Client client = new Client();

    public void callCatch() {
        try {
            client.call();
        } catch (MyUncheckedException e) {
            System.out.println("e = " + e);
        }
    }

    public void callNoCatch() {
        client.call();
    }
}
