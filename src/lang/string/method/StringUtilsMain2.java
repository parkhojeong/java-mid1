package lang.string.method;

public class StringUtilsMain2 {
    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        String str = "hello";

        String result = String.format("%d %b %s", num, bool, str);
        System.out.println("result = " + result);

        String format = String.format("%.2f", 10.5555);
        System.out.println("format = " + format);

        System.out.printf("%.2f\n", 10.1234);

        String regex = "(hello|bye)";
        System.out.println(str.matches(regex));
    }
}
