import java.util.Scanner;
class Palindrome
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No.:");
		int n=sc.nextInt();
		
		int temp=0;
		if(n==isPalindrome(n,temp))
		{
			 System.out.println("Palindrome");
		}
		else
		{
			 System.out.println("Not Palindrome");
		}
	}			

		static int isPalindrome(int n,int temp)
		{
			if(n==0) return temp;
			temp=(temp*10)+(n%10);
			return isPalindrome(n/10,temp);
		}
}

















		