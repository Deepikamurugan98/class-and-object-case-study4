package polymorphism2;

public class Machine {
	private float energy;
	private float energyReserve;
    private float remainingEnergy;
	public Machine(float energy, float energyReserve, float remainingEnergy) {
		super();
		this.energy = energy;
		this.energyReserve = energyReserve;
		this.remainingEnergy = remainingEnergy;
	}
	public float getEnergy() {
		return energy;
	}
	public void setEnergy(float energy) {
		this.energy = energy;
	}
	public float getEnergyReserve() {
		return energyReserve;
	}
	public void setEnergyReserve(float energyReserve) {
		this.energyReserve = energyReserve;
	}
	public float getRemainingEnergy() {
		return remainingEnergy;
	}
	public void setRemainingEnergy(float remainingEnergy) {
		this.remainingEnergy = remainingEnergy;
	}
    public void display() {
    	float blc,out;
    	blc=energyReserve+energy;
    	out=remainingEnergy-blc;
    	System.out.println(out);
    }
}
