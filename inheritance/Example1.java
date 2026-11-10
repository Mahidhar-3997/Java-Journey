
public class Example1 {
    public static void main(String[] args) {
        B b1 = new B();
        b1.i = 10;
        b1.j = 20;
        b1.m1();
        b1.m2();

    }

}

class A {
    int i;

    void m1() {
        System.out.println(i);
    }
}

class B extends A {
    int j;

    void m2() {
        System.out.println(i);
        System.out.println(j);
    }
}
