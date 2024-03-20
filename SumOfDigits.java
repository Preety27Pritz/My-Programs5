import java.util.*;
class SumOfDigits
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();

        do{
            int sum=0;
            while(n>0)
            {
                int rem=n%10;
                sum=sum+rem;
                n=n/10;
            }
            n=sum;
        } while(n>9);
        System.out.println(n);
    }
}
