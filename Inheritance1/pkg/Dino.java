
public class Dino{
	private String Species;
	private String lt;
	private boolean hasresistant;
	public Dino(String species, String lt, boolean hasresistant) {
		this.Species = species;
		this.lt = lt;
		this.hasresistant=hasresistant;
	}
	public String getSpecies() {
		return Species;
	}
	public void setSpecies(String species) {
		Species = species;
	}
	public String getLt() {
		return lt;
	}
	public void setLt(String lt) {
		this.lt = lt;
	}
	
	public boolean isHasresistant() {
		return hasresistant;
	}
	public void setHasresistant(boolean hasresistant) {
		this.hasresistant = hasresistant;
	}
	public void display(String Species,String lt,boolean hasresistant) {
		System.out.println("Species: "+this.Species+"\n");
		System.out.println("Locomotion type: "+this.lt+"\n");
		System.out.println("HasHeatResistant:"+this.hasresistant+"\n");
	}
	

}
