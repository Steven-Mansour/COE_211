import java.util.Scanner;
import java.text.DecimalFormat;

public class Lab9 {
    public static void main(String[] args) {

	DecimalFormat fmt = new DecimalFormat("0.##");

	Scanner scan = new Scanner(System.in);

	double finalAssignment = 0;

	int maxAttendance = 7;
      
	int[] assignment = new int[5];  // Initialize array of integer

	int idx = 0;

	int a;

      	for(idx = 0; idx < 5 ; idx++){ // for loop to get user input & store in array

		System.out.println("Input the grade for assignment " + (idx + 1));
		a = scan.nextInt();

		assignment[idx] = a;


		}


	System.out.println("Input the number of attended labs");
	double attendance = scan.nextDouble();

	System.out.println("Input the midterm grade");
	double midterm = scan.nextDouble();


		for (int idx2 = 0 ; idx2 < 5 ; idx2++){// for loop to iterate over the array & perform calculations

		finalAssignment += assignment[idx2];



	}


	finalAssignment /= (double) assignment.length;
	finalAssignment *=  0.3;

	attendance = attendance * 100 *0.05 /maxAttendance;

	midterm *= 0.3;

        // display output to user


	System.out.println("Assignments (30%): " + fmt.format(finalAssignment));
	System.out.println("Attendance (5%): " + fmt.format(attendance));
	System.out.println("Midterm (30%): " + fmt.format(midterm));
    }
}