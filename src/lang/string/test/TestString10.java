package lang.string.test;

public class TestString10 {
    public static void main(String[] args) {
        String string = "apple,banana,mango";
        String[] split = string.split(",");
        for (String s : split) {
            System.out.println(s);
        }
        String joinedString = String.join("->", split);
        System.out.println("joinedString = " + joinedString);
    }
}
