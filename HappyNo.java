import java.util.*;
class HappyNo
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
                int s=rem*rem;
                sum=sum+s;
                n=n/10;
            }
            n=sum;
        } while(n>9);
        if(n==1) System.out.println(n+" is a Happy no");
        else System.out.println(n+" is not a Happy no");
    }
}