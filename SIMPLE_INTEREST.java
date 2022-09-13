import java.util.*;
class intrest
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int p,t,r,se=0;
        p=sc.nextInt();
        t=sc.nextInt();
        r=sc.nextInt();
        se=((p*t*r)/100);
        System.out.println(se);
    }
}       