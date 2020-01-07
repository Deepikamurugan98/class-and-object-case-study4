package polymorphism2;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      float energyReserve;
      float energy;
      float remainingEnergy;
      float jumpHeight;
      int distanceStrolled;
      String soundsMade = null;
      
     System.out.println("1. Machine\n 2. Cat\n");
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();
     switch(n)
     {
     
     case 1:
      System.out.println("Enter the energyReserve");
      energyReserve=s.nextFloat();
      System.out.println("Enter the energy");
      energy = s.nextFloat();
      System.out.println("Enter the remainingenergy");
      remainingEnergy = s.nextFloat();
      Machine m = new Machine(energy,energyReserve,remainingEnergy);
      m.display();
      break;
     case 2:
      System.out.println("Enter jumpheight");
      jumpHeight = s.nextFloat();
      System.out.println("Enter the distancestrolled");
      distanceStrolled = s.nextInt();
      System.out.println("Enter the word");
      soundsMade = s.next();
      
      Cat c= new Cat(jumpHeight,distanceStrolled,soundsMade);
      c.display();
      break;
     }
	}

}
