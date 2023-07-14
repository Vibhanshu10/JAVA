package encapsulation;

public class Encapsulation{   // process of hiding the data
    public static void main(String[] args) {
        Laptop l1 = new Laptop();
        l1.setprice(23);
    }
}

       class Laptop {
        int ram;
       private  int price; // if it is private we can unable to access it outside the class 
       public void setprice(int price ){
        boolean Admin =false;
        if(!Admin){
            System.out.println("you cannot see the price ");
        }
        else{
        this.price =price ;
        }

       }
    }
    /*  public void doWork(){       // using public modifier we can access the method outside the pakage 
    System.out.println("working working ");
    }*/

   /*  private void doWork(){ // using private access  modifier we can access the method within  the class 
        System.out.println("working working ");
   }*/

   // proceted acesss modifer method of parent class applicable on only their child .

