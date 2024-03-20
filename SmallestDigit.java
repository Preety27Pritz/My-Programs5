import java.util.*;
class SmallestDigit
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();

        int s=9;
        while(n>0)
        {
            int r=n%10;
            if(r<s) s=r;
            n=n/10;
        }
        System.out.println("Smallest digit in the number is : "+s);
    }
}