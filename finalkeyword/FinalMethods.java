public class FinalMethods {
    public static void main(String[] args) {
        D d1 = new D();
        d1.m1();
    }

}

class C {
    final void m1() {
        System.out.println("m1 in c");
    }
}

class D extends C {
    // void m1() {
    // In class D m1 cannot be overriden why becoz m1 is final methid in class c
    // }
}
