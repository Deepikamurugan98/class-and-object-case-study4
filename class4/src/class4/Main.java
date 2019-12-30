package class4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner s=new Scanner(System.in);
      Activity a = new Activity();
      String s1,s2;
      s1=s.next();
      a.setTeamname(s1);
      s2=s.next();
     a.setCity(s2);
 
    		System.out.println("Teamname:"+a.getTeamname());
    		System.out.println("City:"+a.getCity());
    
	}

}
