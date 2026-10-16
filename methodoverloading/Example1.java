
public class Example1 {
    public static void main(String[] args) {
        System.out.println("This program is compile time success and not mthod overloading.");
        m1();
        m2();
        System.out.println("why bcoz method name is different");

    }

    public static void m1() {
        System.out.println("m1 ia executed");

    }

    public static void m2() {
        System.out.println("m2 is executed");
    }

}
