package interface1;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String typeOfPaint;
      int canvasSize;
      int flowersize = 0,hourglass,windmill;
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      System.out.println("Enter the typeOfPaint: ");
      typeOfPaint =s.next();
      
      switch(n)
      {
      case 1:
    	  System.out.println("Enter the canvasSize: ");
          canvasSize = s.nextInt();
          System.out.println("Enter the flower size: ");
          canvasSize =s.nextInt();
          RegularCanvas rc= new RegularCanvas(typeOfPaint,canvasSize,typeOfPaint,canvasSize,flowersize);
          rc.display();
      case 2:
    	  System.out.println("Enter the canvasSize: ");
          canvasSize = s.nextInt();
          System.out.println("Enter the hourglass: ");
          hourglass = s.nextInt();
          GlassCanvas gc = new GlassCanvas(typeOfPaint, canvasSize,typeOfPaint, hourglass,canvasSize);
          gc.display();
      case 3:
    	  System.out.println("Enter the canvasSize: ");
          canvasSize = s.nextInt();
          System.out.println("Enter the windmill: ");
          windmill = s.nextInt();
          OilCanvas oc = new OilCanvas(typeOfPaint, canvasSize,typeOfPaint, windmill, canvasSize);
          oc.display();
      }
      
      
	}

}
