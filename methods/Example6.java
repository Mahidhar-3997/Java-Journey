public class Example6 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("main starts");
        if (n > 6) {
            return;
        }
        System.out.println(
                "return statement is belongs to if statement so when if condition is true then only return executes");
        System.out.println("main ends");
        int a = m1();
        System.out.println(a);
        int b = m2();
        System.out.println(b);

    }

    public static int m1() {
        System.out.println(
                "here inside the if statment return is executed if it is false then method return is executed.");
        if (true) {
            return 2;
        }
        return 3;
    }

    public static int m2() {
        System.out.println("here method  return executed if it is true  then if  return is executed.");
        if (false) {
            return 2;
        }
        return 3;
    }
}
