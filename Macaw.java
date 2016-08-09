package com.assignment;

public class Macaw extends Animal {
	
	private float length = 0.0f;
	private boolean flies = false;
	private int talons = 0;
	
	public Macaw(String name, int walksOn, boolean furCoat, String color, String gender, float weight, float length,
			boolean flies, int talons) {
		super(name, walksOn, furCoat, color, gender, weight);
		this.length = length;
		this.flies = flies;
		this.talons = talons;
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public boolean isFlies() {
		return flies;
	}

	public void setFlies(boolean flies) {
		this.flies = flies;
	}

	public int getTalons() {
		return talons;
	}

	public void setTalons(int talons) {
		this.talons = talons;
	}

	@Override
	public String toString() {
		return "a Macaw with a length of " + length + " inches long.  It is " + flies + " that the macaw flies and has " + talons + " talons.   The macaw's name is " + name + " and when she walks, she walks on "
				+ walksOn + " feet.  It is " + furCoat + " that the macaw has a fur coat, but this macaw's feather's were " + color + ".  Pedro is a " + gender + " and weighs " + weight
				+ " lbs.";
	}
	
}
