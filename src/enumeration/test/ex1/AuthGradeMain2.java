package enumeration.test.ex1;

import java.util.Scanner;

public class AuthGradeMain2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("input grade name[GUEST, LOGIN, ADMIN]: ");
            AuthGrade authGrade = AuthGrade.valueOf(scanner.nextLine());

            System.out.println("your grade is " + authGrade.name());
            System.out.println("== menu list==");
            for (String menu : authGrade.getMenus()) {
                System.out.println("- " + menu);
            }
        }
    }
}
