package lang.object.tostring;

public class ToStringMain1 {
    public static void main(String[] args) {
        Object object = new Object();
        String string = object.toString();

        System.out.println("string = " + string);

        int hashCode = object.hashCode();
        System.out.println("hashCode = " + hashCode);

        String hexString = Integer.toHexString(hashCode);
        System.out.println("hexString = " + hexString);

        Class<?> aClass = object.getClass();
        System.out.println("aClass = " + aClass);


    }
}
