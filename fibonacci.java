import java.util.*;
class sample
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,a=0,b=1,c,count=3;
        n=sc.nextInt();
        System.out.print(a+" "+b+" ");
        while(count<=n)
        {
            c=a+b;
            a=b;
            b=c;
            System.out.print(c+" ");
            count++;
            
        }
        sc.close();
    }
}