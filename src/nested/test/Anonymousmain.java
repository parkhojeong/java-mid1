package nested.test;

public class Anonymousmain {
    public static void main(String[] args) {
        Hello hello = new Hello() {
            @Override
            public void hello() {
                System.out.println("Anonymousmain.hello");
            }
        };

        hello.hello();
    }
}
