
public class Unary {

    public static void main(String[] args) {
        int a = 10;
        int res = a++ + ++a + a++ + a++ + ++a + a++;
        System.out.println("Post incremented value of a: " + a);
        System.out.println("Result: " + res);
    }
}
