package lang.wrapper;

public class WrapperClassMain {
    public static void main(String[] args) {
        Integer newInteger = new Integer(10);

        // boxing
        Integer integerObj = Integer.valueOf(10); // -128 ~ 127 reuse instance, immutable
        Long longObj = Long.valueOf(100);
        Double doubleObj = Double.valueOf(100.1);
        System.out.println("integerObj = " + integerObj);
        System.out.println("longObj = " + longObj);
        System.out.println("doubleObj = " + doubleObj);

        // unboxing
        System.out.println("integerObj.intValue() = " + integerObj.intValue());
        System.out.println("longObj.longValue() = " + longObj.longValue());
        System.out.println("doubleObj.doubleValue() = " + doubleObj.doubleValue());

        System.out.println("(newInteger == integerObj) = " + (newInteger == integerObj));
        System.out.println("newInteger.equals(integerObj) = " + newInteger.equals(integerObj));

        // instance cache
        System.out.println("(integerObj == Integer.valueOf(10)) = " + (integerObj == Integer.valueOf(10)));
    }
}
