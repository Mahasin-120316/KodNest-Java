import java.util.Scanner;
public class Checkpoint {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[][] arr = new int[size][size];
        int arrayTotal = 0;
        for(int i = 0;i< size;i++){
            for(int j = 0;j< size;j++){
                arr[i][j] = sc.nextInt();
                arrayTotal += arr[i][j];
            }
        }
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];
        int matrixTotal = 0;
        for(int i = 0;i < rows;i++){
            for(int j = 0;j < cols;j++){
                matrix[i][j] = sc.nextInt();
                matrixTotal += matrix[i][j];
            }
        }
        System.out.println("Array Total: " + arrayTotal);
        System.out.println("Matrix total: " + matrixTotal);
        sc.close();
    }
}
