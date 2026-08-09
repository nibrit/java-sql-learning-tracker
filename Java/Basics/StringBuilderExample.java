public class StringBuilderExample {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Hello");

        sb.append(" Java");
        sb.insert(5, ",");
        sb.replace(0, 5, "Hi");

        System.out.println(sb);
    }
}
