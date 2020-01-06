package inheritance3;

public class DeluxeRoom extends HotelRoom {
	private String hotelname;
	private int noOfSqClaw;
	private int ratePerSqClaw;
	private boolean hasWifi;
	private boolean hasAC;
	public DeluxeRoom(String hotelname, int noOfSqClaw, int ratePerSqClaw, boolean hasWifi,
			boolean hasAC) {
		super(hotelname);
		this.hotelname = hotelname;
		this.noOfSqClaw = noOfSqClaw;
		this.ratePerSqClaw = ratePerSqClaw;
		this.hasWifi = hasWifi;
		this.hasAC = hasAC;
	}
	public String getHotelname() {
		return hotelname;
	}
	public void setHotelname(String hotelname) {
		this.hotelname = hotelname;
	}
	public int getNoOfSqClaw() {
		return noOfSqClaw;
	}
	public void setNoOfSqClaw(int noOfSqClaw) {
		this.noOfSqClaw = noOfSqClaw;
	}
	public int getRatePerSqClaw() {
		return ratePerSqClaw;
	}
	public void setRatePerSqClaw(int ratePerSqClaw) {
		this.ratePerSqClaw = ratePerSqClaw;
	}
	public boolean isHasWifi() {
		return hasWifi;
	}
	public void setHasWifi(boolean hasWifi) {
		this.hasWifi = hasWifi;
	}
	public boolean isHasAC() {
		return hasAC;
	}
	public void setHasAC(boolean hasAC) {
		this.hasAC = hasAC;
	}
	public void calculateTariff() {
		boolean a=true;
		if(Boolean.compare(hasWifi,a)==0)
		{
			int tot=ratePerSqClaw + 10;
			System.out.println("Amount:"+tot);
		}
		else if(Boolean.compare(hasWifi,a)==1)
		{
			System.out.println("Amount:"+ratePerSqClaw);
		}
	}

}
