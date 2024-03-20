import java.util.*;
class LikeFibo
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a digit:");
        int n=sc.nextInt();

        int a=0,b=1,c=1,d;
        for(int i=1;i<=n;i++)
        {
            System.out.println(a);
            d=a+b+c;
            a=b;
            b=c;
            c=d;
        }
    }
}