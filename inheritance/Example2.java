
public class Example2 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new D();
    }

}

class C {
    C() {
        super();
        System.out.println("default constructor in A");
    }
}

class D extends C {
    D() {
        super(); // not mandatory implicitly parent class default ctt is called
        System.out.println("default constructor in B");
    }
}