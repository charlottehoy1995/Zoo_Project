package zoo;

public abstract class Animal {
	
	///////////////////Attributes///////////////////////////
	public String name;
	public String colour ;
	
	
	//////////////////Constructors//////////////////////////
	public Animal(String vName) {
		this.name = vName;
		this.colour = "Black";
		
	}
	
	public Animal(String vName, String vColour) {
		this.name = vName;
		this.colour = vColour;
		
	}
	
	
	//////////////////Methods///////////////////////////////
	
	public void setColour(String vColour) {
		this.colour = vColour;
	}
	
	public abstract Animal sleep();
	
	public abstract void eat();

		
}
