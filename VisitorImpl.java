/**
 * 
 * @author Sergiu
 * Implementarea visitorului folosind si strategy
 * Am creeat cate un context nou pentru fiecare tip de echipa in parte
 */
public class VisitorImpl implements Visitor {

	public VisitorImpl() {
		
	}

	@Override
	public double visit(FootballTeam fotbalteam) {
		
		Context context = new Context(new ScoreFootball());
		return context.execStrategy(fotbalteam);
	}

	public double visit(HandballTeam handbalteam) {
		
		Context context = new Context(new ScoreHandball());
		return context.execStrategy(handbalteam);
	}

	public double visit(BasketTeam basketteam) {
		
		Context context = new Context(new ScoreBasket());
		return context.execStrategy(basketteam);
		
	}

}
