import java.util.*;
public class Gcf {
    public static void main(String[] args) {
            System.out.print("Enter a number:");
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            int temp1=x;
            System.out.print("Enter second number:");
            int y= sc.nextInt();
            int temp=y;
            while(x!=y){
               if(x>y){
                x=x-y;
               }
               else{
                y=y-x;
               }
            }
            int lcm =(temp1*temp)/x;
            System.out.println("Gcf is :"+x);
            System.out.println("lcm is:"+lcm);

    }
}
