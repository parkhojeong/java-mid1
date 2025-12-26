package lang.string.test;

public class TestString6 {
    public static void main(String[] args) {
        String str = "start hello java, hello, spring, hello jpa";
        String key = "hello";

        int i = 0;
        int count = 0;
        while ((i = str.indexOf(key, i)) != -1) {
            count ++;
            i += 1;
        }
        System.out.println("count = " + count);

    }
}
