import java.util.Scanner;

public class AttendanceTotals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int classes = sc.nextInt();
        int days = sc.nextInt();
        int attendance[][] = new int[classes][days];

        for (int i = 0; i < classes; i++) {
            for (int j = 0; j < days; j++) {
                attendance[i][j] = sc.nextInt();
            }
        }

        for (int j = 0; j < days; j++) {
            int total = 0;
            for (int i = 0; i < classes; i++) {
                total += attendance[i][j];
            }
            System.out.println("Day " + (j + 1) + " total: " + total);
        }
        sc.close();
    }
}
