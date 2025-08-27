package prgm1;
//Main class
public class Main {
public static void main(String[]args)
{
Employee e1=new Employee("Geona",101,50000);
Employee e2=new Employee("Michelle",102,80000);
//Displaying the Employee Details
System.out.println("First Employee Details:");

e1.displayDetails();
e2.displayDetails();
//Increase the salary 
e1.increaseSalary(10);
e2.increaseSalary(15);
//Display the updated result
System.out.println("Updated Details of Employee");
e1.displayDetails();
e2.displayDetails();
}
}