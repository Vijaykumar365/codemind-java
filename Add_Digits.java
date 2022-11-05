import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int code=sc.nextInt();
        int sum=0;
        while (code>0 || sum>9){  
            if(code==0){
            code=sum;
            sum=0;
            }
            sum+=code%10;
            code=code/10;
        }
        System.out.println(sum);
    }
}