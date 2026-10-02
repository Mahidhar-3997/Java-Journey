import java.util.Scanner;

public class PlindromeFull {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter a number :");
		int n =sc.nextInt();
		for(int i=1;i<=n;i++){
		    for(int j=1;j<=n/2-i+1;j++){
		        System.out.print(" ");
		    }
		    if(i<=n/2+1) {
		        for(int j=1;j<=i;j++){
		            System.out.print(j);
		        }
		        for(int j=i-1;j>=1;j--){
		            System.out.print(j);
		        }
		    }else{
		        for(int j=1;j<=(i-n/2)-1;j++){
		            System.out.print(" ");
		        }
		        for(int j=1;j<=n-i+1;j++){
		            System.out.print(j);
		            
		        }
		        for(int j=n-i;j>=1;j--){
		            System.out.print(j);
		        }
		    }
		    System.out.println();
		}
		sc.close();

	}

}
