package class3;

public class Activity {
	private byte match;
	private byte wins;
	private byte losses;
	private float als;
	private float mls;
	private float atd;
	private float mtd;
	public Activity(byte match, byte wins, byte losses, float als, float mls, float atd, float mtd) {
		super();
		this.match = match;
		this.wins = wins;
		this.losses = losses;
		this.als = als;
		this.mls = mls;
		this.atd = atd;
		this.mtd = mtd;
	}
	public void display() {
		System.out.println("Matches Played: "+ this.match);
		System.out.println("Number of Wins: "+ this.wins);
		System.out.println("Number of Losses: "+ this.losses);
		System.out.println("Average lap Speed: "+ this.als);
		System.out.println("maximum lap Speed: "+ this.mls);
		System.out.println("Average Throws Distance: "+ this.atd);
		System.out.println("Maximum Throws Distance: "+ this.mtd);
	}

}
