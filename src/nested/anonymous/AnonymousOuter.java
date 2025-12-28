package nested.anonymous;

import nested.local.Printer;

public class AnonymousOuter {
    private int outInstanceValue = 3;

    public void process(int paramValue) {
        int localValue = 1;

        Printer printer = new Printer() { // anonymous class implements Printer
            int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value);
                System.out.println("localValue = " + localValue);
                System.out.println("paramValue = " + paramValue);
                System.out.println("outInstanceValue = " + outInstanceValue);
            }
        };

        printer.print();

        // class nested.anonymous.AnonymousOuter$1
        System.out.println(printer.getClass());
    }

    public static void main(String[] args) {
        new AnonymousOuter().process(2);
    }
}
