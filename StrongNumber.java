import java.util.Scanner;

class StrongNumber
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no:");
        int n=sc.nextInt();

        int m=n;
        int sum=0;
        while(n>0)
        {
            int r=n%10;
            int num=r;
            int fact=1;

            for(int i=1;i<=num;i++)
            {
                fact=fact*i;
            }
            sum=sum+ fact;
            n=n/10;
        }
        if(sum==m) System.out.println(m+" is a Strong Number");
        else System.out.println(m+" is not a Strong number");
    }
}