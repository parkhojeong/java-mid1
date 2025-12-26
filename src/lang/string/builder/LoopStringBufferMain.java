package lang.string.builder;

public class LoopStringBufferMain {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < 100000; i++) {
            // synchronized
            sb.append("hello java");
        }
        long end = System.currentTimeMillis();
        System.out.println((end - start) + "ms");
    }
}
