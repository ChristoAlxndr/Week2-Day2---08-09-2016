package com.assignment;

public class Elephant extends Animal {
	
	private String nose = null;
	private boolean tusks = true;
	private float height = 0.0f;
	
	public Elephant(String name, int walksOn, boolean furCoat, String color, String gender, float weight, String nose,
			boolean tusks, float height) {
		super(name, walksOn, furCoat, color, gender, weight);
		this.nose = nose;
		this.tusks = tusks;
		this.height = height;
	}

	public String getNose() {
		return nose;
	}

	public void setNose(String nose) {
		this.nose = nose;
	}

	public boolean isTusks() {
		return tusks;
	}

	public void setTusks(boolean tusks) {
		this.tusks = tusks;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "an Elephant who has a " + nose + " for a nose, and it was " + tusks + " that it had two large tusks.  He was " + height + " feet tall,  and was named " + name + ".  Tutu walks on "
				+ walksOn + " feet.  It is " + furCoat + " that the elephant has a fur coat, but true that the elephant is " + color + ".  Tutu is " + gender + " and weighs " + weight
				+ " lbs.";
	}

	
	
}
