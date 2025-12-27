package enumeration.ex3;

import java.util.Arrays;

public class EnumMethodMain {
    public static void main(String[] args) {
        Grade[] values = Grade.values();
        System.out.println("values = " + Arrays.toString(values));
        for (Grade value : values) {
            System.out.println("value.name() = " + value.name() + ", value.ordinal() = " + value.ordinal());
        }

        String input = "GOLD";
        Grade grade = Grade.valueOf(input); // throws IllegalArgumentException
        System.out.println("grade = " + grade);
    }
}
