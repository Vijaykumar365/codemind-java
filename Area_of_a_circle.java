import java.util.*;
class Circle
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        double a=3.14;
        double area=a*x*x;
        System.out.printf("%.2f",area);
    }
}