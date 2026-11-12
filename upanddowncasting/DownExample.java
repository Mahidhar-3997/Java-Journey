
public class DownExample {
    public static void main(String[] args) {
        D d1 = new E();
        E e1 = (E) d1;// downCasting
        e1.m1();
        e1.m2();
        ((E) d1).m2();// downCasting
        D d2 = new F();

        // E e2 =(E)d2;//Run time exception why because f type object cannot be cast to
        // E type

        // D d3 = new D();
        // E e3 = (E) d3;//Run time exception why because D type object cannot be cast
        // to E type

        F f1 = (F) d2;
        f1.m1();
        f1.m3();
        ((F) d2).m1();

    }

}

class D {
    void m1() {
        System.out.println("m1 in A class");
    }

}

class E extends D {
    void m2() {
        System.out.println("m2 in class B");
    }

}

class F extends D {
    void m3() {
        System.out.println("m3 in class C");
    }
}
