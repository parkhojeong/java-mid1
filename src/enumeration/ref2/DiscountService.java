package enumeration.ref2;

public class DiscountService {
    public int discount(Grade grade, int price) {
        int discountPercent = 0;

        if(grade != null) {
            discountPercent = grade.getDiscountPercent();
        }
        else {
            System.out.println("discount X");
        }

        return price*discountPercent/100;
    }
}
