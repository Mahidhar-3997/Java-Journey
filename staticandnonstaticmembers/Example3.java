public class Example3 {
    public static void main(String[] args) {
        C obj = new C();
        obj.i = 10;
        obj.m1();

    }

}

class C {
    int i;

    void m1() {
        C c1 = new C();
        System.out.println(i);
        System.out.println(c1.i);
    }
}