import java.util.*;
class StrongP
{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number:");
    int n=sc.nextInt();
    int num=n;
    int sum=0;
   
    while(n>0)
    {
        int r=n%10;
        int fact=1;
        for(int i=1;i<=r;i++)
        {
            fact=fact*i;
        }
        n=n/10;
        sum=sum+fact;
    }
    if(sum==num) System.out.println(num+" is a strong number");
    else System.out.println(num+" is not a strong number");
    }
}
