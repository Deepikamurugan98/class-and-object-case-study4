package interface1;

public class OilCanvas extends Canvas implements ipaint {

	private String typeOfPaint3;
	private int canvasSize3;
	private int windmill3;
	
	public OilCanvas(String typeOfPaint, int canvasSize, String typeOfPaint3, int canvasSize3, int windmill3) {
		super(typeOfPaint, canvasSize);
		this.typeOfPaint3 = typeOfPaint3;
		this.canvasSize3 = canvasSize3;
		this.windmill3 = windmill3;
	}

	public String getTypeOfPaint3() {
		return typeOfPaint3;
	}

	public void setTypeOfPaint3(String typeOfPaint3) {
		this.typeOfPaint3 = typeOfPaint3;
	}

	public int getCanvasSize3() {
		return canvasSize3;
	}

	public void setCanvasSize3(int canvasSize3) {
		this.canvasSize3 = canvasSize3;
	}

	public int getWindmill3() {
		return windmill3;
	}

	public void setWindmill3(int windmill3) {
		this.windmill3 = windmill3;
	}

	public void display()
	{
		if(typeOfPaint3.equalsIgnoreCase("oil"))
		{
			  if(canvasSize3==windmill3)
			  {
				  System.out.println("can paint windmill");
			  }
			   else 
			   {
				  System.out.println("Type mismatch");
			   }
		}
			else if(canvasSize3<windmill3)
			{
				System.out.println("Cannot paint");
			}
			else
			{
				System.out.println("oil paint required for windmills");
			}
					
		}
		
	}

