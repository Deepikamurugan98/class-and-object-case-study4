package abstraction2;
import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner s = new Scanner(System.in);
  String doorName;
  System.out.println("1. Star Door\n 2. Gass Door\n 3. Liquid Door\n");
  System.out.println("Enter your choice:\n");
  int n=s.nextInt();
  switch(n)
  {
  case 1:
	  System.out.println("Enter Door:");
	  doorName = s.next();
	  System.out.println("Enter the No of Stars:");
	  int numberOfStars = s.nextInt();
	StarDoor sd = new StarDoor(doorName,numberOfStars);
	  sd.display();
	  break;
  case 2:
	  System.out.println("Enter Door:");
	  doorName = s.next();
	  System.out.println("Enter noOfGas:");
	  String numberOfGas = s.next();
	GasDoor gd = new GasDoor(doorName,numberOfGas);
	  gd.display();
	  break;
  case 3:
	  System.out.println("Enter Door:");
	  doorName=s.next();
	  System.out.println("Enter flowQuotient");
	  float flowQuotient = s.nextFloat();
	  LiquidDoor ld = new LiquidDoor(doorName,flowQuotient);
	  ld.display2();
	  break;
	  default:System.out.println("Invalid Input");
	  break;
  }
	  
  }
	}


