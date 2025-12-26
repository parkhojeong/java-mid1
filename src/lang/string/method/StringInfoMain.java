package lang.string.method;

public class StringInfoMain {
    public static void main(String[] args) {
        String str = "hello";
        System.out.println("str.length() = " + str.length());
        System.out.println("str.isEmpty() = " + str.isEmpty());
        System.out.println("\"\".isEmpty() = " + "".isEmpty());
        System.out.println("\"   \".isEmpty() = " + "   ".isEmpty());
        System.out.println("str.isBlank() = " + str.isBlank());
        System.out.println("\"      \".isBlank() = " + "      ".isBlank());

        System.out.println("str.charAt(4) = " + str.charAt(4));

    }
}
