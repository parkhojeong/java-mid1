package exception.ex2;

import exception.ex1.NetworkServiceV1_3;

import java.util.Scanner;

public class MainV2 {
    public static void main(String[] args) throws NetworkClientExceptionV2 {
//        NetworkServiceV2_1 service = new NetworkServiceV2_1();
        NetworkServiceV2_2 service = new NetworkServiceV2_2();

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
