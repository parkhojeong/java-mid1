package lang.immutable.address;

public class RefMain1_2 {
    public static void main(String[] args) {
        Address a = new Address("1");
        Address b = new Address("1");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b.setValue("2");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
