/**
 * 
 * @author Sergiu
 * In clasa Factory am implementat Singleton si Factory
 * Am creeat obiecte de tip Team si Player
 */
 class Factory {
	public static Factory instance=null;
	private Factory() {
		// TODO Auto-generated constructor stub
	}
	public static Factory getinstance()
	{
		if(instance==null)
			instance = new Factory();
			return instance;
	}
	public Team makeTeam(String typ,String name,
			String gender,int nrOfPlayers)
	{
		Team team=null;
		if(typ.equals(Type.football.name()))
			team=new FootballTeam(name,gender,nrOfPlayers);
		if(typ.equals(Type.basketball.name()))
			team=new BasketTeam(name,gender,nrOfPlayers);
		if(typ.equals(Type.handball.name()))
			team=new HandballTeam(name,gender,nrOfPlayers);
		return team;
		
	}
	public Player makePlayer(String name,int value)
	{
		Player player=new Player(name, value);
		return player;
	}
	
}
