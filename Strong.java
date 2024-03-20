import java.util.Scanner;
class Strong
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();

		int rem,sum=0;
		int num=n;
		while(n>0)
		{
			int fact=1;
			rem=n%10;
			for(int i=1;i<=rem;i++)
			{
				fact=fact*i;
			}
			sum=sum+fact;
			n=n/10;
		}
		if(num==sum) 
		{
			System.out.println("Strong no");
		}
		else
		{
			System.out.println("Not a Strong no");
		}
	}	
}