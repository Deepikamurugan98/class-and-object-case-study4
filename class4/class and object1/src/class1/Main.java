package class1;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
       InputStreamReader a= new InputStreamReader(System.in);
       BufferedReader b=new BufferedReader(a);
       String s1,s2;
       s1=b.readLine();
       s2=b.readLine();
       Team t1=new Team(s1,s2);
	}

}
