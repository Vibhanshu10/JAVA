import java.util.*;
public class ReverseNumber {
    public static void main(String[] args) {
    int reverse = 0;
    System.out.print("Enter a number :");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    while(n!=0){
        int rem = n%10;
        reverse = reverse*10+rem;
        n=n/10;
    }
    System.out.println("reverse number is :"+reverse);

    }
}
