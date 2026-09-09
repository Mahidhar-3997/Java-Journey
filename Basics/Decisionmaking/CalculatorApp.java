import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        System.out.println("1.addition\n2.substraction\n3.multiplication\n4.division");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = sc.nextInt();
        System.out.println("Eneter the second number:");
        int b = sc.nextInt();
        System.out.println("Select the option:");
        int option = sc.nextInt();
        int c = 0;
        switch (option) {
            case 1:
                c = a + b;
                System.out.println(c);
                break;
            case 2:
                c = a - b;
                System.out.println(c);
                break;
            case 3:
                c = a * b;
                System.out.println(c);
                break;
            case 4:
                c = a / b;
                System.out.println(c);
            default:
                System.out.println("invalid operation");
        }
    }
}
