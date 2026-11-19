
public class Example1 {
    public static void main(String[] args) {
        I ref1; // for interface we can create reference not possible to crearte instance
        ref1 = new A();
        ref1.m1();
        ref1 = new B();
        ref1.m1();

    }

}

interface I {
    void m1();
}

class A implements I {
    public void m1() {
        System.out.println("m1  in A");
    }
}

class B implements I {
    public void m1() {
        System.out.println("m1 in B");
    }
}