package abstraction2;

public class GasDoor extends Door{
	private String doorName;
private String numberOfGas;


public GasDoor(String doorName, String numberOfGas) {
	super(doorName);
	doorName = doorName;
	this.numberOfGas = numberOfGas;
}


public String getDoorName() {
	return doorName;
}


public void setDoorName(String doorName) {
	this.doorName = doorName;
}


public String getNumberOfGas() {
	return numberOfGas;
}


public void setNumberOfGas(String numberOfGas) {
	this.numberOfGas = numberOfGas;
}


public void display() {
	String reverse="";
	int length=numberOfGas.length();
	for(int i=length-1;i>=0;i--)
	{
		reverse = reverse+numberOfGas.charAt(i);
	}
	if(numberOfGas.equals(reverse))
	{
		System.out.println("Palindrome forever");
	}
	else
	{
	  System.out.println("Not a Palindrome");	
	}
}
}
