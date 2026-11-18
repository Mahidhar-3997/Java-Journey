
public class Example1 {
    public static void main(String[] args) {

        M a1;// we can create reference variable for abstract class
        // a1= new A(); CTE ->we can not create instance for object;

    }

}

abstract class M {
    abstract void m1();

    void m2() {
        System.out.println("m2 in A");
    }
}
