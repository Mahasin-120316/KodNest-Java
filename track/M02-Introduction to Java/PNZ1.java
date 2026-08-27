import java.util.Scanner;

public class PNZ1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int positive = 0;
        int negative = 0;
        int zero = 0;
        for (int i = 0; i < n; i++) {
            int num = s.nextInt();
            if (num > 0) {
                positive++;
            } else if (num < 0) {
                negative++;
            } else {
                zero++;
            }

        }
        System.out.println(positive + " " + negative + " " + zero);
        s.close();
    }
}
