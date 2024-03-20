import java.util.Scanner;
class Armstrong
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();

		int num=n;
		int count=0;
		while(n>0)
		{
			count++;
			n=n/10;
		}
		n=num;
		int sum=0;
		while(n>0)
		{
			int r=n%10;
			int prod=0;
			prod=prod+(int)Math.pow(r,count);
			sum=sum+prod;
			n=n/10;
		}
		
		if(sum==num) System.out.println(num+" is a Armstrong no");
		else System.out.println(num+" is Not a Armstrong no");
	}
}
		