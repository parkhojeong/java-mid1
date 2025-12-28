package exception.ex3;

import exception.ex2.NetworkClientExceptionV2;

import java.util.Scanner;

public class MainV3 {
    public static void main(String[] args) throws NetworkClientExceptionV2 {
//        NetworkServiceV3_1 service = new NetworkServiceV3_1();
        NetworkServiceV3_2 service = new NetworkServiceV3_2();

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
