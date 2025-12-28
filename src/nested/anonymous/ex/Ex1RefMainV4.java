package nested.anonymous.ex;

import java.util.Random;

public class Ex1RefMainV4 {
    public static void hello(Process process) {
        System.out.println("== start ==");

        process.run();

        System.out.println("== end ==");
    }

    public static void main(String[] args) {
        hello(new Process() {
            @Override
            public void run() {
                int random = new Random().nextInt(6) + 1;
                System.out.println("random = " + random);
            }
        });
        hello(new Process() {
            @Override
            public void run() {
                for (int i = 0; i < 3; i++) {
                    System.out.println("i = " + i);
                }
            }
        });
    }
}