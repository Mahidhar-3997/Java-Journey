
public class Example1 {

    public static void main(String[] args) {
        // A a1 = new A();
        new A();
        // a1.A();//CTE
        new A();

    }

}

class A {
    A() {
        System.out.println("connstructor called");
    }
}
