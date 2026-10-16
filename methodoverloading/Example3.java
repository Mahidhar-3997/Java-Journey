
public class Example3 {
    public static void main(String[] args) {
        System.out.println("this program is CTE and not methid overloading");
        m1(10, 20);
        System.out.println("why bcoz same method name with same arguments JVM will confuse which one i need to call");
    }

    public static void m1(int i, int j) {
        System.out.println("1st m1 is executed");
        System.out.println(i + " " + j);
    }
    // public static void m1(int j,int i) {
    // System.out.println("2nd m1 is executed");
    // System.out.println(i+" "+j);
    // }
}
