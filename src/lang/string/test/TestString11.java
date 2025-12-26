package lang.string.test;

public class TestString11 {
    public static void main(String[] args) {
        String str = "hello world";
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        System.out.println("sb = " + sb);
    }
}
