package exception.ex0;

import java.util.Scanner;

public class MainV0 {
    public static void main(String[] args) {
        NetworkServiceV0 service = new NetworkServiceV0();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("input message: ");
            String message = scanner.nextLine();
            if("exit".equals(message)){
                break;
            }
            service.sendMessage(message);
            System.out.println();
        }
        System.out.println("end");
    }
}
