
public class Example2 {
    public static void main(String[] args) {
        m1(10);
        m1('a'); // passonf character auto widening.

    }

    static void m1(double d) {
        System.out.println("d = " + d);
    }
}
