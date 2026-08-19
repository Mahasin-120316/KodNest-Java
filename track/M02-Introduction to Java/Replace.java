import java.util.Scanner;

public class Replace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        int target = scanner.nextInt();
        int replacement = scanner.nextInt();

        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                if (numbers[i] != replacement) {
                    count++;
                }
                numbers[i] = replacement;
            }
        }

        System.out.println("Changes: " + count);
        System.out.print("Updated array: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(" ");
            }
        }
        scanner.close();
    }
}
