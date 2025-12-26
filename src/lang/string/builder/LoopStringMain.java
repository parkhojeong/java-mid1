package lang.string.builder;

public class LoopStringMain {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        String result = "";
        for (int i = 0; i < 100000; i++) {
            result += "hello java";
        }
        long end = System.currentTimeMillis();
        System.out.println((end - start) + "ms");
//        System.out.println(result);
    }
}
