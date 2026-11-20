
public class CompiletimePolymorphism {
    public static void main(String[] args) {
        A a1 = new A();
        a1.m1();
        a1.m1(10);
        a1.m1(2.6, 300);

    }

}

class A {
    public void m1() {
        System.out.println("m1 in A of FIrst m1 ");
    }

    public void m1(int i) {
        System.out.println("m1 in A with parameter");
    }

    public void m1(double d, int i) {
        System.out.println("m1 in A with two parameters");
    }
}
