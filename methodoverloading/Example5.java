public class Example5 {
    public static void main(String[] args) {
        System.out.println("This program is CTE and not method overloading");
        m1();

        System.out.println("why bcoz same name but noargumetns for both methods even though retunr type is different");

    }

    public static int m1() {
        System.out.println("1st m1 is executed");
        return 10;
    }
    // public static double m1() {
    // System.out.println("2nd m1 is executed");
    // return 2.2;
    // }
    //
}
