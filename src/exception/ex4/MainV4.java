package exception.ex4;


import java.util.Scanner;

public class MainV4 {
    public static void main(String[] args) {
//        NetworkServiceV4 service = new NetworkServiceV4();
        NetworkServiceV5 service = new NetworkServiceV5();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("input message: ");
            String message = scanner.nextLine();
            if ("exit".equals(message)) {
                break;
            }
            try {
                service.sendMessage(message);
            } catch (Exception e) {
                exceptionHandler(e);
            }
            System.out.println();
        }
        System.out.println("end");
    }

    private static void exceptionHandler(Exception e) {
        System.out.println("== [user output] internal error ==");
        System.out.println("== [debug] error message ==" + e.getMessage() + " ==");
        e.printStackTrace(System.out);
    }
}
