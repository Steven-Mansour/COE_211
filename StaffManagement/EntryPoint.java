import java.util.Scanner;

public class EntryPoint{

	public static void main(String[] args){

	Employee employee1 = new Employee( "", "", 0, 0);
	
	Scanner scan = new Scanner(System.in);

	String s1, s2;

	int employeesAge;
	
	double employeesSalary;

	System.out.println("please input the employee's first name");
	
	s1 = scan.nextLine();

	System.out.println("please input the employee's last name");
	
	s2 = scan.nextLine();

	System.out.println("please input the employee's age");

	employeesAge = scan.nextInt();
	
	System.out.println("please input the employee's monthly salary");

	employeesSalary = scan.nextDouble();


	employee1.setName(s1);
	employee1.setLastName(s2);
	employee1.setAge(employeesAge);
	employee1.setMonthlySalary(employeesSalary);

	System.out.println("Employee information: " + employee1);

	
	
	}

}