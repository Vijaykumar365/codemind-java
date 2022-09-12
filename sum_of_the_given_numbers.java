import java.util.*;
class given
{
    public static void main(String args[])
    {
        int n;
        Scanner sc= new Scanner(System.in);
        n = sc.nextInt();
        while(n>0)
        {
            int n1,n2;
            n1=sc.nextInt();
            n2=sc.nextInt();
            int sum= n1+n2;
            System.out.println(sum);
            n=n-1;
        }
    }
}