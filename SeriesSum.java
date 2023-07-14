import java.util.*;
public class SeriesSum {
        public static void main(String[] args) {
            double i ;
            double sum=0.0;
            Scanner sc = new  Scanner(System.in);
            System.out.print("Enter a number:");
            int n = sc.nextInt();
            for ( i = 1; i <= n; i++) {
                sum=sum+1/i;   
            }
            System.out.println("sum is:"+sum);
        }
}
