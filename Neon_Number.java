import java.util.*;
class neonnumber
{
    public static int digit(int n)
    {
        int sum=0,d;
        int i=1;
        while (n>0)
        {
            d=n%10;
            n=n/10;
            sum+=d;
            i++;
        }
        return sum;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x,r;
        n=sc.nextInt();
        x=n*n;
        r=digit(x);
        if (n==r)
            System.out.println("Neon Number");
        else
            System.out.println("Not Neon Number");
    }
}