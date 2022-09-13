import java.util.Scanner;
class Prime
{
  public static boolean prime(int n)
  {
     int count=0;
	 for(int i=2;i<=(int)Math.sqrt(n);i++)
	 {
	    if(n%i==0)
		  count++;
	 }
	 if(count==0)
	    return true;
	 else
	    return false;
  }
   public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);
	 int n1,n2,i,cnt=0;
        n1= sc.nextInt();
        n2=sc.nextInt();
    if(n1==1)
    n1=2;
    for(i=n1;i<=n2;i++)
    {
        if(prime(i))
            cnt++;
    }
    System.out.print(cnt);
  }
  
}