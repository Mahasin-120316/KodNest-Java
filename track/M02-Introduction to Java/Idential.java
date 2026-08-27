import java.util.Scanner;
public class Idential{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr1 = new int[n];

        for(int i= 0;i < n;i++){
            arr1[i] = s.nextInt();
        }
        int m = s.nextInt();
        int[] arr2 = new int[m];

        for(int i =0;i<m;i++){
            arr2[i] = s.nextInt();
        }

        boolean identical = true;
        if(n!=m){
            System.out.println("NOT IDENTICAL");
            return;
        }

        for(int i=0;i<n;i++){
            if(arr1[i] != arr2[i]){
                identical = false;
                break;
            }
        }

        if(identical){
            System.out.println("Identical");
        } else {
            System.out.println("Not Identical");
        }
        s.close();
    }
}