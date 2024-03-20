import java.util.*;
class XylemPhloem
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        int endsum=0;
        int midsum=0;
        int m=n;

        while(n>0){
            int r=n%10;
            if(n==m || n<10) endsum=endsum+r;
            else midsum=midsum+r;
            n=n/10;
        }
        if(endsum==midsum) System.out.println(m+" is Xylem");
        else System.out.println(m+" is Phloem");
    }
}