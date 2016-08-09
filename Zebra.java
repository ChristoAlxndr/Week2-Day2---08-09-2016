package com.assignment;

public class Zebra extends Animal {
	
	private String feet = null;
	private String coat = null;
	private boolean hasMane = false;
	
	public Zebra(String name, int walksOn, boolean furCoat, String color, String gender, float weight, String feet,
			String coat, boolean hasMane) {
		super(name, walksOn, furCoat, color, gender, weight);
		this.feet = feet;
		this.coat = coat;
		this.hasMane = hasMane;
	}

	public String getFeet() {
		return feet;
	}

	public void setFeet(String feet) {
		this.feet = feet;
	}

	public String getCoat() {
		return coat;
	}

	public void setCoat(String coat) {
		this.coat = coat;
	}

	public boolean isHasMane() {
		return hasMane;
	}

	public void setHasMane(boolean hasMane) {
		this.hasMane = hasMane;
	}

	@Override
	public String toString() {
		return "a Zebra that has feet made of " + feet + ", a coat that is " + coat + ", " + hasMane + "ly has a mane, and is named " + name + ".  She walks On "
				+ walksOn + " legs, and it is " + furCoat + " she has a fur coat that is " + color + " because of the stripes.  She is a " + gender + " and weighs " + weight
				+ " lbs.";
	}

}
