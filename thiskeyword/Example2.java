public class Example2 {
    public static void main(String[] args) {
        B b1 = new B();
        b1.i = 30;

        B b2 = new B();
        b2.i = 196;
        b2.m1();
        b1.m1();

    }

}

class B {
    int i;

    void m1() {
        int i = 10;
        System.out.println(i);
        System.out.println(this.i);
    }
}
// class c{
// static void m2() {
// System.out.println(this);//CTE
// }
// }
