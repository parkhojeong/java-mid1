package lang.string.method;

public class StringChangeMain2 {
    public static void main(String[] args) {
        String s = "     Java";
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s.trim());
        System.out.println(s.strip()); // \t, \n, etc white space
    }
}
