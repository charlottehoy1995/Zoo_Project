package zoo;

public class Chicken extends Bird{
	///////////////////Attributes///////////////////////////
	public String Comb;
	
	
	//////////////////Constructors//////////////////////////
	public Chicken(String vComb, String vName, String vColour) {
		super(vComb, vName, vColour);
		this.Comb = vComb;
	}
	
	public Chicken(Chicken vChicken) {
		super(vChicken.getType(), vChicken.name);
	}

	
	//////////////////Methods///////////////////////////////
	public String getComb() {
		return Comb;
	}

	public void setComb(String comb) {
		Comb = comb;
	}
	
	public String toString() {
		return "DOes this chicken have a Comb? "+this.getType()+". A"
				+ "nd they're called "+ this.name;
	}

	public Animal sleep() {
		return null;
	}

	public void eat() {
	
	}
	
}
