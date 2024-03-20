import java.util.Scanner;
class T2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Range:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		for(int i=a;i<=b;i++)
		{
			if(isStrong(i)) System.out.println(i);
		}
	}
	static boolean isStrong(int n)
	{
		int sum=0;
		int num=n;
		
		while(n>0)
		{
			sum+=(fact(n%10));
			n/=10;
		}
		return sum==num;
	}
	static int fact(int n)
	{
		int prod=1;
		for(int i=1;i<=n;i++) prod*=i;
		return prod;
	}
}