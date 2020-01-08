package interface1;

public class GlassCanvas extends Canvas implements ipaint{
	private String typeOfPaint2;
	private int canvasSize2;
	private int hourglass2;
	
	public GlassCanvas(String typeOfPaint, int canvasSize, String typeOfPaint2, int canvasSize2, int hourglass2) {
		super(typeOfPaint, canvasSize);
		this.typeOfPaint2 = typeOfPaint2;
		this.canvasSize2 = canvasSize2;
		this.hourglass2 = hourglass2;
	}

	public String getTypeOfPaint2() {
		return typeOfPaint2;
	}

	public void setTypeOfPaint2(String typeOfPaint2) {
		this.typeOfPaint2 = typeOfPaint2;
	}

	public int getCanvasSize2() {
		return canvasSize2;
	}

	public void setCanvasSize2(int canvasSize2) {
		this.canvasSize2 = canvasSize2;
	}

	public int getHourglass2() {
		return hourglass2;
	}

	public void setHourglass2(int hourglass2) {
		this.hourglass2 = hourglass2;
	}

	public void display()
	{
		if(typeOfPaint2.equalsIgnoreCase("glass"))
		{
		    if(canvasSize2==hourglass2)
		      {
			      System.out.println("glass");
		       }
		    else
		    {
		    	System.out.println("Type mismatch");
		    }
		}
		else if(canvasSize2<hourglass2)
		{
			System.out.println("Cannot paint");
		}
		else
		{
			System.out.println("glass paint require for glassCanvas");
		}
		
		
	}
}
