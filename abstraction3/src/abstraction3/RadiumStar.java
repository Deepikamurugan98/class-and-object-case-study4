package abstraction3;

public class RadiumStar extends Star {
private int decayIndex3;


public RadiumStar(String starName, String constellationName, int decayIndex, int energyToEmit, int currentAge,
		int energyEmitted, int decayIndex3) {
	super(starName, constellationName, decayIndex, energyToEmit, currentAge, energyEmitted);
	this.decayIndex3 = decayIndex3;
}


public int calculateYearsRemaining() {
	int a;
	a=(decayIndex3*(decayIndex3+1))/2;
	System.out.println(a);
	return a;
}
}
