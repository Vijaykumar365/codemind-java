import java.util.*;
class fabinoci
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,a=0,b=1,c=0;
        n=sc.nextInt();
        
        while(c<=n)
        {
            c=a+b;
            a=b;
            b=c;
        }
        if((a==n)||(b==n))
        System.out.print("True");
        else
        System.out.print("False");
    }
}