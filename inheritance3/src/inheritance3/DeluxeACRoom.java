package inheritance3;

public class DeluxeACRoom extends DeluxeRoom {
	private String hotelname1;
	private int noOfSqClaw1;
	private int ratePerSqClaw1;
	private boolean hasWifi1;
	private boolean hasAC1;
	public DeluxeACRoom(String hotelname1, int noOfSqClaw1, int ratePerSqClaw1, boolean hasWifi1, boolean hasAC1) {
		super(hotelname1,noOfSqClaw1,ratePerSqClaw1,hasWifi1,hasAC1);
		this.hotelname1 = hotelname1;
		this.noOfSqClaw1 = noOfSqClaw1;
		this.ratePerSqClaw1 = ratePerSqClaw1;
		this.hasWifi1 = hasWifi1;
		this.hasAC1 = hasAC1;
	}
	public String getHotelname1() {
		return hotelname1;
	}
	public void setHotelname1(String hotelname1) {
		this.hotelname1 = hotelname1;
	}
	public int getNoOfSqClaw1() {
		return noOfSqClaw1;
	}
	public void setNoOfSqClaw1(int noOfSqClaw1) {
		this.noOfSqClaw1 = noOfSqClaw1;
	}
	public int getRatePerSqClaw1() {
		return ratePerSqClaw1;
	}
	public void setRatePerSqClaw1(int ratePerSqClaw1) {
		this.ratePerSqClaw1 = ratePerSqClaw1;
	}
	public boolean isHasWifi1() {
		return hasWifi1;
	}
	public void setHasWifi1(boolean hasWifi1) {
		this.hasWifi1 = hasWifi1;
	}
	public boolean isHasAC1() {
		return hasAC1;
	}
	public void setHasAC1(boolean hasAC1) {
		this.hasAC1 = hasAC1;
	}
	public void calculateTariff() {
		boolean a=true;
		if(Boolean.compare(hasAC1,a)==0)
		{
			int tot = ratePerSqClaw1 +50;
			System.out.println("Amount:"+tot);
			
		}
		else if(Boolean.compare(hasAC1, a)==1)
		{
			System.out.println("Amount:"+ratePerSqClaw1);
		}
	}

}
