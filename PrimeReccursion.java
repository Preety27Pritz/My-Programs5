import java.util.*;
class PrimeReccursion
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();

        if(n<=1) System.out.println("Not a Prime Number");
        else if(isPrime(n,2)) System.out.println("Prime Number");
        else System.out.println("Not a Prime Number");
    }


    static boolean isPrime(int n,int i)
    {

        if(i==1 || i==2 || i>n/2) return true;
        else if(n%i==0) return false;


        return isPrime(n,i+1);       
    }
}