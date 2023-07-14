import java.util.*;

class Emp_Leave
{
    Scanner sc = new Scanner(System.in);
    int empno;
    String empname;
    int leaves = 12;
    double basic;
    double total;
    double perday;

    int setdetails()
    {
        System.out.print("Enter employee number : ");
        empno = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter employee name : ");
        empname = sc.nextLine();
        System.out.print("Enter employee basic salary : ");
        basic = sc.nextDouble();
        total = (1.2+0.2)*basic + basic;
        perday = this.total/30;
        System.out.println();
        return empno;
    }
}

public class Pro{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Emp_Leave[] emparray = new Emp_Leave[101];
        System.out.println("*** WELCOME TO EMPLOYEE MANAGEMENT SYSTEM ***");

        while(true)
        {
            System.out.println("\nPress 1 for inputing employee record");
            System.out.println("Press 2 for granting leave (if available)");
            System.out.println("Press 3 for granting leave without pay ");
            System.out.println("Press 4 for displaying employee details ");
            System.out.println("Press 5 to EXIT \n");
            System.out.print("Choose any option : ");
            int key = sc.nextInt();
            System.out.println();
            switch (key)
            {
                case 1:
                {
                    System.out.print("Enter total number of inputs : ");
                    int inputs = sc.nextInt();
                    System.out.println();
                    while(inputs-->0)
                    {
                        Emp_Leave emp = new Emp_Leave();
                        emparray[emp.setdetails()] = emp;
                    }
                    break;
                }
                case 2:
                {
                    System.out.print("Enter Employee id : ");
                    int id = sc.nextInt();
                    if(emparray[id].leaves>0)
                        System.out.println("Your leave has been marked");
                    else
                        System.out.println("You have no leaves left");
                    break;
                }
                case 3:
                {
                    System.out.println("Enter employee id : ");
                    int id = sc.nextInt();
                    emparray[id].total -= emparray[id].perday;
                    System.out.println("Your leave has been marked");
                    break; 
                }
                case 4:
                {
                    for(int i=1;i<emparray.length;i++)
                        if(emparray[i]!=null)
                            System.out.println("Employee id : " + emparray[i].empno + "    " + "Employee name : " + emparray[i].empname + "    " + "Employee total salary : " + emparray[i].total + " Rs.");
                    break;
                }
                case 5:
                {
                    System.out.println("** Thanks for using this system **");
                    break;
                }
                default:
                {
                    System.out.println("Please enter correct input");
                }
            }
        }
    }
}