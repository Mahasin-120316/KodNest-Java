import java.util.Scanner;

public class Char {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a Name: ");
        char ch = scan.next().charAt(0);

        System.out.println("You entered: " + ch);

        scan.close();
    }
}