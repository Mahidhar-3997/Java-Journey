
import java.util.Scanner;

public class NumbersInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range :");
        int st = sc.nextInt();
        int end = sc.nextInt();
        range(st, end);
        sc.close();

    }

    public static void range(int st, int end) {
        if (st > end) {
            return;
        }
        System.out.println(st);
        range(st + 1, end);
    }

}
