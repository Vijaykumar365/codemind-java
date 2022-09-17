import java.util.*;
class array3 {
    public static boolean isprime(int n)
    {
        int cnt=0;
        if(n<2)
        return false;
       for(int i=2;i<=(int)Math.sqrt(n);i++)
       {
         if(n%i==0)
         cnt++;
       }
       if(cnt==0)
       return true;
       else
       return false;
    }
    public static void main(String[] args) {
   Scanner sc = new Scanner(System.in); 
   int x[],n,m,cnt=0;
   n = sc.nextInt();
   x =new int[n];
   
   for( int i=0;i<n;i++)
   {
    x[i]=sc.nextInt();

   }
   m=sc.nextInt();
   
    for(int i=0;i<n;i++)
    {
     if(isprime(x[i]))
     {
         if(x[i]>=m)
            cnt++;
     }
        
    }
    System.out.print((cnt));
}
}