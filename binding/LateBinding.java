
public class LateBinding {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        C c1 = new C();
        c1.m1();
        c1 = new D();
        c1.m1();
        c1 = new E();
        c1.m1();

    }

}

class C {
    void m1() {
        System.out.println("m1 in C");
    }
}

class D extends C {
    void m1() {
        System.out.println("m1 in D");
    }
}

class E extends C {
    void m1() {
        System.out.println("m1 in E");
    }
}
