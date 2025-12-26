package lang.string.method;

public class StringChangeMain1 {
    public static void main(String[] args) {
        String str = "hello java. welcome to java";
        System.out.println(str.substring(5));
        System.out.println(str.substring(5, 10));
        System.out.println(str.concat("~~"));
        System.out.println(str.replace("java", "kotlin"));
        System.out.println(str.replaceFirst("java", "kotlin"));
        System.out.println(str.replaceAll("java", "kotlin"));
    }
}
