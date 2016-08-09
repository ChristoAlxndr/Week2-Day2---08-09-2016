package com.assignment;

public class BaldEagle extends Animal {
	
	private boolean wings = true;
	private String featherColors = null;
	private int talons = 0;
	
		public BaldEagle(String name, int walksOn, boolean furCoat, String color, String gender, float weight,
			boolean wings, String featherColors, int talons) {
		super(name, walksOn, furCoat, color, gender, weight);
		this.wings = wings;
		this.featherColors = featherColors;
		this.talons = talons;
	}

	public boolean isWings() {
		return wings;
	}

	public void setWings(boolean wings) {
		this.wings = wings;
	}

	public String getFeatherColors() {
		return featherColors;
	}

	public void setFeatherColors(String featherColors) {
		this.featherColors = featherColors;
	}

	public int getTalons() {
		return talons;
	}

	public void setTalons(int talons) {
		this.talons = talons;
	}

	@Override
	public String toString() {
		return " a bald eagle and it's " + wings + " it has two wings.  Its  feather colors are " + featherColors + ".  The bald eagle has talons numbering " + talons + ".  The eagle's name was "
				+ name + ".  When on the ground an eagle walks on " + walksOn + " feet.  It is " + furCoat + " that the eagle has a fur coat.  The eagle is " + color + " with white and brown feathers, and yellow feet.  Freedom is a " + gender
				+ ",  and weights " + weight + " lbs.";
	}

	
	
}
