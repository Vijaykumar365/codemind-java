import java.util.*;
class sample
{
    public static boolean isprime(int n)
    {
        int count=0;
        for (int i=2;i<=(int)Math.sqrt(n);i++)
        {
            if (n%i==0)
            count++;
            
        }
        if (count==0)
        return true;
        else
         return false;
    }
    
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
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m,i;
        m=sc.nextInt();
        for(i=m+1;;i++)
        {
            if(isprime(i) && palindrome(i))
            {
                System.out.println(i);
                break;
            }
        }
    }
}