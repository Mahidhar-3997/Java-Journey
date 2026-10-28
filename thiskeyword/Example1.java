public class Example1 {

    public static void main(String[] args) {
        A a1 = new A();
        System.out.println(a1);
        a1.m1();
        A a2 = new A();
        System.out.println(a2);
        a2.m1();

    }

}

class A {
    void m1() {
        System.out.println(this);
    }
}
