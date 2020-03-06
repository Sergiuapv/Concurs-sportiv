
public class ScoreBasket implements Strategy{

	public ScoreBasket() {
		// TODO Auto-generated constructor stub
	}
	public double calculate(Team basketteam)
	{
		double score=0;
		score=(double)basketteam.suma()/basketteam.nrOfPlayers;
		return score;
	}

}
