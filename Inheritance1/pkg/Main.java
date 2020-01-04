import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
   String Species;
   String lt;
   boolean hasresistant;
   Species=s.next();
   lt=s.next();
   hasresistant= s.nextBoolean();
   lavaDino ld = new lavaDino(Species, lt, hasresistant);
   ld.display(Species, lt, hasresistant);
        
	}

}
