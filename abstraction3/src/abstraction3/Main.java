package abstraction3;
import java.util.*;
import java.io.IOException;
public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		String starName;
		String constellationName;
		int decayIndex;
		int energyToEmit;
		int currentAge;
		int energyEmitted;
		Scanner s = new Scanner(System.in);
		System.out.println("Star Details");
        System.out.println("Enter StarName:\n");
        starName = s.next();
        System.out.println("Enter constellationName:\n ");
        constellationName = s.next();
        System.out.println("Enter decayIndex: \n");
        decayIndex =s.nextInt();
        System.out.println("Enter energyToEmit: \n");
        energyToEmit =s.nextInt();
        System.out.println("Enter the age: \n");
        currentAge =s.nextInt();
        System.out.println("Enter the energyEmitted: \n");
        energyEmitted = s.nextInt();
        int n =s.nextInt();
        System.out.println("1. DarkStar\n 2. Plasam Star\n 3.RadiumStar");
        switch(n)
        {
        case 1:
        	DarkStar ds = new DarkStar(starName,constellationName,decayIndex,energyToEmit,currentAge,energyEmitted, n, n);
        	ds.calculateYearsRemaining();
        	ds.display();
        	break;
        case 2:
        	PlasmaStar ps = new PlasmaStar(starName,constellationName,decayIndex,energyToEmit,currentAge,energyEmitted, n, n);
        	ps.calculateYearsRemaining();
        	ps.display();
        	break;
        case 3:
        	RadiumStar rs = new RadiumStar(starName,constellationName,decayIndex,energyToEmit,currentAge,energyEmitted, n);
        	rs.calculateYearsRemaining();
        	rs.display();
        }
        
	}

}
