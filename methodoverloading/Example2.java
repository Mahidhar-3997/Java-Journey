
public class Example2 {
    public static void main(String[] args) {
        System.out.println("This program is CTS and mehtod overloading");
        m1();
        m1(10);
        m1(10, 20);
        System.out.println("why becoz method name is differeny and different formal arguments");

    }

    public static void m1() {
        System.out.println("first m1 is executed");
    }

    public static void m1(int i) {
        System.out.println("secong m1 i executed");
        System.out.println(i);
    }

    public static void m1(int i, int j) {
        System.out.println("Third m1 method is executed");
        System.out.println(i + " " + j);

    }

}
