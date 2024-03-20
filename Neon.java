import java.util.Scanner;

class Neon
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no:");
        int n=sc.nextInt();

        int s=n*n;
        int sum=0;
        while(s>0)
        {
            int r=s%10;
            sum=sum+r;
            s=s/10;
        }
        if(sum==n) System.out.println(n+ " is a neon number");
        else  System.out.println(n+ " is not a neon number");
    }
}