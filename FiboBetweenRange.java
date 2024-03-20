import java.util.Scanner;
class FiboBetweenRange
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range upto which you want to print the series:");
		int n=sc.nextInt();
		int m=sc.nextInt();

		int a=0,b=1,c;
		for(;a<=m;)  
		{
			if(a>=n) System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
		}
	}
}	