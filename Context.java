
public class Context {
	private Strategy strategy;
	public Context(Strategy strategy) {
		// TODO Auto-generated constructor stub
		this.strategy=strategy;
		
	}
	public double execStrategy(Team team)
	{
		return strategy.calculate(team);
	}

}
