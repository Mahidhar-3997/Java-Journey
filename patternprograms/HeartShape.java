public HeartShape{
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = sc.nextInt();
		int m=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if((i==0&&j%3!=0)||(i==1&&j%3==0)||(i-j==2)||(i+j==8)){
					System.out.print("*"+" ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		sc.close();

	}

}