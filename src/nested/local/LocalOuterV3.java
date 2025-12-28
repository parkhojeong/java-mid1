package nested.local;

import java.lang.reflect.Field;

public class LocalOuterV3 {
    private int outInstanceValue = 3;

    public Printer process(int paramValue) {
        int localValue = 1;

        class LocalPrinter implements Printer {
            int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value);
                System.out.println("localValue = " + localValue);
                System.out.println("paramValue = " + paramValue);
                System.out.println("outInstanceValue = " + outInstanceValue);
            }
        }

        return new LocalPrinter();
    }

    public static void main(String[] args) {
        Printer printer = new LocalOuterV3().process(2);
        printer.print();

        Field[] fields = printer.getClass().getDeclaredFields();
        for (Field field : fields) {
            /*
            field = int nested.local.LocalOuterV3$1LocalPrinter.value

            // outer class field capture
            field = final int ...LocalOuterV3$1LocalPrinter.val$localValue
            field = final int ...LocalOuterV3$1LocalPrinter.val$paramValue

            // outer class instance reference
            field = final ...LocalOuterV3 ...LocalOuterV4$1LocalPrinter.this$0
             */
            System.out.println("field = " + field);
        }
    }
}
