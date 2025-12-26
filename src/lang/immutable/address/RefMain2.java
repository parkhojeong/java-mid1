package lang.immutable.address;

public class RefMain2 {
    public static void main(String[] args) {
        ImmutableAddress a = new ImmutableAddress("1");
        ImmutableAddress b = a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b = new ImmutableAddress("2");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

}
