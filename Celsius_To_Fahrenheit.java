import java.util.*;
class celsius
{
    public static void main(String[] args)
    {
        int C;
        float F;
        
        Scanner sc = new Scanner(System.in);
        C=sc.nextInt();
        
        F=(float)(9*C)/5+32;
        System.out.printf("%.2f",F);
    }
}