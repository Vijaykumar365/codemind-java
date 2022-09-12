import java.util.*;
class lcm
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a,b,max,l;
        a=sc.nextInt();
        b=sc.nextInt();
        if (a>=b)
        max=a;
        else
        max=b;
        for(int i=max;;i+=1)
        {
            if(i%a==0&&i%b==0)
            {
                l=i;
                break;
            }
            
        }
         System.out.println(l);
    }
}