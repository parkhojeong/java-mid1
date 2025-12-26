package lang.string.equals;

public class StringEqualsMain2 {
    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");

        System.out.println("equals(str1, str2) = " + equals(str1, str2)); // different reference value

        String str3 = "hello";
        String str4 = "hello";
        System.out.println("equals(str3, str4) = " + equals(str3, str4)); // T
    }

    private static boolean equals(String str1, String str2) {
        return str1 == str2;
    }
}
