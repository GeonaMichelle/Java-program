package prgm1;
//Create a class Employee
public class Employee { 
	String name;
	int id;
	double salary;
	Employee(String name,int id,double salary)
	{
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
//Display Employee Details
	void displayDetails()
{
		System.out.println("ID of the Employee:"+id);
		System.out.println("Name of the Employee:"+name);
		System.out.println("Salary of the Employee:"+salary);
		System.out.println("------------------------------------");
	}
//Method to increase the Salary
	void increaseSalary(double percentage)
	{
		double increment=(salary*percentage)/100;
		salary=salary+increment;
		System.out.println(name+"salary increased by"+percentage+"%");
	}
}