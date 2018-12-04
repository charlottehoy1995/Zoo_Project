package zoo;

public abstract class Mammal extends Animal {
	
	///////////////////Attributes///////////////////////////
	private String species;
	
	
	
	//////////////////Constructors//////////////////////////
	public Mammal(String vSpecies, String vName, String vColour) {
		super(vName, vColour);
		this.species = vSpecies;
		
	}
	
	public Mammal(String vSpecies, String vName) {
		this(vSpecies, vName, "Black");
		
	}


	//////////////////Methods///////////////////////////////
	public Mammal sleep() {
		return this;
	}
	
	
	public String getSpecies() {
		return this.species;
	}
	
	
}
