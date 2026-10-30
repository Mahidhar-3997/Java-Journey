public class NonstaticEx1 {

    public static void main(String[] args) {
        new C();
        new C(10);

    }

}

class C {
    {
        System.out.println("non-static block");// how many time you created object that many times
        // non static block will execute.
    }

    C() {
        System.out.println("default constructor");
    }

    C(int n) {
        System.out.println("parameterized constructor=" + n);
    }
}