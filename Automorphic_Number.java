import java.util.*;
class number
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,c,d;double r;
        n=sc.nextInt();
        d=(int)Math.log10(n)+1;
        c=n*n;
        r=c%Math.pow(10,d);
        if(r==n)
        System.out.println("Automorphic Number");
        else
        System.out.println("Not an Automorphic Number");
    }
}
    