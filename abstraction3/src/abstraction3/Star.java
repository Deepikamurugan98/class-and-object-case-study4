package abstraction3;


abstract public class Star {
	private  String starName;
	private String constellationName;
	private int decayIndex;
	private int energyToEmit;
	private int currentAge;
	private int energyEmitted;
	public Star(String starName, String constellationName, int decayIndex, int energyToEmit, int currentAge,
			int energyEmitted) {
		super();
		this.starName = starName;
		this.constellationName = constellationName;
		this.decayIndex = decayIndex;
		this.energyToEmit = energyToEmit;
		this.currentAge = currentAge;
		this.energyEmitted = energyEmitted;
	}
	public String getStarName() {
		return starName;
	}
	public void setStarName(String starName) {
		this.starName = starName;
	}
	public String getConstellationName() {
		return constellationName;
	}
	public void setConstellationName(String constellationName) {
		this.constellationName = constellationName;
	}
	public int getDecayIndex() {
		return decayIndex;
	}
	public void setDecayIndex(int decayIndex) {
		this.decayIndex = decayIndex;
	}
	public int getEnergyToEmit() {
		return energyToEmit;
	}
	public void setEnergyToEmit(int energyToEmit) {
		this.energyToEmit = energyToEmit;
	}
	public int getCurrentAge() {
		return currentAge;
	}
	public void setCurrentAge(int currentAge) {
		this.currentAge = currentAge;
	}
	public int getEnergyEmitted() {
		return energyEmitted;
	}
	public void setEnergyEmitted(int energyEmitted) {
		this.energyEmitted = energyEmitted;
	}
abstract	int  calculateYearsRemaining();
float	result;
	public float calculateEmissionRate()
	{
		 result=(float)(energyToEmit-energyEmitted)/(float)(calculateYearsRemaining()-currentAge);  
		 return result;
	}
	public void display()
	{
		//float result;
		System.out.print("Star Details:"+starName+"\n");
		System.out.print("Constellation:"+constellationName+"\n");
		System.out.print("Emission rate:"+result+"\n");

	}

}
