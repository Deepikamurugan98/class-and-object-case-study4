package abstraction3;

public class DarkStar extends Star{
 private int currentAge;
 private int decayIndex;
public DarkStar(String starName, String constellationName, int decayIndex, int energyToEmit, int currentAge,
		int energyEmitted, int currentAge2, int decayIndex2) {
	super(starName, constellationName, decayIndex, energyToEmit, currentAge, energyEmitted);
	currentAge = currentAge2;
	decayIndex = decayIndex2;
}
public int getCurrentAge() {
	return currentAge;
}
public void setCurrentAge(int currentAge) {
	this.currentAge = currentAge;
}
public int getDecayIndex() {
	return decayIndex;
}
public void setDecayIndex(int decayIndex) {
	this.decayIndex = decayIndex;
}
 public int calculateYearsRemaining() {
	 int number=1,a,tot = 0;
	 int count=0;
	 while(count<decayIndex)
	 {
		 number=number+1;
		 for(a=1;a<=number;a++) {
			 if(number%a == 0) {
				 break;
			 }
		 }
		 if(a == number)
		 {
			count = count+1; 
		 }
	 }
	 tot=tot+number;
	 return tot;
 }

}
