package lang.wrapper;

public class WrapperVsPrimitive {
    public static void main(String[] args) {
        int iterations = 1_000_000_000;
        long start = System.currentTimeMillis();

        long sumPrimitive = 0;
        for (int i = 0; i < iterations; i++) {
            sumPrimitive += i;
        }
        long end = System.currentTimeMillis();
        System.out.println("sum = " + sumPrimitive);
        System.out.println("Primitive: " + (end - start));

        start = System.currentTimeMillis();
        Long sumWrapper = 0L;
        for (int i = 0; i < iterations; i++) {
            sumWrapper += i; // auto-boxing
        }
        end = System.currentTimeMillis();
        System.out.println("sum = " + sumWrapper);
        System.out.println("Wrapper: " + (end - start));
    }
}
