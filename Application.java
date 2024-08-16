import java.util.ArrayList;

public class Application {
	
	public static void main(String[] args) throws InvalidCoordinateException, InvalidWingspanException, InvalidSubspeciesException, InvalidSimIDException {
		
		//Test Location
		System.out.println("*********************************************\n\n              Location Tests \n\n*********************************************\n");
		
		Location loc1 = new Location(3, 7);
		Location loc2 = new Location (5, 10);
		
		System.out.println("Location 1:" + loc1);
		System.out.println("Location 2: " + loc2);
		
		loc2.update(8,  12);
		
		System.out.println("Updated Location 2: " + loc2);
		
		
		//Test Animal
		System.out.println("\n*********************************************\n\n              Animal Tests \n\n*********************************************\n");
		//Animal a = new Animal(); - this does not work because animal is an abstract class
		
		//Test Goldfinch	
		System.out.println("\n*********************************************\n\n              Goldfinich Tests \n\n*********************************************\n");
		Goldfinch gf1 = new Goldfinch(2, new Location(2, 1), 5.0);
		Goldfinch gf2 = new Goldfinch(1, new Location(3, 4), 7.0);
		
		System.out.println("Goldfinch 1: " + gf1);
		System.out.println("Goldfinch 2: " + gf2);
		
		gf2.fly(new Location (10, 15));
		gf1.walk(0); //move right
		
		System.out.println("Goldfinch 1 after walking: " + gf1);
		System.out.println("Goldfinch 2 after flying: " + gf2);

		
		//Test BrownBear
		System.out.println("\n*********************************************\n\n              BrownBear Tests \n\n*********************************************\n");
		BrownBear bear1 = new BrownBear(1, new Location(2, 3), "Alaskan");
		BrownBear bear2 = new BrownBear(2, new Location(5, 8), "Kodiak");
		
		System.out.println("Bear 1: " + bear1);
		System.out.println("Bear 2: " + bear2);
		
		bear1.swim(2); //move down
		bear2.walk(0); //move the bear up
		
		System.out.println("Bear 1 after swimming: " + bear1);
		System.out.println("Bear 2 after walking: " + bear2);

		//Test Generics
		System.out.println("\n*********************************************\n\n              Generics Tests \n\n*********************************************\n");
		ArrayList<Animal> animals = new ArrayList<>();
		animals.add(new Goldfinch(3, new Location(2, 3), 8.5));
		animals.add(new Goldfinch(4, new Location(7, 9), 10.0));
		animals.add(new BrownBear(5, new Location(1, 2), "Grizzly"));
		animals.add(new BrownBear(6, new Location(10, 11), "Siberian"));
		
		for (Animal animal : animals) {
			System.out.println(animal.toString());
		}


		
	} //end main

} //end class
