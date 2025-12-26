package lang.string.chaining;

public class MethodChainingMain2 {
    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();
        adder.add(1)
                .add(2)
                .add(3);

        System.out.println(adder.getValue());
    }
}
