package lang.string.method;

public class StringUtilsMain {
    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        Object obj = new Object();
        String str = "hello";

        System.out.println(String.valueOf(num));
        System.out.println(String.valueOf(bool));
        System.out.println(String.valueOf(obj));
        System.out.println(String.valueOf(str));

        System.out.println(("" + num));

        for (char c : str.toCharArray()) {
            System.out.print(c);
        }
    }
}
