
public class Example6 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        m1(1);
    }

    public static void m1(int i) {
        System.out.println(i);
        if (i >= 3) {
            return;
        }
        m1(i + 1);
        m1(i + 2);
        m1(i + 3);
        System.out.println(i);
    }
}
