package zoo;

import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		
		Dog dog1 = new Dog("Cockapoo", 1, "Small Dog", "Alfie", "Black");
		Dog dog2 = new Dog("Labrador", 12, "Large Dog", "Copper", "Ginger");
		
		Cat cat1 = new Cat(3, "British Blue", "Jasper", "Grey");
		Cat cat2 = new Cat(2, "Sphinx", "Lexi", "Pinky");
		
		Duck duck1 = new Duck("F", "Millard", "Small", "Daisy", "Brown");
		Duck duck2 = new Duck("M", "Marbled Duck", "Medium", "Donald", "White");
		
		Chicken chick1 = new Chicken("Yes", "Clucky", "Black");
		Chicken chick2 = new Chicken("No", "Joyce", "White");
		
		
		ArrayList<Animal> zoo = new ArrayList<Animal>();
		
		zoo.add(dog1);
		zoo.add(dog2);
		
		zoo.add(cat1);
		zoo.add(cat2);
		
		zoo.add(duck1);
		zoo.add(duck2);
		
		zoo.add(chick1);
		zoo.add(chick2);
		
		for(Animal a : zoo) {
			System.out.println(a);
		}
		
	}
	
	

}
