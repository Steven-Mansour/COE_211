import java.util.Scanner;

public class Calculator {
    private int num1;
    private int num2;
	private double c;
    private String operator;

    // Constructor to initialize the calculator
    public Calculator() {
        // Get user input
        Scanner scanCalc = new Scanner(System.in);
       
	System.out.println("Enter the first number: ");
	num1 = scanCalc.nextInt(); 
	scanCalc.nextLine();

	System.out.println("Enter the operator : ");
	operator = scanCalc.nextLine();

	System.out.println("Enter the second number: ");
	num2 = scanCalc.nextInt();

        
	switch(operator){
	case "+":
		
		System.out.println(add(num1, num2));
		break;
	case "-":
		
		System.out.println(subtract(num1, num2));
		break;
	case "*":
		
		System.out.println(multiply(num1, num2));
		break;
	case "/":
		
		System.out.println(divide(num1, num2));
		break;
	default: 
		break;
	
    }
}

    public String add(int a, int b) {
	
        	
	 c = a + b ;
	String s1 = ""+ a + " + " + b + " = " + c;	
	return s1 ;
    }

    public String subtract(int a, int b ) {

	
         c = a - b;
	String s2 = "" + a + " - " + b + " = " + c;
	return s2;
    }

    public String multiply(int a, int b ) {
	
	
	 c = a * b;
	String s3 = "" + a + " x " + b + " = " + c;
	return s3;
        
    }

    public String divide(int a, int b ) {
	
	
	 c =(double) a / b;
	String s4 = "" + a + " / " + b + " = " + c;
	return s4;
        
    }
}