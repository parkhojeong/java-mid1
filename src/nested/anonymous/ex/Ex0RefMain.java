package nested.anonymous.ex;

public class Ex0RefMain {
    public static void hello(String str) {
        System.out.println("== start ==");
        System.out.println("hello " + str);
        System.out.println("== end ==");
    }

    public static void main(String[] args) {
        hello("java");
        hello("spring");
    }

}
