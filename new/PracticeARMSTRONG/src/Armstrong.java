import java.util.Scanner;
public class Armstrong {

	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of n:");
		int n=sc.nextInt();
		int sum = 0;
		int t=n;
		while(n>0)
		{
			int r=n%10;
			sum=sum+(r*r*r);
			n=n/10;
		}
		
		if(sum==t)
			System.out.println("armstrong");
		else
			System.out.println("not armstrong");
		
	
	}
}
