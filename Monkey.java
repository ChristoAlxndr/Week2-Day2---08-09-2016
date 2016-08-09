package com.assignment;

public class Monkey extends Animal {
	
	private boolean hasTail = false;
	private String eyeColor = null;
	private String livesIn = null;
	
	public Monkey(String name, int walksOn, boolean furCoat, String color, String gender, float weight, boolean hasTail,
			String eyeColor, String livesIn) {
		super(name, walksOn, furCoat, color, gender, weight);
		this.hasTail = hasTail;
		this.eyeColor = eyeColor;
		this.livesIn = livesIn;
	}

	public boolean isHasTail() {
		return hasTail;
	}

	public void setHasTail(boolean hasTail) {
		this.hasTail = hasTail;
	}

	public String getEyeColor() {
		return eyeColor;
	}

	public void setEyeColor(String eyeColor) {
		this.eyeColor = eyeColor;
	}

	public String getLivesIn() {
		return livesIn;
	}

	public void setLivesIn(String livesIn) {
		this.livesIn = livesIn;
	}

	@Override
	public String toString() {
		return " a Monkey with a " + hasTail + "ly long tail and eyes colored " + eyeColor + ".   This monkey lives in the " + livesIn + " of his cage.  His name is " + name
				+ " and he walks on " + walksOn + " feet.   Christopher has a fur coat that is " + furCoat + "ly " + color + " in color.  Christopher is a " + gender
				+ " that weighs " + weight + " lbs.";
	}

	
	
}
