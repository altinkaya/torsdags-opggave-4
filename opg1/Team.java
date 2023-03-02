	class Team{

	private int teamRank;
	private String teamName;
	private String  players;

	Team(String teamName){


		this.teamName= teamName;

	}

	public int setRank(int rank){


		teamRank=rank;
		return teamRank;


	}

	@Override	
 public String toString(){

	String s = "team "+teamName+" rank "+teamRank;
	return s;
}
}