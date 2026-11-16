
public class EarlyBinding {
    public static void main(String[] args) {
        A a1 = new A();

        System.out.println(a1.i);
        a1.m1();
        a1 = new B();
        System.out.println(a1.i);
        a1.m1();

    }
}

class A {
    int i = 10;

    static void m1() {
        System.out.println("m1 in A");
    }
}

class B extends A {
    int i = 20;

    static void m1() {
        System.out.println("m1 in B");
    }
}
