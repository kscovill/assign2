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
