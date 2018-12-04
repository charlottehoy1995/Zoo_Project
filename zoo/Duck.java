package zoo;

public 
class Duck extends Bird{
	
	///////////////////Attributes///////////////////////////
	public String Gender;
	
	
	//////////////////Constructors//////////////////////////
	public Duck(String vGender, String vType, String vSize, String vName, String vColour) {
		super(vType, vName, vColour);
		this.Gender = vGender;
	}
	
	public Duck(Duck vDuck) {
		super(vDuck.getType(), vDuck.name);
	}


	//////////////////Methods///////////////////////////////
	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}
		

	public String toString() {
		return "This Duck is a "+this.getType()+" and they're called "+ this.name;
	}

	@Override
	public Animal sleep() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}
	
}
