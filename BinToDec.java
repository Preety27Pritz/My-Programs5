import java.util.*;
class BinToDec
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a decimal number:");
        int n=sc.nextInt();
        int ans=0;
        int pv=1;
        while(n>0){
            int r=n%10;
            ans=ans+r*pv;
            n=n/10;
            pv=pv*2;
        }
        System.out.println(ans);
    }
}