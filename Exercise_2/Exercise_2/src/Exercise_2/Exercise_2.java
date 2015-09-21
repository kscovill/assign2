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
		
		String password;
		int x; // declare x as an integer
		float f; // declare variable pi as a float
		
		// declare a new scanner to scan the input.
		Scanner scan1 = new Scanner(System.in);
		Random randomGenerator = new Random(); // start a new random number generator
		int randomInt = randomGenerator.nextInt(100000); // Declares a value that has 5 digits and is random.
		int randomInt2 = randomGenerator.nextInt(10); // declares a second random to be added to the first
		float randF = randomGenerator.nextFloat();
		
		
	
		while(true){ //run this code until the user input is correct
		System.out.println("Please verify identity"); // prints a line
		System.out.println("Please enter the sum of the numbers: " + randomInt + " + " + randomInt2 ); // prints a line
		
		//System.out.println(randomInt);
		//System.out.println(randomInt2);
		//System.out.println(randomInt + randomInt2);
		
		int y = randomInt + randomInt2; // combines the two random numbers
		
		
		
		x = scan1.nextInt(); // assign latest input to x
		System.out.println("Please enter this decimal: " + randF);
		//System.out.println(randF);
		f = scan1.nextFloat(); // assigns pi to a flat value entered by user

		if (f == randF && x == y){ // If the user input is equal to the given then continue, otherwise retry
			
			System.out.println("Thank you. You must be a human.");
			try{Thread.sleep(2000);} // wait try{Thread.sleep(1200);} will represent waits in the program
			catch(Exception e){};
			break;
			}
		else{
			
			System.out.println("ERROR: YOUR IDENTITY COULD NOT BE DETERMINED. Please Try Again.");
			try{Thread.sleep(1200);} 
			catch(Exception e){};
		}
		

		}
		scan1.close(); // close the scanner
			System.out.println("Welcome. Please follow the instructions on the next screen.");
			try{Thread.sleep(1200);} 
			catch(Exception e){};
			//JOptionPane.showMessageDialog(null,  "HEllo");
			
				
			//JOptionPane.showInputDialog("what is your name?");
			int randomPass = randomGenerator.nextInt(1000000); //creates a random number with 6 decimal places
			//String strPass = String.valueOf(randomPass);
			
			JOptionPane.showMessageDialog(null , "You will now create a unique password for your account."); // states what is going to happen next
				
			try{Thread.sleep(2000);} 
			catch(Exception e){};
				
			String ans1 = JOptionPane.showInputDialog(null, "What is your last name?"); // asks for the users last name
				
			try{Thread.sleep(1500);} 
			catch(Exception e){};
				
			String ans2 = JOptionPane.showInputDialog(null, "Please enter the name off your hometown."); // asks for the users hometown.
				
			try{Thread.sleep(2000);}
			catch(Exception e){};
				
			JOptionPane.showMessageDialog(null, "Thank you, I will now create your unqiue password. Please wait..."); // tells the user it is compiling
				
			try{Thread.sleep(2000);} 
			catch(Exception e){};
			password = ans1.substring(0, 4) + ans2.substring(2) + randomPass; // combines parts from answer 1 and answer 2 plus the 6 digit random number to tell the user a safer password
			//String password = (ans1.substring(0, 2)) + (ans2.substring(3, ans2.charAt(ans2.length()-1)) + (strPass)); // last character codde found at http://www.coderanch.com/t/395725/java/java/substring-character
			
			//JOptionPane.showMessageDialog(null, "Your unqiue password is: " + password); // presents the user with the passsword
			
			FlowLayoutFrame flowLayoutFrame = new FlowLayoutFrame();
			flowLayoutFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			flowLayoutFrame.setSize(300,75);
			flowLayoutFrame.setLocationRelativeTo(null);
			flowLayoutFrame.setVisible(true);
		
			try{Thread.sleep(1000);}
			catch(Exception e){};
			
			

	}
	}
			

