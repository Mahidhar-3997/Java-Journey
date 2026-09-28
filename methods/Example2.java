public class Example2 {
    public static void main(String[] args) {
        System.out.println("main is executed");
        m1();

    }

    public static void m1() {
        System.out.println("m1() ia executed.");
        m2();
    }

    public static void m2() {
        System.out.println("m2 is executed");
    }

}
