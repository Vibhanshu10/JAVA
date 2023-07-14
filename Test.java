import java.util.Scanner;
public class Test {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("ENTER STUDENT NAME : ");
String name = sc.nextLine();
System.out.println("ENTER ROLL NO. OF STUDENT :");
int roll_no = sc.nextInt();
Student st1 = new Student(roll_no , name);
System.out.println("ENTER JAVA MARKS OF "+name+" : ");
st1.setJava_score(sc.nextInt());
st1.setJava_score(95);
System.out.println("ENTER ENGLISH MARKS OF "+name+" :");
st1.setEng_score(sc.nextInt());
st1.setEng_score(92);
System.out.println("ENTER MATHS MARKS OF "+name+" : ");
st1.setMaths_score(sc.nextInt());
st1.setMaths_score(62);
st1.cal_percentage();
st1.cal_grade();
st1.print_data();
sc.close();
}
}