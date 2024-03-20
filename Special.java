import java.util.Scanner;
class Special
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no:");
        int n=sc.nextInt();

        int sum=0;
        int msum=1;
        int m=n;
        while(n>0)
        {
            int r=n%10;
            sum=sum+r;
            msum=msum*r;
            n=n/10;
        }
    if(sum==msum) System.out.println(m+" is special");
    else System.out.println(m+" is not special");
    }
}