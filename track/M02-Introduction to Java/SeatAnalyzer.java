 import java.util.Scanner;
public class SeatAnalyzer {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] seats = new int[rows][cols];
        int availableSeats = 0;
        for(int i = 0;i<rows;i++){
            for(int j = 0;j<cols;j++){
                seats[i][j] = sc.nextInt();

                if(seats[i][j] == 0){
                    availableSeats++;

                }
            }
        }
        System.out.println("Available seats: " + availableSeats);
        sc.close();
    }
}
