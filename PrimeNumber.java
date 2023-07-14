import java.util.*;
public class PrimeNumber {
    public static void main(String[] args) {
    System.out.print("Enter a number:");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if(n==1){
    System.out.println("Not Prime");
    }
     if(n==2||n==3){
        System.out.println("Prime");
    }
     if(n%2==0||n%3==0){
     System.out.println("Not Prime ");
      }
     for(int i =5;i*i<=n;i=i+6){
        if(n%i==0 || n% (i+1)==0){
            System.out.println("Not Prime");
            return;
        }
     }
     System.out.println("prime Number");
    }
}
