public class Example2 {

    static {
        System.out.println("static block in main class");
    }

    public static void main(String[] args) {
        System.out.println("main starts");
        A.m1();
        A.m1();
        System.out.println("main ends");

    }

}

class A {
    static {
        System.out.println("static block in class A");
        // if you call multiple times m1 it will execute only 1 time.
    }

    static void m1() {
        System.out.println("static method m1 in class A");
    }
}