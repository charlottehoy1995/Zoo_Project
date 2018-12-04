package zoo;

public class Cat extends Mammal {


	///////////////////Attributes///////////////////////////
	public int weight;	
	
	
	
	//////////////////Constructors//////////////////////////
	public Cat(int vWeight, String vSpecies, String vName, String vColour) {
		super(vSpecies, vName, vColour);
		this.weight = vWeight;
	}
	
	public Cat(Cat vCat) {
		super(vCat.getSpecies(), vCat.name);
	}
	
		
	
	//////////////////Methods///////////////////////////////
	public void setWeight(int weight) {
		this.weight = weight;
	}

	
	public String toString() {
		return "This Cat is a "+this.getSpecies()+" and they're called "+ this.name;
	}

	
	public void eat() {
	}
}
	


