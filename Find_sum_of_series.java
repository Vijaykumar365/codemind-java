import java.util.Scanner;
class root
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int n;
		float i;
		n = sc.nextInt();
		float sum=0;
		for(i=1;i<=n;i++)
		{
		    sum=sum+(1/i);
	
		}
	    System.out.format("%.2f",sum);
	}
	
}