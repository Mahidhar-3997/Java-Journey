import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range :");
		int st = sc.nextInt();
		int end = sc.nextInt();
		range(st,end);
		sc.close();

	}
	public static void range(int st,int end) {
		int count =0;
		for(int i=st;i<=end;i++) {
			if(isArmstrong(i)) {
				count++;
				if(count%2!=0) {
					System.out.println(i);
				}
			}
		}
	}
	public static boolean isArmstrong(int n) {
		int temp = n;
		int count = 0;
		int sum = 0;
		while(temp>0) {
			temp/=10;
			count++;
		}
		temp= n;
		while(temp >0) {
			int rem = temp%10;
			int prod = 1;
			for(int i=1;i<=count;i++) {
				prod *=rem;
			}
			sum+=prod;
			temp/=10;
		}
		return sum==n;
		
	}

}
