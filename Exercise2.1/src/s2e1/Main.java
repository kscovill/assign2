/*
 * Company Database through Arrays
 * 
 * The information is stored in a private 2 dimensional array of Strings and a single dimension array 
 * and can only be accessed through a get method by the JFrame.  Then the Jframe grabs the information
 * and displays them in a neat manner with easy to use buttons to gather or change information. Error
 * checking is present as well as get methods. I have an e-git history.
 * 
 */

package s2e1;

public class Main {
	
//Initiialize my 2D array of information for the database
private static String[][] myArray = { 
		{"John", "Jane", "Kyle", "David"},
        {"Doe", "Doe", "Scovill", "Nielson"},
        {"Helena", "Helena", "Hamilton", "Battle Ground"},
        {"Montana", "Montana", "Montana", "Washington"},
        {"1601 N Benton ave", "Unknown", "538 Golf Course rd", "Unknown"},
        {"Custodion", "Intern", "Team Leader", "Patroleum Engineer"} };
private static int[] zipcode = {59625, 59625, 59840, 98604};

	//display my Jframe
	public static void main(String[] args) {
		Frame frame = new Frame();
	
	}
	
	//Allow my JFrame to grab the information but not change it directly in the code
	public static String[][] getArray(){
		String[][] newArray = myArray.clone();
		
		return newArray;
	}
	
	//Same as above
	public static int[] getZip(){
		int[] newInt = zipcode;
		
		return newInt;
	}
		

}
