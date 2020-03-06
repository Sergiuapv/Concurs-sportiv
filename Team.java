import java.util.ArrayList;
/**
 * 
 * @author Sergiu
 * Clasa de baza pentru o echipa 
 */
public class Team implements ElementScor,Observer {
	
	public String teamName;
	public String gender;
	public int nrOfPlayers;
	public ArrayList<Player> players=new ArrayList<>(20);
	public int locOcupat=1;
	public int punctaj=0;
	public Team() {
		
	}
	public Team(String teamName, String gender, int nrOfPlayers) {
		super();
		this.teamName = teamName;
		this.gender = gender;
		this.nrOfPlayers = nrOfPlayers;
	}
	/**
	 * 
	 * @param p
	 * Adauga p in echipa
	 */
	public void addplayer(Player p)
	{
		players.add(p);
	}
	public double accept(Visitor visitor)
	{
		return 1;
	}
	
	public int getbestscore()
	{
	return 1;
	}
	public int getworstscore()
	{
		return 1;
	}
	/**
	 * 
	 * @return Suma tuturor jucatorilor 
	 */
	public int suma()
	{
		int sum=0;
		for(Player item :players)
			sum+=item.score;
		return sum;
	}
	/**
	 * 
	 * @return Produsul tuturor jucatorilor
 	 */
	public int produs()
	{
		int produs=1;
		for(Player item :players)
			produs*=item.score;
		return produs;
	}
	/**
	 * Actualizarea locului din clasament 
	 */
	public void update(ArrayList<Team> clasament)
	{	int i=1;
		for(Team item :clasament )
		{
			if(item.teamName.contentEquals(this.teamName))
				this.locOcupat=i;
			i++;
		}
	}
	

}
