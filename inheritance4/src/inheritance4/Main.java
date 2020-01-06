package inheritance4;
import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner s = new Scanner(System.in);
    System.out.println("1. Dinosaur\n 2. Lava Dinosaur\n 3. Dragon Dinosaur\n");
    int n= s.nextInt();
    switch(n)
    {
    case 1:
    	System.out.println("Enter Species");
    	String species = s.next();
    	System.out.println("Enter the consumptionType");
    	String consumptionType = s.next();
    	Dinosaur dino = new Dinosaur(species,consumptionType);
    	dino.displayDinoDetails();                      
    	break;
    case 2:
    	System.out.println("Enter species:");
    	String species1=s.next();
    	System.out.println("Enter Consumption:");
    	String consumptiontype1=s.next();
    	System.out.println("Breathes fire?(y/n):");
    	String breath=s.next();
    	System.out.println("Is heat Resistence?(y/n):");
    	String heat=s.next();
    	LavaDino ldino=new LavaDino(species1,consumptiontype1,breath,heat);
    	ldino.displaydinodetails();
    	break;
    case 3:
    	System.out.println("Enter species:");
    	String species2=s.next();
    	System.out.println("Enter Consumption:");
    	String consumptiontype2=s.next();
    	System.out.println("Breathes fire?(y/n):");
    	String breath2=s.next();
    	System.out.println("Is heat Resistence?(y/n):");
    	String heat2=s.next();
    	System.out.println("Enter no of wings:");
    	int noofwings=s.nextInt();
    	System.out.println("Enter no of Scales:");
    	int noofscales=s.nextInt();
    	DragonDino ddino=new DragonDino(species2,consumptiontype2,breath2,heat2,noofwings,noofscales);
    	ddino.displaydinodetails();
    	break;
    }
    }

}
