package lang.string.equals;

public class StringEqualsMain1 {
    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println("(str1 == str2) = " + (str1 == str2)); // reference value comparison
        System.out.println("(str1.equals(str2)) = " + (str1.equals(str2)));

        String str3 = "hello"; // assign string instance to string pool. when class loading
        String str4 = "hello";
        System.out.println("(str3 == str4) = " + (str3 == str4)); //
        System.out.println("(str3.equals(str4)) = " + (str3.equals(str4)));

        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));
        System.out.println(System.identityHashCode(str3));
        System.out.println(System.identityHashCode(str4));
    }
}
