import java.util.*;
class hcf
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,h=0;
        n=sc.nextInt();
        int x[]=new int[n];
        for(int i=0;i<n;i++)
        {
            int a;
            a=sc.nextInt();
            x[i]=a;
            if (a>h)
                h=a;
        }
        for(int j=1;;j++)
        {
            int m=h*j,c=0;
            for(int z=0;z<n;z++)
            {
                if (m%x[z]==0)
                    c+=1;
            }
            if (c==n)
            {
                System.out.println(m);
                break;
            }
        }
        
    }
}