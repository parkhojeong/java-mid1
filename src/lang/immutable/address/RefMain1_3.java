package lang.immutable.address;

public class RefMain1_3 {
    public static void main(String[] args) {
        Address a = new Address("1");
        Address b = a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        change(b, "2");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    private static void change(Address b, String addressValue) {
        b.setValue(addressValue);
    }
}
