package inheritance4;

public class LavaDino extends Dinosaur {
	private String species1;
	private String consumptiontype1;
	private String breath;
    private String heat;
	public LavaDino(String species1, String consumptiontype1, String breath,
			String heat) {
		super(species1, consumptiontype1);
		this.species1 = species1;
		this.consumptiontype1 = consumptiontype1;
		this.breath = breath;
		this.heat = heat;
	}
	public String getSpecies1() {
		return species1;
	}
	public void setSpecies1(String species1) {
		this.species1 = species1;
	}
	public String getConsumptiontype1() {
		return consumptiontype1;
	}
	public void setConsumptiontype1(String consumptiontype1) {
		this.consumptiontype1 = consumptiontype1;
	}
	public String getBreath() {
		return breath;
	}
	public void setBreath(String breath) {
		this.breath = breath;
	}
	public String getHeat() {
		return heat;
	}
	public void setHeat(String heat) {
		this.heat = heat;
	}
    public void displaydinodetails() {
    	System.out.println("Dino Report");
    	System.out.println("Base Dino properties");
    	System.out.println(species1+"is a"+consumptiontype1);
    }
}
