import java.util.Scanner;
class Palindrome123
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();

        int rev=0;
        int m=n;

        while(n>0)
        {
            int rem=n%10;rev=rev*10+rem;
            n=n/10;
        }
        if(m==rev) System.out.println(m+" is a palindrome number");
        else System.out.println(m+" is not a palindrome number");
    }
}