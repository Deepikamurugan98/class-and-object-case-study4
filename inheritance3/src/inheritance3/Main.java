package inheritance3;
import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
        System.out.println("1. DeluxeRoom\n 2. DeluxeACRoom\n 3. SuiteACRoom\n");
        System.out.println("Enter your choice");
        int n = s.nextInt();
        switch(n)
        {
        case 1:
        	System.out.println("Enter the hotel Name:");
        	String hotelname = s.next();
        	System.out.println("Enter the room area:");
        	int noOfSqClaw = s.nextInt();
        	System.out.println("Enter the ratePerSqClaw");
        	int ratePerSqClaw = s.nextInt();
        	System.out.println("Hotel has wifi?");
        	boolean hasWifi = s.nextBoolean();
        	System.out.println("Hotel has AC?");
        	boolean hasAC = s.nextBoolean();
        	boolean haswifi=s.hasNext();
        	DeluxeRoom dr = new DeluxeRoom(hotelname,noOfSqClaw,ratePerSqClaw,haswifi,hasAC);
        	dr.calculateTariff();
        	break;
        case 2:
        	System.out.println("Enter the hotel Name:");
        	String hotelname1 = s.next();
        	System.out.println("Enter the room area:");
        	int noOfSqClaw1 = s.nextInt();
        	System.out.println("Enter the ratePerSqClaw");
        	int ratePerSqClaw1 = s.nextInt();
        	System.out.println("Hotel has wifi?");
        	boolean hasWifi1 = s.nextBoolean();
        	System.out.println("Hotel has AC?");
        	boolean hasAC1 = s.nextBoolean();
        	boolean haswifi1=s.hasNext();
        	DeluxeACRoom da = new DeluxeACRoom(hotelname1,noOfSqClaw1,ratePerSqClaw1,haswifi1,hasAC1);
        	da.calculateTariff();
        	break;
        case 3:
        	System.out.println("Enter the hotel Name:");
        	String hotelname2 = s.next();
        	System.out.println("Enter the room area:");
        	int noOfSqClaw2 = s.nextInt();
        	System.out.println("Enter the ratePerSqClaw");
        	int ratePerSqClaw2 = s.nextInt();
        	System.out.println("Hotel has wifi?");
        	boolean hasWifi2 = s.nextBoolean();
        	System.out.println("Hotel has AC?");
        	boolean hasAC2 = s.nextBoolean();
        	boolean haswifi2=s.hasNext();
        	SuiteACRoom sa = new SuiteACRoom(hotelname2,noOfSqClaw2,ratePerSqClaw2,haswifi2,hasAC2);
        	sa.calculateTariff();
        	break;
        }
	}

}
