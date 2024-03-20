import java.util.*;
class GreatestDigit
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();

        int l=0;
        while(n>0)
        {
            int r=n%10;
            if(r>l) l=r;
            n=n/10;
        }
        System.out.println("Greatest digit in the number is : "+l);
    }
}