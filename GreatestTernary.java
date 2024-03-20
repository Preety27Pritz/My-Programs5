class GreatestTernary
{
    public static void main(String args[])
    {
        int a=20;
        int b=10;
        int c=90;
        int large;
        large=((a>b)?(a>c)?a:c:(b>c)?b:c);
        System.out.println(large);
    }
}