package com.assignment;

import java.util.ArrayList;

public class Zoo {

	public static void main(String[] args) {
		
		ArrayList<Animal> weBoughtAZoo = new ArrayList<>();
		
		Animal animal1 = new Elephant("Tutu the elephant", 4, false, "grey", "male", 15_400.2f, "trunk", true, 11.3f);
		Animal animal2 = new BaldEagle("Freedom the American bald eagle", 2, false, "multi-colored", "female", 13.7f, true, "white over brown", 4);
		Animal animal3 = new Flamingo("Frederick the flamingo", 2, false, "multi-colored", "male", 7.3f, "pink over white", false, false);
		Animal animal4 = new PolarBear("Coca-Cola the polar bear", 4, true, "translucent", "female", 1300.7f, 20, "seals", true);
		Animal animal5 = new Cheeta("Popeye the cheeta", 4, true, "multi-colored", "male", 145.0f, true, "plays in a box", 4);
		Animal animal6 = new Zebra("Fruit Stripe the zebra", 4, true, "multi-colored", "female", 457.9f, "hooves", "striped", true);
		Animal animal7 = new Macaw("Pedro the macaw", 2, false, "blue and gold", "female", 3.0f, 33.9f, true, 4);
		Animal animal8 = new Monkey("Christopher the monkey", 2, true, "black", "male", 15.0f, true, "black", "trees");
		Animal animal9 = new Lion("Simba the lion", 4, true, "golden", "male", 425.4f, true,	"roar", true);
		Animal animal10 = new Kangaroo("Aussie the kangaroo", 2, true, "brown", "female", 202.5f, "hops", true, "pointy");
		
		weBoughtAZoo.add(animal1);
		weBoughtAZoo.add(animal2);
		weBoughtAZoo.add(animal3);
		weBoughtAZoo.add(animal4);
		weBoughtAZoo.add(animal5);
		weBoughtAZoo.add(animal6);
		weBoughtAZoo.add(animal7);
		weBoughtAZoo.add(animal8);
		weBoughtAZoo.add(animal9);
		weBoughtAZoo.add(animal10);
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Today at the zoo, I saw" + weBoughtAZoo.get(i).toString());
		}

	}

}
