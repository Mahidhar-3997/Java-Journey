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
