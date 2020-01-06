package inheritance4;

public class DragonDino extends LavaDino {
	private String species2;
	private String consumptiontype2;
	private String breath2;
	private String heat2;
	private int noofwings;
	private int noofscales;
	public DragonDino(String species2,String consumptiontype2, String breath2, String heat2, int noofwings, int noofscales) {
		super(species2, consumptiontype2, breath2, heat2);
		this.species2 = species2;
		this.consumptiontype2 = consumptiontype2;
		this.breath2 = breath2;
		this.heat2 = heat2;
		this.noofwings = noofwings;
		this.noofscales = noofscales;
	}
	public String getSpecies2() {
		return species2;
	}
	public void setSpecies2(String species2) {
		this.species2 = species2;
	}
	public String getConsumptiontype2() {
		return consumptiontype2;
	}
	public void setConsumptiontype2(String consumptiontype2) {
		this.consumptiontype2 = consumptiontype2;
	}
	public String getBreath2() {
		return breath2;
	}
	public void setBreath2(String breath2) {
		this.breath2 = breath2;
	}
	public String getHeat2() {
		return heat2;
	}
	public void setHeat2(String heat2) {
		this.heat2 = heat2;
	}
	public int getNoofwings() {
		return noofwings;
	}
	public void setNoofwings(int noofwings) {
		this.noofwings = noofwings;
	}
	public int getNoofscales() {
		return noofscales;
	}
	public void setNoofscales(int noofscales) {
		this.noofscales = noofscales;
	}
	
public void displaydinodetails() {
	System.out.println("Dino Report");
	System.out.println("Dragon Dino Properties");
	System.out.println("Flies with"+noofwings+"wings");
	System.out.println("Has"+noofscales+"Scales");
	System.out.println("Inherit Dino Properties:");
	System.out.println(species+"Breath fire");
	System.out.println("It is Resistent to heat");
	System.out.println("Inherited base Dino Properties");
	System.out.println(species+"is a herbivore");
}
}
