import encapsulation.Encapsulation;

public class MainClass {
    public static void main(String args[]){
    /*person p1 =new person(); // new person call the constructor 
    p1.age=22;
    p1.name="kuldeep";*/

   // person p2 = new person();
   // p2.age=66;
    //p2.name="ram";

    //person p2 = new person(31,"ram" );
    
    //p1.eat();
    //p2.walk();
    //p2.walk(2);

    //Developer d1 = new Developer(23, "vipin");
   // d1.walk();
       Encapsulation obj = new Encapsulation();
       obj.doWork();
    }
    
}

// *****inheritence*****
 class Developer extends person{
       public Developer(int age ,String name){
         super(age,name); // **super ** keyword use to call the parent constructor 
       }
       void walk(){   // run time polymorpisum as it do not know where it get walk method
        System.out.println("developer "+name+ " is walking ");
       }
 }                                //extends keyword for inheritnce 
class person{
    String name ;
    int age;
    static int cout;   // static method help in calling without  creating the object
    public person(){   // default construtor 
        cout++;
        System.out.println(+cout);
    }

    /*public person(int newage ,String newname ){
        this();// calling one constructor from another
        age= newage;
        name= newname; 
    }*/
    public person(int age ,String name ){
       // this();// calling one constructor from another
        this.age= age; //this also used in calling the or acess present class variable 
        this.name= name; 
    }
void walk(){
    System.out.println(name+ " is walking");
}
 void eat(){
    System.out.println(name+ " is eating");
           }
 // compile time polymorpisum 
 void walk(int steps){
    System.out.println(name+ " is waking" +steps+ "steps");
 }
   }
///*****************abstraction ****************** */
/* IN abstraction id also is data hiding but wen do not hide the data from the user for security reason but for the reduce the complexity 
   ->the abstraction is achived by two ways :
   1. using abstract class 
   2. inference 
*/