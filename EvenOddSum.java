import java.util.Scanner;

class EvenOddSum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no:");
        int n=sc.nextInt();
        
        int esum=0;
        int osum=0;
        int sum=0;

        while(n>0)
        {
            int r=n%10;
            if(r%2==0)
            {
                esum=esum+r;
            }
            else
            {
                osum=osum+r;
            }
            n=n/10;
        }
        System.out.println(esum);
        System.out.println(osum);
    }
}