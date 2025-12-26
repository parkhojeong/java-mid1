package lang.object.tostring;

public class ToStringMain2 {
    public static void main(String[] args) {
        Car car = new Car("k3");
        Dog dog1 = new Dog("dog1", 2);

        System.out.println("car = " + car);
        System.out.println("dog1 = " + dog1);

        ObjectPrinter.print(car);
        ObjectPrinter.print(dog1);

        int identityHashCode = System.identityHashCode(dog1);
        System.out.println("Integer.toHexString(identityHashCode) = " + Integer.toHexString(identityHashCode));
    }
}
