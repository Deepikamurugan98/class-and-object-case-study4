package abstraction3;

public class PlasmaStar extends Star {
	private int decayIndex3,temp;

	
public PlasmaStar(String starName, String constellationName, int decayIndex, int energyToEmit, int currentAge,
			int energyEmitted, int decayIndex3, int temp) {
		super(starName, constellationName, decayIndex, energyToEmit, currentAge, energyEmitted);
		this.decayIndex3 = decayIndex3;
		this.temp = temp;
	}


public int calculateYearsRemaining() {
	int a=0,b=0,c = 0;
	for(int i=1;i<decayIndex3;i++)
	{
	  c=a+b;
	  a=b;
	  b=c;
	}
	//System.out.println(c);
	return c;
}
	
	

}
