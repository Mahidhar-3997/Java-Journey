public class Example5 {
    public static void main(String[] args) {
        m1();
        int a = m2();
        System.out.println(a);
        int b = m3(156);
        System.out.println(b);
        // m4();
        m5();

    }

    public static void m1() {
        System.out.println("it does not return any thing from the caller method");
    }

    public static int m2() {
        System.out.println("it will return integer type of value.");
        return 10;
    }

    public static int m3(int i) {
        System.out.println("paasing arguments");
        return i;
    }

    // public static int m4() {
    // return 10;
    // System.out.println("it is compiltime error unrechable statement ");
    // }
    public static void m5() {
        System.out.println(
                "it is compile time success we can use return keyword in void return type but we can not pass any value");
        return;
    }

}
