import java.util.*;
public class SumDigit {
    public static void main(String[] args) {
    int sum =0;
    System.out.print("Enter a number:");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int temp = n;
    while(n!=0){
        int rem=n%10;
        sum=sum+rem;
        n=n/10;
    }
      if(temp%sum==0){
        System.out.println("divisible");
      }
      else{
        System.out.println("not Divisible");
      }

    }
}
