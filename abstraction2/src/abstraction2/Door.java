package abstraction2;

public class Door {
	protected String doorName;

	public Door(String doorName) {
		super();
		this.doorName = doorName;
	}

	public String getDoorName() {
		return doorName;
	}

	public void setDoorName(String doorName) {
		this.doorName = doorName;
	}

}
