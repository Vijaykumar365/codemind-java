import java.util.*;


class sample
{
    public static boolean palindrome(int x)
    {
        int r=x;
        int t,rev=0;
        while(x>0)
        {
            t=x%10;
            rev=rev*10+t;
            x=x/10;
            
        }
        return rev==r;
        
    }
    public static int near(int x)
    {
        if(palindrome(x)) x-=1;
        while (palindrome(x)!=true)
        x=x-1;
        return x;
        
    }
    public static int far(int x)
    {
        if (palindrome(x))x+=1;
        while(palindrome(x)!=true)
        x=x+1;
        return x;
        
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a;
        a=sc.nextInt();
        int n=near(a);
        int m=far(a);
        if((a-n)<(m-a))
        System.out.println(n);
        else if((a-n)>(m-a))
        System.out.println(m);
        else
        System.out.println(n+" "+m);
    }
}