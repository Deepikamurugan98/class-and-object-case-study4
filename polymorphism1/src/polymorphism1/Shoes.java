package polymorphism1;

public class Shoes  {
	private int coalPieces;
	private float hairStrand;
	private String coalMsg;
	
	
	public Shoes(int coalPieces, float hairStrand, String coalMsg) {
		super();
		this.coalPieces = coalPieces;
		this.hairStrand = hairStrand;
		this.coalMsg = coalMsg;
	}


	public int getCoalPieces() {
		return coalPieces;
	}


	public void setCoalPieces(int coalPieces) {
		this.coalPieces = coalPieces;
	}


	public float getHairStrand() {
		return hairStrand;
	}


	public void setHairStrand(float hairStrand) {
		this.hairStrand = hairStrand;
	}


	public String getCoalMsg() {
		return coalMsg;
	}


	public void setCoalMsg(String coalMsg) {
		this.coalMsg = coalMsg;
	}


	public void display() {
		
		if(coalPieces>=5)
		{
			int total=coalPieces/5;
			int amt=total*100;
			System.out.println(amt);
		}
		else
		{
			System.out.println("coalPieces");
		}	
		if(hairStrand>9.83)
		{
		 float hair = (float) (hairStrand/9.3);
		 hair = hairStrand+(hair*100);
		 System.out.println(hair+"ml");
		}
		else {
			System.out.println(hairStrand);
		}
		String str[]=coalMsg.split("");
		int count=0;
		for(int i=0;i<str.length;i++)
		{
			if("coal".equals(str[i]))
				count++;
		}
		if(count>1)
		{
			System.out.println(27*count);
		}
		else
		{
			
			System.out.println("There is no word 'coal'");
		}
	}

}
