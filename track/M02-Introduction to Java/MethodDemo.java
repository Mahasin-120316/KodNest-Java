public class MethodDemo {
    void sayHello() {
        System.out.println("Hello!");
    }

    void printNumber(int number) {
        System.out.println(number);
    }

    int getNumber() {
        return 30;
    }

    int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        MethodDemo md = new MethodDemo();
        md.sayHello();
        md.printNumber(15);
        System.out.println(md.getNumber());
        System.out.println(md.add(10, 20));
    }
}
