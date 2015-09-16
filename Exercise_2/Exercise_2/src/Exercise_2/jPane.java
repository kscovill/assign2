// This class controls what happens after the users identity is verified
// It will bring up a JOptionPane and ask the user for input on two subject
// then make a unique password with their input.

package Exercise_2;
import javax.swing.*;


public class jPane {

		public jPane(){
			
			JOptionPane.showMessageDialog(null, "You will now create a unique password \n for your account");
			
			try{Thread.sleep(2000);}
			catch(Exception e){};
			
			String ans1 = JOptionPane.showInputDialog(null, "What is your last name?");
			
			try{Thread.sleep(1500);}
			catch(Exception e){};
			
			String ans2 = JOptionPane.showInputDialog(null, "Please enter the name off your hometown");
			
			try{Thread.sleep(2000);}
			catch(Exception e){};
			
			JOptionPane.showMessageDialog(null, "Thank you, I will now create your unqiue password. PLease wait...");
			
			try{Thread.sleep(2000);}
			catch(Exception e){};
			
			pass = 
		}
		
}
