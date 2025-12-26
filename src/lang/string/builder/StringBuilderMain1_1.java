package lang.string.builder;

public class StringBuilderMain1_1 {
    public static void main(String[] args) {
        // -> String("A") + String("B") + String("C")
        // -> new String("AB") + new String("C")
        // -> new String("ABC")
        String s = "A" + "B" + "C";


        StringBuilder sb = new StringBuilder();
        sb.append("A");
        sb.append("B");
        sb.append("C");
        sb.append("D");
        System.out.println(sb);

        sb.insert(2,"XX");
        System.out.println(sb);

        sb.delete(2,4);
        System.out.println(sb);
    }
}
