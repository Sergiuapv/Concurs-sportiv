import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.StringTokenizer;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) throws IOException {
		if(args[0].contentEquals("inscriere"))
		{Task1 t=new Task1();
		t.maketask1(args[1],args[3]);
		}
		else 
		{
			Task2 t2=new Task2();
			t2.maketask2(args[1],args[2],args[3]);
		}
	}

}
