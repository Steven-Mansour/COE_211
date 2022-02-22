public class Employee{

	private String first, last;
	
	private int age;
	
	private double monthlySalary;

	

	public Employee( String s1, String s2, int nb1, double nb2){

		first = s1;
		
		last = s2;

		age = nb1;

		monthlySalary = nb2;

	}


	public void setName(String s3){

	first = s3;

}

	public void setLastName(String s4){

	last = s4;

}

	public void setAge(int nb3){

	age = nb3;
}	

	public void setMonthlySalary(double nb5){
	
	monthlySalary = nb5;
}

	public String toString(){
	
	String output = first + " " + last + ", " + age + ", " + monthlySalary;

	return output;


}

}