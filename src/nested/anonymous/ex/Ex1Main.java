package nested.anonymous.ex;

import java.util.Random;

public class Ex1Main {
    public static void helloDice() {
        System.out.println("== start ==");

        // logic start
        int random = new Random().nextInt(6) + 1;
        System.out.println("random = " + random);
        // logic end

        System.out.println("== end ==");
    }

    public static void helloSum() {
        System.out.println("== start ==");

        // logic start
        for (int i = 0; i < 3; i++) {
            System.out.println("i = " + i);
        }
        // logic end

        System.out.println("== end ==");
    }

    public static void main(String[] args) {
        helloDice();
        helloSum();
    }
}
