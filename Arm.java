import java.util.*;
class Arm
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int count=0;
        int sum=0;
        int num=n;
        while(n>0){
            n=n/10;
            count++;
        }
        n=num;
        while(n>0){
            int r=n%10;
            int prod=1;
            for(int i=1;i<=count;i++){
                prod=prod*r;
            }
            sum=sum+prod;
            n=n/10;
        }
        if(sum==num) System.out.println(num+" is a armstrong number");
        else System.out.println(num+" is not a armstrong number");

    }
}