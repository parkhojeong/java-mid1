package lang.immutable.address;

public class MemberMainV1 {
    public static void main(String[] args) {
        Address address = new Address("seoul");

        MemberV1 memberA = new MemberV1("a", address);
        MemberV1 memberB = new MemberV1("b", address);

        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);

        memberB.getAddress().setValue("busan");

        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);
    }
}
