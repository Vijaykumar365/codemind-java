import java.util.*;
class first
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        long n =in.nextLong();
        int c = 0;
        for(int i=2;i*i<n;i++)
        {
            if(prime(i))
            c++;
            
        }
        System.out.println(c);
    }
    static boolean prime(long n)
    {
        if(n <=1)return false;
        long i = 2;
        while(i*i <=n)
        {
            if(n % i ==0)return false;
            i++;
        }return true;
    }
}