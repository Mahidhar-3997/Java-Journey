public class Example4 {
    public static void main(String[] args) {
        System.out.println("This program is CTs and method overloading");
        m1(19, 2.5);
        m1(2.5, 14);
        System.out.println("why bcoz same method name and different type of arguments in different order");

    }

    public static void m1(int i, double d) {
        System.out.println("1st m1 is executed ");
        System.out.println(i + " " + d);
    }

    public static void m1(double d, int i) {
        System.out.println("2nd m1 is executed");
        System.out.println(d + " " + i);
    }
}
