import java.util.Scanner;
class sma{
    public static int factorial(int x)
    {
        int r,sum=0;
         r= (int)x/2;
         for (int i=1;i<x;i++)
         {
             if (x%i==0)
             {
                 sum=sum+i;
                 
             }
         }
         return sum;
        
    }
    public static void main(String args[])
    {
      Scanner sc= new Scanner(System.in);
      int n;
      n = sc.nextInt();
      int c = factorial(n);
      if(c==n)
      System.out.println("True");
      else
      System.out.println("False");
      
    }
}