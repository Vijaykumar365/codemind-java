import java.util.*;
class pattern
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a;
        a=sc.nextInt();
        for(int i=a;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
        {
        
        System.out.print(j);
            
        }
        System.out.println();
        }
    }
}