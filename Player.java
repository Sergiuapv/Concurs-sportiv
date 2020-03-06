
public class Player {
	public String name;
	public int score;
	public Player() {
		// TODO Auto-generated constructor stub
	}
	public Player(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	public void seePlayer()
	{
		System.out.print("name: "+this.name+", score: "+this.score);
	}

}
