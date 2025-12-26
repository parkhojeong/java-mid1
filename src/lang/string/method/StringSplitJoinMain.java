package lang.string.method;

public class StringSplitJoinMain {
    public static void main(String[] args) {
        String s = "a, b, c";

        String[] split = s.split(",");
        for (String string : split) {
            System.out.println(string);
        }

        String join = String.join(",", split);
        System.out.println(join);

        System.out.println(String.join("-", "A", "B", "C"));
    }
}
