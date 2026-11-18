
public class Example2 {
    public static void main(String[] args) {
        A a1;
        a1 = new B(); // upcasting
        a1.m1();
        a1.m2();
        a1 = new C();
        a1.m1();
        a1.m2();

    }

}

abstract class A {
    abstract void m1();

    void m2() {
        System.out.println("ma in A");
    }
}

class B extends A {
    void m1() {
        System.out.println("m1 in class B");
    }
}

class C extends A {
    void m1() {
        System.out.println("m1 in class C");
    }
}