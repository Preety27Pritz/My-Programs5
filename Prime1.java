import java.util.Scanner;
class Prime1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();

		boolean flag=true;
		if(n>1)
		{
			for(int i=2;i<=n/2;i++)
			{
				if(n%i==0)
				{
					flag=false;
					System.out.println("Not prime");
					break;
				}
			}
			if (flag) System.out.println("Prime");
		}
		else
		{
			System.out.println("Not prime");
		}
	}
}