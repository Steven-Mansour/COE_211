import java.util.Scanner;

public class EntryPoint {
    public static void main (String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	String temp; //for the bonus
	do{
	
	System.out.println("Which service would you like to use? \n"
			+ "[1]: Basic week visualizer \n"
			+ "[2]: Advanced week visualizer \n"
			+ "[3]: Basic calculator \n"
			+ "[4]: Employee reprtoire");
		int a = scan.nextInt();
//bonus 2:
	
	while( a != 0 &&  a != 1 && a != 2 && a != 3 && a !=4){
		System.out.println("please make sure you pick a number between 1 and 4");
		System.out.println("Which service would you like to use? \n"
			+ "[1]: Basic week visualizer \n"
			+ "[2]: Advanced week visualizer \n"
			+ "[3]: Basic calculator \n"
			+ "[4]: Employee reprtoire"); 
		 a = scan.nextInt();

	 
		}
	
	
	switch(a){
	
	case 1: 
		BasicWeek week1 = new BasicWeek();
		week1.printDays();
		break;
	case 2:
		AdvancedWeek week2 = new AdvancedWeek();
		week2.printDays();
		break;
	case 3:
		Calculator calc = new Calculator();
		break;
	case 4: 
		Employee employee = new Employee();
		System.out.println(employee);
	default: break;
}
	scan.nextLine();
	
	//bonus 1:
	
	
	do{
	System.out.println("Would you like to perform another operation? (y/n) ");
	 temp = scan.nextLine();
	
	}while(!temp.equals("y") && !temp.equals("n"));

	

		

	
	}while(temp.equals("y"));

	}

}



	



   
