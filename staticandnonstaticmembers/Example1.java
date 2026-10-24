
public class Example1 {
    public static void main(String[] args) {
        A.i = 10;
        A a1 = new A();
        A.m1();
        a1.m2();
        A a2 = new A();
        a2.m2();

    }

}

class A {
    static int i;

    static void m1() {
        System.out.println(i);
    }

    void m2() {
        System.out.println(i);
    }
}
/*
 * static members can be reference from both static and non static methods of
 * same class.
 */