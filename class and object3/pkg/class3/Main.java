package class3;
import java.io.*;
public class Main {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
     InputStreamReader a= new InputStreamReader(System.in);
     BufferedReader br= new BufferedReader(a);
     byte match,wins,losses;
     float als,mls,atd,mtd;
     match=Byte.parseByte(br.readLine());
     wins=Byte.parseByte(br.readLine());
     losses=Byte.parseByte(br.readLine());
     als=Float.parseFloat(br.readLine());
     mls=Float.parseFloat(br.readLine());
     atd=Float.parseFloat(br.readLine());
     mtd=Float.parseFloat(br.readLine());
     Activity b=new Activity(match,wins,losses,als,mls,atd,mtd);
     b.display();
	}

}
