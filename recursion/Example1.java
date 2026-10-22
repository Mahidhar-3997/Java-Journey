
public class Example1 {
    public static void main(String[] args) {
        m1(1);

    }

    public static void m1(int i) {
        System.out.println(i);
        if (i >= 3) { // base condition is important in recursion
            return;
        }
        m1(i + 1);
    }
}
