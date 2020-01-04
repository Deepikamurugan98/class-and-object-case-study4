
public class lavaDino extends Dino {
	private boolean hasresistant;
public lavaDino(String species, String lt, boolean hasresistant) {
		super(species ,lt, hasresistant);
		this.hasresistant = hasresistant;
	}
public  void display(String Species, String lt, boolean hasresistant) 
{
	super.display(Species, lt, hasresistant);
	
	if(hasresistant)
	{
		
		System.out.println("Species "+Species+" not exit");
	}
	else
	{
		
		
		
		System.out.println("Species "+Species+" exit");
	}
	
}
	
	
}
