package Exercise_2;
import javax.swing.*;
import java.util.*;

public class Exercise_2 {
	// Exercise_2: Use Ints and Doubles,
	// use strings,
	// use math and String Operations,
	// and Show use of System in and out operations
	// and JOptionPane In and out statements.
	// Used http://docs.oracle.com/javase/tutorial/java/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x; // declare x as an integer
		double pi; // declare variable pi as a float
		
		// declare a new scanner to scan the input.
		Scanner scan1 = new Scanner(System.in);
		Random randomGenerator = new Random(); // start a new random number generator
		int randomInt = randomGenerator.nextInt(100000); // Declares a value that has 5 digits and is random.
		int randomInt2 = randomGenerator.nextInt(10); // declares a seccond rnadom to be added to the first
		int wh = 1; // declare wh as a check value
		
	
		while(true){ //run this code until the user input is correct and wh is then 1.
		int count = 6 - wh;
		System.out.println("Please verify identity: Tries remaining: " + count); // prints a line
		System.out.println("Please enter the sum of the numbers: " + randomInt + " + " + randomInt2 ); // prints a line
		
		//System.out.println(randomInt);
		//System.out.println(randomInt2);
		//System.out.println(randomInt + randomInt2);
		int y = randomInt + randomInt2;
		wh = wh++;
		
		
		x = scan1.nextInt(); // assign latest input to x
		System.out.println("Please enter that value of Pi to 4 decimal places (3.1415)");
		pi = scan1.nextFloat(); // assigns pi to a flat value entered by user
		if (pi == 3.1415 && x == y){
			
			System.out.println("Thank you. Your identity has been identified.");
			try{Thread.sleep(2000);}
			catch(Exception e){};
			break;
			}
		else{
			
			System.out.println("ERROR: YOUR IDENTITY COULD NOT BE DETERMINED. Please Try Again.");
			try{Thread.sleep(1200);}
			catch(Exception e){};
		}
		if(wh == 6){
			System.exit(1); //Found online at stackoverflow.com
		}
		}
		
			System.out.println("Welcome. Please follow the instructions on the next screen.");
			try{Thread.sleep(2000);}
			catch(Exception e){};

			//public jPane();
		
		
		
		scan1.close();
	}
	
}
