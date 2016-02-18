package teams2016;


// Main structure from Dave's Example

public class team extends superteam{
		private String teamname;
		private String coach;
		private int wins;
		private int losses;
		
	public team(){
		teamname = "";
		coach = "";
		wins = 0;
		losses = 0;
	}
	
	public void setteamname(String t){
		teamname = t;
	}
	
	public void setcoach(String c){
		coach = c;
	}
	
	@Override
	public String getteamname(){
		return (teamname);
	}
	
	@Override
	public String getcoach(){
		return (coach);
	}
	
}
