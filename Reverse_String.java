import java.util.Scanner;
class rs{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
        String[] vk=s.split(" ");
        for (int i=vk.length-1;i>=0;i--)
            System.out.print(vk[i]+" ");
    }
}