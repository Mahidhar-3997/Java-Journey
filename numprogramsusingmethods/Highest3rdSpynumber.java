public class Highest3rdSpynumber{
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range :");
		int st = sc.nextInt();
		int end = sc.nextInt();
		range(st,end);
		sc.close();

	}
	public static void range(int st ,int end) {
		int count =0;
		for(int i = end;i>=st;i--) {
			if(isSpy(i)) {
				count++;
				if(count ==3) {
					System.out.println(i);
					break;
				}
			}
		}
	}
	public static boolean isSpy(int n ) {
		int sum = 0;
		int prod = 1;
		while(n>0) {
			int rem = n%10;
			sum+=rem;
			prod*=rem;
			n/=10;
		}
		return sum == prod;
	}

}