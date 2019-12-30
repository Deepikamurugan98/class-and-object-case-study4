package class1;

public class Team {
	private String Teamname;
	private String city;
	public Team(String teamname, String city) {
		super();
		this.Teamname = teamname;
		this.city = city;
		System.out.println("TeamName: "+teamname+"  city: "+city);
	}
}
