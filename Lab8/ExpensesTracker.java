import java.io.*;
  // Import the FileWriter class
  // Import the IOException class to handle errors
import java.util.Scanner;

public class ExpensesTracker{
  public static void main(String[] args) throws IOException{
      // Create FileWriter & Scanner objects & y/n string

	Scanner scan = new Scanner(System.in);
	FileWriter fw = new FileWriter(new File("Expenses.txt"));
	BufferedWriter bw = new BufferedWriter(fw);
      PrintWriter outToFile = new PrintWriter(bw);

	double amountPaid = 0;
	String objPurchased = "";
	String repeat;
	String name = "";
	String temp = "";


      // Start gathering information inside the loop you will start

	do{

 		System.out.println("Input your name: ");
            name = scan.nextLine();
            System.out.println("What did you purchase?");
            objPurchased = scan.nextLine();
            System.out.println("How much did you pay ? (in USD)");
            amountPaid = scan.nextDouble();

		scan.nextLine();

		temp = name + " purchased " + objPurchased + " for " + amountPaid

			+ " US Dollars " ;

		
		outToFile.println(temp);



			System.out.println("Would you like to log another purchase? (y/n)");
            	repeat = scan.nextLine();


        } while (repeat.equals("y"));


	
		
			
        	 System.out.println("Get off of ZoodMall!");
       	 System.out.println("Would you like to read a summary of your purchases? (y/n)");
       	 String temp2 = scan.nextLine();
       	 scan.close();
       	 outToFile.close();

      // Close ClassWriter & Scanner objects



		  	 if (temp2.equals("y")) {
                         Scanner fileScan = new Scanner(new File("Expenses.txt"));
                         String summary;
                            while (fileScan.hasNext()) {
                                        summary = fileScan.nextLine();
                                        System.out.println(summary);
                               }

		

		

			}

	


        
        
      
  }
}