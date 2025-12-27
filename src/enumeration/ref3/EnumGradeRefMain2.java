package enumeration.ref3;


public class EnumGradeRefMain2 {
    public static void main(String[] args) {
        int price = 10000;

        for (Grade grade : Grade.values()) {
            System.out.println(grade.name() + " = " + grade.discount(price));
        }
    }
}
