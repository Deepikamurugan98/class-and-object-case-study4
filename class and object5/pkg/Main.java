import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String fp;
        float ft;
        byte ln,tm;
        Activity p=new Activity();     
        ln=Byte.parseByte(br.readLine());
        p.setLn(ln);
        tm=Byte.parseByte(br.readLine());
        p.setTm(tm);
        fp=br.readLine();
        p.setFp(fp);
        ft=Float.parseFloat(br.readLine());
        p.setFt(ft);
        System.out.println("lapNo: "+p.getLn());
        System.out.println("throwsMade: "+p.getTm());
        System.out.println("Fastest Player: "+p.getFp());
        System.out.println("Fastest Time: "+p.getFt());
	}

}
