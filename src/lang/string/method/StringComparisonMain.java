package lang.string.method;

public class StringComparisonMain {
    public static void main(String[] args) {
        String a = "Hello, Java";
        String b = "hello, java";
        String c = "Hello, World";

        System.out.println("a.equals(b) = " + a.equals(b));
        System.out.println("a.equalsIgnoreCase(b) = " + a.equalsIgnoreCase(b));

        System.out.println("\"c\".compareTo(\"a\") = " + "c".compareTo("a"));
        System.out.println("\"b\".compareTo(\"a\") = " + "b".compareTo("a"));
        System.out.println("\"a\".compareTo(\"b\") = " + "a".compareTo("b"));
        System.out.println("a.compareTo(b) = " + a.compareTo(b));
        System.out.println("a.compareToIgnoreCase(b) = " + a.compareToIgnoreCase(b));




    }
}
