package com.assignment;

public class Flamingo extends Animal {
	
	private String featherColors = null;
	private boolean flies = false;
	private boolean talons = false;
	
	public Flamingo(String name, int walksOn, boolean furCoat, String color, String gender, float weight,
			String featherColors, boolean flies, boolean talons) {
		super(name, walksOn, furCoat, color, gender, weight);
		this.featherColors = featherColors;
		this.flies = flies;
		this.talons = talons;
	}

	public String getFeatherColors() {
		return featherColors;
	}

	public void setFeatherColors(String featherColors) {
		this.featherColors = featherColors;
	}

	public boolean isFlies() {
		return flies;
	}

	public void setFlies(boolean flies) {
		this.flies = flies;
	}

	public boolean isTalons() {
		return talons;
	}

	public void setTalons(boolean talons) {
		this.talons = talons;
	}

	@Override
	public String toString() {
		return "a Flamingo with " + featherColors + " feathers.   It is " + flies + " that the flamingo flies.  It is also " + talons + " that the flamingo has talons.  The zoo's flamingo's name is " + name
				+ ".   He walks on " + walksOn + " legs.  It is " + furCoat + " that the flamingo has a fur coat, however, Frederick is " + color + " with pink and white feathers and orange and white on his beak.  Frederick is " + gender
				+ " and weights " + weight + " lbs.";
	}
	
	

}
