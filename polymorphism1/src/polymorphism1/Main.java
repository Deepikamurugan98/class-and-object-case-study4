package polymorphism1;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
    int coalPieces;
    float hairStrand;
    String coalMsg;
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the coalPieces: ");
    coalPieces = s.nextInt();
    System.out.println("Enter the hairStrand");
    hairStrand = s.nextInt();
    System.out.println("Enter the coalMsg:");
    coalMsg = s.next();
    Shoes s1 = new Shoes(coalPieces, hairStrand, coalMsg);
    s1.display();
	}

}
