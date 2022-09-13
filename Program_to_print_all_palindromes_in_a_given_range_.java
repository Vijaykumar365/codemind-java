import java.util.*;
class Demo
{
    public static boolean palindrome(int n)
    {
        int p=n;
        int r,rev=0;
        while(n>0)
        {
            r=n%10;
            rev=rev*10+r;
            n=n/10;
            
        }
        if (p==rev)
        return true;
        else
        return false;
        
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n,m,i;
        m=sc.nextInt();
        n=sc.nextInt();
        for(i=m;i<=n;i++)
        {
            if(palindrome(i))
            {
            System.out.print(i+" ");
            }
        }
    }
    }
       