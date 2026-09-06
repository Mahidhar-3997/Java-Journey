import java.util.Scanner;

public class AgeAndWeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the weight");
        int weight = sc.nextInt();
        System.out.println("enter the age");
        int age = sc.nextInt();
        String result = weight >= 40 ? age >= 18 ? "pefect height and weight" : "age is less" : "under weight";
        System.out.println("result : " + result);
    }
}
/*
 * Scanner class:
 *
 * Scanner is a predefined class in Java used to read input from the user.
 * It is available in the java.util package.
 *
 * To use Scanner, we need to import it:
 * import java.util.Scanner;
 *
 * Scanner can read different types of input such as:
 * int, float, double, long, String, char, etc.
 *
 * Common Scanner methods:
 * nextInt() -> reads an integer
 * nextFloat() -> reads a float
 * nextDouble() -> reads a double
 * nextLong() -> reads a long value
 * next() -> reads a single word
 * nextLine() -> reads a complete line
 *
 * Example:
 * Scanner sc = new Scanner(System.in);
 * int age = sc.nextInt();
 *
 * System.in is used to receive input from the keyboard.
 */
