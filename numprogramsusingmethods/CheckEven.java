import java.util.Scanner;

public class CheckEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int i = sc.nextInt();
        boolean result = even(i);
        System.out.println(result);
        sc.close();

    }

    public static boolean even(int i) {
        if (i % 2 == 0) {
            return true;
        }
        return false;
    }
}
