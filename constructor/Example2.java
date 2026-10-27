
public class Example2 {
    public static void main(String[] args) {
        new B();
        // new C();//CTE there is no parameter less constructor for c class
        new C(10);
        new C(190);
    }

}

class B {

}

class C {
    C(int i) {
        System.out.println(i);
    }
}