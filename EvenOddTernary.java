import java.util.*;
class EvenOddTernary
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();

        String result=(n%2==0)?"even":"odd";
        System.out.println(result);
    }
}