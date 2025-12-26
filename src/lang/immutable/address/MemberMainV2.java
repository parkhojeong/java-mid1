package lang.immutable.address;

public class MemberMainV2 {
    public static void main(String[] args) {
        ImmutableAddress address = new ImmutableAddress("seoul");

        MemberV2 memberA = new MemberV2("a", address);
        MemberV2 memberB = new MemberV2("b", address);
        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);

        memberB.setAddress(new ImmutableAddress("busan"));
        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);
    }
}
