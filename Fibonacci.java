  public class Fibonacci {
  public static void main(String[] args) {

    int n = 100, firstTerm = 0, secondTerm = 1;
        
    System.out.println("Fibonacci Series Upto " + n + ": ");
    
    while (firstTerm <= n) {
      if(firstTerm==0||firstTerm % 5!=0){
      System.out.print(firstTerm + ", ");
      }

      int nextTerm = firstTerm + secondTerm;
      firstTerm = secondTerm;
      secondTerm = nextTerm;

    }
  }
}