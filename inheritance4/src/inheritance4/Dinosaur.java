package inheritance4;

public class Dinosaur {
	protected String species;
	protected String consumptionType;
	public Dinosaur(String species, String consumptionType) {
		super();
		this.species = species;
		this.consumptionType = consumptionType;
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	public String getConsumptionType() {
		return consumptionType;
	}
	public void setConsumptionType(String consumptionType) {
		this.consumptionType = consumptionType;
	}
	public void displayDinoDetails() {
		System.out.println(species);
		System.out.println(consumptionType);
	}

}
