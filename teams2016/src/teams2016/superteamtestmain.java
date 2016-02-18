package teams2016;

//I added sound with exception handling, as well as separate instances of the super class
// and I made the super class instances unique as well as added some calls to change the win losses to 
// random numbers
//

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

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

		try {
			try{
				Sound("applause");
			} catch (FileNotFoundException e){
				
			}
			} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			Thread.sleep(6000);
    	} catch (InterruptedException e) {
    		e.printStackTrace();
    	}
	}

	private static void Sound(String name) throws Exception{ // FRom stack Over Flow
		//This will allow you to play any sound file found in the images folder
		// From stackoverflow and previous project
		
		File url = new File("images/" + name + ".wav");
	    Clip clip = AudioSystem.getClip();
	    // getAudioInputStream() also accepts a File or InputStream
	    AudioInputStream ais = AudioSystem.getAudioInputStream( url );
		clip.open(ais);
        clip.loop(0);   
	}
}
