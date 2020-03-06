
public class ScoreFootball implements Strategy{

	public ScoreFootball() {
		// TODO Auto-generated constructor stub
	}
	public double calculate(Team fotbalteam)
	{
		double score=0;
		if(fotbalteam.gender.contentEquals("masculin"))
		{
			score+=fotbalteam.suma();
			score+=fotbalteam.getbestscore();
		}
		else
		{
			score+=fotbalteam.suma();
			score+=fotbalteam.getworstscore();
		}
		return score;
	}

}
