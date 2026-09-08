import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("1.addition\n2.substraction\n3.multipliction\n4.division\n");
        System.out.println("select the option");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        System.out.println("Enter the values");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result;
        if (choice == 1) {
            result = a + b;
            System.out.println(result);
        } else if (choice == 2) {
            result = a - b;
            System.out.println(result);
        } else if (choice == 3) {
            result = a * b;
            System.out.println(result);
        } else if (choice == 4) {
            result = a / b;
            System.out.println(result);
        } else {
            System.out.println("Invalid operator");
        }
    }
}
