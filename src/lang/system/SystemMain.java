package lang.system;

import java.util.Arrays;
import java.util.Map;
import java.util.Properties;

public class SystemMain {
    public static void main(String[] args) {
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("currentTimeMillis = " + currentTimeMillis);

        long nanoTime = System.nanoTime();
        System.out.println("nanoTime = " + nanoTime);

        Map<String, String> getenv = System.getenv();
        System.out.println("getenv = " + getenv);

        System.out.println(System.getProperties());
        System.out.println(System.getProperty("java.version"));

        char[] originalArr = {'h', 'e', 'l', 'l', 'o'};
        char[] copiedArr = new char[5];
        // fast copy(system level)
        System.arraycopy(originalArr, 0, copiedArr, 0, 5);
        System.out.println("copiedArr = " + copiedArr); // [C@27bc2616 -> [ is array, C is char
        System.out.println("copiedArr = " + Arrays.toString(copiedArr));

        System.exit(0); // normal termination(status: 0). non zero mean abnormal termination like exception
    }
}
