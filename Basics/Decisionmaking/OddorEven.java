import java.util.Scanner;

public class OddorEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        if (a % 2 == 0) {
            System.out.println("the given number is Even");
        } else {
            System.out.println("the given number is Odd");
        }
    }
}
