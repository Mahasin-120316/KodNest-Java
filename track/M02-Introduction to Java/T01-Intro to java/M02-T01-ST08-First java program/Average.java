public class Average {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        int total = 0;
        double average;
        for (int i = 0; i <= arr.length-1; i++) {
            total += arr[i];
        }
        System.out.println("Total: " + total);
        average = total / 5;
        System.out.println("Average: " + average);
    }
}
