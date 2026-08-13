public class Greeter {
    void greet(String name){
        System.out.println("Hello " + name + "!");
    }

    public static void main(String[]args){
        Greeter g = new Greeter();
        g.greet("Humaira");
    }
}
