public class Example3 {
    public static void main(String[] args) {
        System.out.println("main is executed.");
        int i = 10;
        System.out.println(i);
        m1(i);

    }

    public static void m1(int i) {
        System.out.println("m1 is executed");
        i += 10;
        System.out.println(i);

    }
}
