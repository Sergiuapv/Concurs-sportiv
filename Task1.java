import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.StringTokenizer;

public class Task1 {

	public Task1() {
		// TODO Auto-generated constructor stub
	}
	public void maketask1(String s1,String s2) throws FileNotFoundException,IOException
	{
		File file1 = new File(s1);
		File file2 = new File(s2); 
		Factory factory=Factory.getinstance();
		BufferedReader br = new BufferedReader(new FileReader(file1));
		PrintStream o = new PrintStream(file2);
		System.setOut(o);
		String st;
		Collection collection=new Collection();
		while ((st=br.readLine())!=null && st.length()>1)
		{	Team team;
			StringTokenizer def=new StringTokenizer(st,",");
		String sport;
		sport=def.nextToken();
		String name=def.nextToken().substring(1);
		String gender=def.nextToken().substring(1);
		int nrplayers=Integer.parseInt(def.nextToken().substring(1));
		team=factory.makeTeam(sport, name, gender, nrplayers);
		
		for(int i=1;i<=nrplayers;i++)
		{	Player pl;
			st=br.readLine();
			def=new StringTokenizer(st,", ");
			String nameplayer=def.nextToken();
			
			int value=Integer.parseInt(def.nextToken());
			pl=factory.makePlayer(nameplayer, value);
	
			team.addplayer(pl);
		}
		collection.addTeam(team);
	}
	collection.see();
	}
}


