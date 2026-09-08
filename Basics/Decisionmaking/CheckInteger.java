import java.util.Scanner;

public class CheckInteger {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number > 0) {
            System.out.println("the number is positive");
        } else if (number == 0) {
            System.out.println("zero");
        } else {
            System.out.println("the number is negative");
        }

    }
}
