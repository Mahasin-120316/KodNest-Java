public class Calculator {
    int add(int first, int second){
        return first + second;
    }

    public static void main(String[]args){
    Calculator c = new Calculator();
    int result = c.add(10, 5);
    System.out.println("The sum is: " + result);
    }
}
