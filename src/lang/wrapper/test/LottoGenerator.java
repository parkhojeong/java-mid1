package lang.wrapper.test;

import java.util.Arrays;
import java.util.Random;

public class LottoGenerator {
    private Integer[] numbers = new Integer[6];
    private Random random = new Random();

    public Integer[] generate() {
        int i = 0;
        while(i < numbers.length) {
            int num = random.nextInt(45) + 1;
            if(Arrays.asList(numbers).contains(num)) {
               continue;
            }

            numbers[i++] = num;
        }


        return Arrays.stream(numbers).sorted().toArray(Integer[]::new);
    }


}
