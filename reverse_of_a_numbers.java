import java.util.*;
class reverseinteger
{
public static void main(String[] args)
{
Scanner sc= new Scanner(System.in);
int n,c;
n=sc.nextInt();
while(n>0)
{
    c=n%10;
    System.out.print(c);
    n=n/10;
}
}
}