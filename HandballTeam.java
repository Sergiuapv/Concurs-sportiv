
public class HandballTeam extends Team implements ElementScor{

	public HandballTeam() {
		// TODO Auto-generated constructor stub
	}

	public HandballTeam(String teamName, String gender, int nrOfPlayers) {
		super(teamName, gender, nrOfPlayers);
		// TODO Auto-generated constructor stub
	}
	public double accept(Visitor visitor)
	{
		return visitor.visit(this);
	}
}
