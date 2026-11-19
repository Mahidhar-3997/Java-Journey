
public class Example2 {
    public static void main(String[] args) {
        I1 ref1 = new C();
        ref1.m1();
        I2 ref2 = new C();
        ref2.m2();

    }

}

interface I1 {
    void m1();
}

interface I2 {
    void m2();
}

class C implements I1, I2 {
    public void m1() {
        System.out.println("m1 in C of I1");
    }

    public void m2() {
        System.out.println("m2 in C Of I2");
    }
}
