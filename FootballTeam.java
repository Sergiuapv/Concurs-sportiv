import java.util.ArrayList;

public class FootballTeam extends Team implements ElementScor{

	public FootballTeam() {

	}

	public FootballTeam(String teamName, String gender, int nrOfPlayers) {
		super(teamName, gender, nrOfPlayers);
	}
	public double accept(Visitor visitor)
	{
		return visitor.visit(this);
	}
	public int getbestscore()
	{
		int max=0;
		for(Player item : this.players)
			if(item.score >= max)
				max=item.score;
		return max;
	}
	public int getworstscore()
	{
		int min=9999;
		for(Player item :this.players)
			if(item.score <=min)
			min=item.score;
		return min;
	}

}
