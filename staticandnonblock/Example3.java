public class Example3 {

    public static void main(String[] args) {
        System.out.println(B.i);

    }

}

class B {
    static int i;
    static {
        i = 10;
    }
}
// static block are used to initialize the static members.