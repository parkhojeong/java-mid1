package lang.wrapper;

public class AutoboxingMain1 {
    public static void main(String[] args) {

        int value = 7;
        Integer boxedValue = Integer.valueOf(value); //Primitive -> Wrapper

        int unboxedValue = boxedValue.intValue(); //Wrapper -> Primitive

        System.out.println("boxedValue = " + boxedValue);
        System.out.println("unboxedValue = " + unboxedValue);
    }
}
