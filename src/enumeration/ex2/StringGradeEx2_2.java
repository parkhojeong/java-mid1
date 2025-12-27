package enumeration.ex2;

public class StringGradeEx2_2 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();
        // prevent new ClassGrade() by private constructor
        // int basic = discountService.discount(new ClassGrade(), price);
    }
}
