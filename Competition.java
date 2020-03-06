import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/**
 * 
 * @author Sergiu
 * Am adaugat echipele in competitie doar daca se potrivesc competitiei respective
 */ 
public class Competition implements Subject {
	
	public String type;
	public String gender;
	public ArrayList<Team> teams;
	public ArrayList<Team> clasament;
	/**
	 * 
	 * @param type Tipul competitiei
	 * @param gender Genul :masculin sau feminin
	 */
	public Competition(String type, String gender) {
		super();
		this.type = type;
		this.gender = gender;
		teams=new ArrayList<Team>(30);
		clasament=new ArrayList<Team>(30);
	}
	public Competition() {
		teams=new ArrayList<Team>(30);
		clasament=new ArrayList<Team>(30);
	}
	/**
	 * 
	 * @param team Adaugarea unei echipe in competitie
	 */
	public void addTeam(Team team)
	{	if(this.type.contentEquals("football") && team instanceof FootballTeam)
		if(this.gender.contentEquals(team.gender))
		teams.add(team);
	if(this.type.contentEquals("handball") && team instanceof HandballTeam)
		if(this.gender.contentEquals(team.gender))
		teams.add(team);
	if(this.type.contentEquals("basketball") && team instanceof BasketTeam)
		if(this.gender.contentEquals(team.gender))
		teams.add(team);
	}
	public void registerObserver(Observer o)
	{
	}
	/**
	 * Notificarea echipelor despre locul in clasament
	 */
	public void notifyObservers()
	{
		for( Team item: teams)
			item.update(clasament);
	}
	/**
	 * Simularea meciurilor 
	 */
	public void startcompetition()
	{
		Visitor visitor =new VisitorImpl();
		for(int i=0;i<teams.size();i++)
			for(int j=i+1;j<teams.size();j++)
				{
					if(teams.get(i).accept(visitor)>
					teams.get(j).accept(visitor))
						teams.get(i).punctaj+=3;
					else
						if(teams.get(i).accept(visitor)==
						teams.get(j).accept(visitor))
							{teams.get(i).punctaj+=1;
							teams.get(i).punctaj+=1;
							}
						else teams.get(j).punctaj+=3;
							}
	
		for(int i=0;i<teams.size();i++)
			clasament.add(teams.get(i));
		Collections.sort(clasament,new Comparator<Team>() {
			public int compare(Team o1,Team o2)
			{
				return -(o1.punctaj-o2.punctaj);
			}
		});
		notifyObservers();
				}
	public void seeClasament()
	{
		for(int i=0;i<=2;i++)
			System.out.println(clasament.get(i).teamName);
	}
	/**
	 * Afisarea tuturor echipelor
	 */
	public void seeTeams()
	{
		for(int i=0;i<teams.size();i++)
			System.out.println("Echipa "+teams.get(i).teamName+" a ocupat locul "+teams.get(i).locOcupat);
	}
}


