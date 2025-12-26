package lang.string.builder;

public class LoopStringBuilderMain {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            sb.append("hello java");
        }
        long end = System.currentTimeMillis();
        System.out.println((end - start) + "ms");
    }
}
