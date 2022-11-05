import java.util.*;
class Spynumber
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int pro=1;
        int sum=0;
        while (x>0)
        {
            sum+=x%10;
            pro=pro*x%10;
            x=x/10;
        }
        if(sum==pro)
        System.out.println("Spy Number");
        else
        System.out.println("Not Spy Number");
    }
}