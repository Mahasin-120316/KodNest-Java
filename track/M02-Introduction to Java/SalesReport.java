import java.util.Scanner;

public class SalesReport {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] sales = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sales[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < rows; i++) {
            int total = 0;
            for (int j = 0; j < cols; j++) {
                total += sales[i][j];
            }
            System.out.println("Product " + (i + 1) + " total: " + total);
        }
        sc.close();
    }

}
