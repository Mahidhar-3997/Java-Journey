public class Example2 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        B b1 = new B();
        b1.i = 10;
        B b2 = new B();
        b2.i = 20;
        b1.m2();
        b2.m2();
        // B.m1();//compile time error

    }

}

class B {
    int i;

    static void m1() {
        // System.out.println(i);
    }

    void m2() {
        System.out.println(i);
    }
}
/*
 * Non-static members cannot be referenced from static context or methods but
 * non-static
 * members can be referenced form non-static context of current class.
 * 
 */