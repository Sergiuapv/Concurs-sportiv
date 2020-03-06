import java.util.ArrayList;

public class Collection {
	public ArrayList<Team> colection=new ArrayList<Team>(24);
	public Collection() {
		// TODO Auto-generated constructor stub
	}
	public void addTeam(Team team)
	{
		colection.add(team);
	}
	public Team SearchTeam(String name)
	{
		for(int i=0;i<colection.size();i++)
			if(colection.get(i).teamName.contentEquals(name))
				return colection.get(i);
		return colection.get(1);//nu va intra niciodata
	}
	public void see()
	{
		for(int i=0;i<colection.size();i++)
		{System.out.print("{teamName: "+colection.get(i).teamName+", gender: "+colection.get(i).gender+", numberOfPlayers: "+colection.get(i).nrOfPlayers);
		System.out.print(", players: [");
		for(int j=0;j<colection.get(i).nrOfPlayers;j++)
			{System.out.print("{");
			colection.get(i).players.get(j).seePlayer();
			if(j!=colection.get(i).nrOfPlayers-1)
				System.out.print("}, ");
			else System.out.print("}");
			}
		System.out.println("]}");
		}
	}

}
