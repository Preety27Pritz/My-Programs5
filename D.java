import java.util.Scanner;
class D
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size:");
		int n=sc.nextInt();

		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=n;k>=i;k--)
			{
				System.out.print("*");
			}
			for(int l=3;l>=i;l--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
	