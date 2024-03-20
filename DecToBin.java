import java.util.*;
class DecToBin
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a decimal number:");
        int n=sc.nextInt();
        int ans=0;
        int pv=1;
        while(n>0){
            int r=n%2;
            ans=ans+r*pv;
            n=n/2;
            pv=pv*10;
        }
        System.out.println(ans);
    }
}