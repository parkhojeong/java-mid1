package enumeration.ex3;

public class StringGradeEx3 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();
        int basic = discountService.discount(Grade.BASIC, price);
        int gold = discountService.discount(Grade.GOLD, price);
        int diamond = discountService.discount(Grade.DIAMOND, price);

        System.out.println(getHashCode(Grade.BASIC));
        System.out.println(getHashCode(Grade.GOLD));
        System.out.println(getHashCode(Grade.DIAMOND));



        System.out.println("basic = " + basic);
        System.out.println("gold = " + gold);
        System.out.println("diamond = " + diamond);
    }

    private static String  getHashCode(Grade grade) {
        return Integer.toHexString(System.identityHashCode(grade));
    }
}
