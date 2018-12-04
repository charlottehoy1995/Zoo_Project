package zoo;

public class Dog extends Mammal {
	
	///////////////////Attributes///////////////////////////
	public String Breed;
	public int age;
	
	
		
	//////////////////Constructors//////////////////////////
	public Dog(String vBreed, int vAge, String vSpecies, String vName, String vColour) {
		super(vSpecies, vName, vColour);
		this.Breed = vBreed;
		this.age = vAge;
				
	}
	
	public Dog(Dog vDog) {
		super(vDog.getSpecies(), vDog.name);
		
	}

	//////////////////Methods///////////////////////////////
	public String getBreed() {
		return Breed;
	}

	public void setBreed(String breed) {
		this.Breed = breed;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString() {
		return "This dog is a "+ this.getSpecies()+ " and they are "+ this.age+ " years old. The dog makes a Barking noise.";
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}

		
}
