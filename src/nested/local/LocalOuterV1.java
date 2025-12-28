package nested.local;

public class LocalOuterV1 {
    private int outInstanceValue = 3;

    public void process(int paramValue) {
        int localValue = 1;

        class LocalPrinter {
            int value = 0;

            public void print() {
                System.out.println("value = " + value);
                System.out.println("localValue = " + localValue);
                System.out.println("paramValue = " + paramValue);
                System.out.println("outInstanceValue = " + outInstanceValue);
            }
        }

        new LocalPrinter().print();
    }

    public static void main(String[] args) {
        new LocalOuterV1().process(2);
    }
}
