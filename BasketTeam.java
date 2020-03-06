/**
 * 
 * @author Sergiu 
 * Clasa pentru echipa de basket
 *
 */
public class BasketTeam extends Team implements ElementScor{

	public BasketTeam() {
		
	}

	public BasketTeam(String teamName, String gender, int nrOfPlayers) {
		super(teamName, gender, nrOfPlayers);
		
	}
	public double accept(Visitor visitor)
	{
		return visitor.visit(this);
	}
}
