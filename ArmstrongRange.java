import java.util.Scanner;
class ArmstrongRange
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range:");
		int a=sc.nextInt();
		int b=sc.nextInt();

		for(int i=a;i<=b;i++)
		{
			int n=i;
			int count=0;
			while(n>0)
			{
				count++;
				n=n/10;
			}
			n=i;
			int sum=0;
			while(n>0)
			{
				int digit=n%10;
				int prod=1;
				for(int j=1;j<=count;j++) prod=prod*digit;
				sum=sum+prod;
				n=n/10;
			}
		
			if(sum==i) System.out.println(i);
		}
	}
}
		