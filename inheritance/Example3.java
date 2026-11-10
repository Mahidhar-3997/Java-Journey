
public class Example3 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new F();

    }

}

class E {
    E(int i) {
        System.out.println("parameterized constructor in class c");
    }
}

class F extends E {
    F() {
        super(10);// mandatory becoz c class ctt is parameterized.
        System.out.println("default constructor in F class");
    }
}
