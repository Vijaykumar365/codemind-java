import java.util.*;
class sample
{
    static int divisor(int m)
    {
        int sum=0;
        for(int i=1;i<=(m/2);i++)
        {
            if(m%i==0)
            sum+=i;
        }
        return sum;
        }
        public static void main(String[] args)
        {
            Scanner sc= new Scanner(System.in);
            int n,v;
            n=sc.nextInt();
            v=sc.nextInt();
            if((divisor(n))==v)
            System.out.println("Amicable");
            else
            System.out.println("Not Amicable");
        }
    }
    
