package teams2016;

import java.util.Random;

// Main Structure from Dave's Example

public class superteamtestmain {
	private static String nameArray[]= superteam.getNames();
	private static String coachNames[] = superteam.getCoachNames();
	
	public static void main(String[] args) {
		
		/*for ( int i=0; i<3; i++){
			System.out.println(nameArray[i] + "    " + coachNames[i]);
		}*/
		superteam superTeam[] = new superteam[3];
		team mytestteam[] = new team[3];
		for ( int i=0; i<3; i++){
			mytestteam [i] = new team();
			superTeam[i] = new superteam("HS " + nameArray[i] + " Team",coachNames[i]);
		}
		
		Random random = new Random();
		String s = mytestteam[0].gettown();
		
		for ( int i=0; i<3; i++){
			String string = superTeam[i].getteamname();
			mytestteam[i].setteamname(string);
			string = superTeam[i].getcoach();
			mytestteam[i].setcoach(string);
		    String n = mytestteam[i].getteamname();
		    String c = mytestteam[i].getcoach();
		    mytestteam[i].setwins(random.nextInt(10));
		    mytestteam[i].setlosses(random.nextInt(10));
		    int w = mytestteam[i].getwins();
		    int l = mytestteam[i].getlosses();
		
		    System.out.println(s + " " + n);
		    System.out.println(c + "  \n" + w + "  " + l+"\n");
		}		


	}

}
