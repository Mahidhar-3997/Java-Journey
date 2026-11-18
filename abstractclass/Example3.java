public class Example3 {
    public static void main(String[] args) {
        E e1 = new E();

    }

}

abstract class D { // we can create constructor in abstract class
    D(int i) {
        System.out.println("Constructor in D");
    }
}

class E extends D {
    E() {
        super(10); // we must call why in class D constructor is parameterized
        System.out.println("Construcor in E");
    }
}
