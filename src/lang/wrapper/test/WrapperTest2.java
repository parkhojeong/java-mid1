package lang.wrapper.test;

public class WrapperTest2 {
    public static void main(String[] args) {
        String[] str1 = {"1.5", "2.5", "3.0"};

        double sum = 0;
        for (String s : str1) {
            sum += Double.parseDouble(s);
        }
        System.out.println("sum = " + sum);
    }
}
