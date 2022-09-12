import java.util.Scanner;
class aaa
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
       int n = sc.nextInt();
       int pr=1,sum=0;
       while(n>0)
       {
           int r = n%10;
           sum=sum+r;
           pr = pr*r;
           n = n/10;
          
       }
         System.out.println(pr-sum);
    }
}