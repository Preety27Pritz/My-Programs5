import java.util.*;
class Automorphic
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();

        int s=n*n;
        int m=n;
        int count=0;
        while(n>0)
        {
            n=n/10;
            count++;
        }
        int ld=s%(int)Math.pow(10,count);
        if(m==ld) System.out.println(m+" is Automorphic");
        else System.out.println(m+" is not Automorphic");
    }
}