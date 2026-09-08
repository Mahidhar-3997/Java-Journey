import java.util.Scanner;

public class Character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("it is an uppercase");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println("it is an lowercase");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println("it is a digit");
        } else {
            System.out.println("it is a special character");
        }
    }
}
