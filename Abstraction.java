public class Abstraction {
    public static void main(String[] args) {
        Audi c1 = new Audi();
        c1.start();
        BMW c2 = new BMW();
        c2.start();
    }
}

 abstract class Car{
    String brand;
    int price;
    abstract void start();// abstract method do not consists the definations;
    //System.out.println("car is starting");
}
class Audi extends Car{
    void start(){
      System.out.println("Audi is Starting ");
    }
}
class BMW extends Car{
      void start(){ // metod override 
        System.out.println("BMW is starting ");
      }
}

