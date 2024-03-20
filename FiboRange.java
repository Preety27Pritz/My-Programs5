import java.util.Scanner;
class FiboRange
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range:");
		int n=sc.nextInt();
		int m=sc.nextInt();
		for(int i=n;i<=m;i++)
		System.out.println(fib(i)+" ");
	}
	
	
	static int fib(int n)
	{
        if(n==0)return 0;
		if(n==1) return 1;
		return fib(n-1) + fib(n-2);
	}
}