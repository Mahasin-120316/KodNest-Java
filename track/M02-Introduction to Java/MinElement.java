import java.util.Scanner;

public class MinElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter the elements:");
        for (int i = 0; i <= arr.length-1; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Array Elemnts are:");
        for(int i=0;i<=arr.length-1;i++){
            System.out.println(arr[i] + " ");
        }
        int min = arr[0];
        for (int i = 1; i <=arr.length-1; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Min Element is: " + min);
        scanner.close();
    }
}

