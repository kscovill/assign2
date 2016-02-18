package teams2016;

// Main structure from Dave's Example


public class superteam {
	private static final String Names[] = {"Girls Soccer", "Football", "Track"};
	private static final String CoachNames[] = {"Neil Massey", "Steve Weston", "Mr. Stromberg"};
	private static final String town = "Hamilton";
	private String teamname;
	private String coach;
	private int wins;
	private int losses;
	
	public superteam (){
		teamname = "unknown";
		coach = "unknown";
		wins = 0;
		losses = 0;
	}
	
	
	public superteam(String tname, String c){
		
		teamname = tname;
		coach = c;
		wins = 0;
		losses = 0;
	}
	public static String[] getCoachNames(){
		return(CoachNames);
	}
	public static String[] getNames(){
		return(Names);
	}
	public String gettown(){
		return (town);
	}
	public String getteamname(){
		return (teamname);
	}
	public String getcoach(){
		return (coach);
	}
	public int getwins(){
		return (wins);
	}
	public int getlosses(){
		return (losses);
	}
	public void setwins(int w){
		wins = w;
		return;
	}
	public void setlosses(int l){
		losses = l;
		return;
	}
}
