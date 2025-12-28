package nested.local;

import java.lang.reflect.Field;

public class LocalOuterV4 {
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

        // Variable 'localValue' is accessed from within inner class,
        // needs to be final or effectively final
        // localValue = 5; // compile error
        // paramValue = 5; // compile error

        return new LocalPrinter();
    }

    public static void main(String[] args) {
        Printer printer = new LocalOuterV4().process(2);
        printer.print();

        Field[] fields = printer.getClass().getDeclaredFields();
        for (Field field : fields) {
            /*
            field = int nested.local.LocalOuterV4$1LocalPrinter.value
            field = final int nested.local.LocalOuterV4$1LocalPrinter.val$localValue
            field = final int nested.local.LocalOuterV4$1LocalPrinter.val$paramValue
            field = final nested.local.LocalOuterV4 nested.local.LocalOuterV4$1LocalPrinter.this$0
             */
            System.out.println("field = " + field);
        }
    }
}
