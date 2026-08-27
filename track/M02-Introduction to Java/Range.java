import java.util.Scanner;
public class Range {
   public static void main(String[]args){
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int[] arr = new int[n];
    

    for(int i = 0; i < n; i++){
        arr[i] = s.nextInt();
    }
    int lower = 0;
    int upper = 0;
    int count = 0;
    for(int i=0;i<n;i++){
        if(arr[i] >= lower && arr[i] <= upper){
            count++;
        }
    }
    System.out.println(count);
    s.close();
   } 
}


