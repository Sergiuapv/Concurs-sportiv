
public class ScoreHandball implements Strategy {

	public ScoreHandball() {
		// TODO Auto-generated constructor stub
	}
	public double calculate(Team handbalteam)
	{
		double score=0;
		if(handbalteam.gender.contentEquals("masculin"))
			score=handbalteam.suma();
		else
			score=handbalteam.produs();
		return score;
	}
	

}
