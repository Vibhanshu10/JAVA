import java.util.*;
public class Seed {
    /**
     * @param args
     */
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("enter the first number :");
     int n = sc.nextInt();
     int temp = n;
     System.out.print("enter the second number :");
     int n1 = sc.nextInt();
     while(n!=0){
        int rem=n%10;
       temp=temp*rem;
        n=n/10;
     }
        if(temp==n1){
            System.out.print("seed");
        }
        else{
            System.out.println("not seed");
        }
        

    }

    
}
