
public class Example1 {
    public static void main(String[] args) {
        A a1 = new B();
        a1.m1();
        // a1.m2(); //compile time error
        A a2 = new C();
        a2.m1();
        // a2.m3();//compile time error
        B b1 = new B();
        b1.m1();
        b1.m2();
        // b1.m3();// compile time error

    }

}

class A {
    void m1() {
        System.out.println("m1 in a class");
    }
}

class B extends A {
    void m2() {
        System.out.println("m2 in calss B");
    }
}

class C extends A {
    void m3() {
        System.out.println("m3 in class");
    }
}
