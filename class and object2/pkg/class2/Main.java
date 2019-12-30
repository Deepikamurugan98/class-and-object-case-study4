package class2;
import java.io.*;
public class Main {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
      InputStreamReader a= new InputStreamReader(System.in);
      BufferedReader br= new BufferedReader(a);
      String s1,s2;
      s1=br.readLine();
      s2=br.readLine();
      Players p= new Players(s1,s2);
	}

}
