import java.util.*;
class sample
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,y;
        n=sc.nextInt();
        int[] x=new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        y=sc.nextInt();
        int amt=0;
        for(int j=0;j<n;j++)
        {
            if(x[j]>y)
            {
                amt=amt+2;
                
            }
            else
            {
                amt=amt+1;
            }
        }
        System.out.println(amt);
    }
}