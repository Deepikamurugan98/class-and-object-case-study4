import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
      InputStreamReader isr = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(isr);
      String s1,s2;
      Player1 p1 = new Player1();
      s1=br.readLine();
      p1.setPlayername(String.valueOf(s1));
      s2=br.readLine();
      p1.setPlayerposition(String.valueOf(s2));
      System.out.println("Playername: "+s1);
      System.out.println("Playerposition: "+s2);
	}

}
