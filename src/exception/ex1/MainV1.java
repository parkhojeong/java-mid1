package exception.ex1;

import java.util.Scanner;

public class MainV1 {
    public static void main(String[] args) {
        NetworkServiceV1_1 service = new NetworkServiceV1_1();

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
