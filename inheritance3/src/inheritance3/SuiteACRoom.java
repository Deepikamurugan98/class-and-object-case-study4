package inheritance3;

public class SuiteACRoom extends HotelRoom {
	private static String hotelname;
	private String hostelname2;
	private int noOfSqClaw2;
	private int ratePerSqClaw2;
	private boolean hasWifi2;
	private boolean hasAC2;
	public SuiteACRoom(String hostelname2, int noOfSqClaw2, int ratePerSqClaw2, boolean hasWifi2, boolean hasAC2) {
		super(hotelname);
		this.hostelname2 = hostelname2;
		this.noOfSqClaw2 = noOfSqClaw2;
		this.ratePerSqClaw2 = ratePerSqClaw2;
		this.hasWifi2 = hasWifi2;
		this.hasAC2 = hasAC2;
	}
	public String getHostelname2() {
		return hostelname2;
	}
	public void setHostelname2(String hostelname2) {
		this.hostelname2 = hostelname2;
	}
	public int getNoOfSqClaw2() {
		return noOfSqClaw2;
	}
	public void setNoOfSqClaw2(int noOfSqClaw2) {
		this.noOfSqClaw2 = noOfSqClaw2;
	}
	public int getRatePerSqClaw2() {
		return ratePerSqClaw2;
	}
	public void setRatePerSqClaw2(int ratePerSqClaw2) {
		this.ratePerSqClaw2 = ratePerSqClaw2;
	}
	public boolean isHasWifi2() {
		return hasWifi2;
	}
	public void setHasWifi2(boolean hasWifi2) {
		this.hasWifi2 = hasWifi2;
	}
	public boolean isHasAC2() {
		return hasAC2;
	}
	public void setHasAC2(boolean hasAC2) {
		this.hasAC2 = hasAC2;
	}
	public void calculateTariff() {
	  boolean a= true;
	  if(Boolean.compare(hasAC2,a)==0)
	  {
		  int tot=ratePerSqClaw2 + 75;
		  System.out.println("Amount:"+tot);
	  }
	  else if(Boolean.compare(hasWifi2, a)==0)
	  {
		  int tot= ratePerSqClaw2 + 50;
		  System.out.println("Amount:"+tot);
	  }
	  else
	  {
		  
		System.out.println("Amount:"+ratePerSqClaw2);  
	  }
	}

}
