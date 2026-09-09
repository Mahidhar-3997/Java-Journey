import java.util.Scanner;

public class TriangleType {
    public static void main(String[] args) {
        System.out.println("Enter the values");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a == b && b == c) {
            System.out.println("Equilateral triangle");
        } else if (a == b || b == c || a == c) {
            System.out.println("isosceles triangel");
        } else {
            System.out.println("scalene triangel");
        }
    }
}
