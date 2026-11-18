public class Example4 {
    public static void main(String[] args) {
        Y y1 = new Y();

    }

}

abstract class X {
    {
        System.out.println("non static block in x"); // abstract class can contain non static blocks
    }

    X() {
        System.out.println("constructor in x");
    }
}

class Y extends X {
    {
        System.out.println("non static block in Y");
    }

    Y() {
        super();// not compulsory optional
        System.out.println("construcor in Y");
    }
}