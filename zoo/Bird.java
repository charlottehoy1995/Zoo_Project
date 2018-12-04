package zoo;

public abstract class Bird extends Animal{
	
	///////////////////Attributes///////////////////////////
	public String type;
	

	//////////////////Constructors//////////////////////////
	public Bird(String vType, String vName, String vColour) {
		super(vName, vColour);
		this.type = vType;
	}		
		
	public Bird(String vType, String vName) {
		this(vType, vName, "Black");
	}
	
	//////////////////Methods///////////////////////////////
	public String getType() {
		return this.type;
	}
	
	//public abstract void sleep();
	
		
}
	
