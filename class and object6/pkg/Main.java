import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
      InputStreamReader isr = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(isr);
      String s1,s2;
      
      s1=br.readLine();
     
      s2=br.readLine();
      Player1 p1 = new Player1(s1,s2);
      System.out.println("Playername: "+p1.getPlayername());
      System.out.println("Playerposition: "+p1.getPlayerposition());
	}

}
