import java.util.*;
class FactOfEachDigit
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no:");
        int n=sc.nextInt();

        while(n>0)
        {
            int r=n%10;
            int num=r;
            int fact=1;

            for(int i=1;i<=num;i++)
            {
                fact=fact*i;
            }
            System.out.println(fact);
            n=n/10;
        }
    }
}