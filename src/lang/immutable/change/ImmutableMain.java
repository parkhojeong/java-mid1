package lang.immutable.change;

public class ImmutableMain {
    public static void main(String[] args) {
        ImmutableObj immutableObj = new ImmutableObj(10);
        ImmutableObj immutableObj1 = immutableObj.add(10);
        System.out.println("mutableObj.getValue() = " + immutableObj.getValue());
        System.out.println("mutableObj1.getValue() = " + immutableObj1.getValue());
    }
}
