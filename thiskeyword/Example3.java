public class Example3 {
    public static void main(String[] args) {
        D d1 = new D();
        d1.i = 100;
        d1.m1();

    }

}

class D {
    int i = 10;

    void m1() {
        D obj1 = new D();
        System.out.println(obj1.i);
        System.out.println(this.i);
    }
}