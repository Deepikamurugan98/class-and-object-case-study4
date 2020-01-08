package interface1;

public class RegularCanvas extends Canvas implements ipaint {
	private String typeOfPaint1;
	private int canvasSize1;
	private int flowersize1;
	
	
	
	public RegularCanvas(String typeOfPaint, int canvasSize, String typeOfPaint1, int canvasSize1, int flowersize1) {
		super(typeOfPaint, canvasSize);
		this.typeOfPaint1 = typeOfPaint1;
		this.canvasSize1 = canvasSize1;
		this.flowersize1 = flowersize1;
	}



	public String getTypeOfPaint1() {
		return typeOfPaint1;
	}



	public void setTypeOfPaint1(String typeOfPaint1) {
		this.typeOfPaint1 = typeOfPaint1;
	}



	public int getCanvasSize1() {
		return canvasSize1;
	}



	public void setCanvasSize1(int canvasSize1) {
		this.canvasSize1 = canvasSize1;
	}



	public int getFlowersize1() {
		return flowersize1;
	}



	public void setFlowersize1(int flowersize1) {
		this.flowersize1 = flowersize1;
	}



	public void display() {
		//System.out.println("water");
		if(typeOfPaint1.equalsIgnoreCase("water"))
		{
			//System.out.println("water");
			if(canvasSize1==flowersize1) 
			{
				System.out.println("water");
			}
			else {
				System.out.println("Type mismatch");
			}
		}
		else if(canvasSize1<flowersize1) 
		{
			System.out.println("Cannot paint");
		}
		else
		{
			System.out.println("water paint requird for regular canvas");
		}
		}
		
	
}
