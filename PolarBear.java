package com.assignment;

public class PolarBear extends Animal {
	
	private int numberOfClaws = 0;
	private String eats = null;
	private boolean walksOnTwoFeet = false;
	
	public PolarBear(String name, int walksOn, boolean furCoat, String color, String gender, float weight,
			int numberOfClaws, String eats, boolean walksOnTwoFeet) {
		super(name, walksOn, furCoat, color, gender, weight);
		this.numberOfClaws = numberOfClaws;
		this.eats = eats;
		this.walksOnTwoFeet = walksOnTwoFeet;
	}

	public int getNumberOfClaws() {
		return numberOfClaws;
	}

	public void setNumberOfClaws(int numberOfClaws) {
		this.numberOfClaws = numberOfClaws;
	}

	public String getEats() {
		return eats;
	}

	public void setEats(String eats) {
		this.eats = eats;
	}

	public boolean isWalksOnTwoFeet() {
		return walksOnTwoFeet;
	}

	public void setWalksOnTwoFeet(boolean walksOnTwoFeet) {
		this.walksOnTwoFeet = walksOnTwoFeet;
	}

	@Override
	public String toString() {
		return "a PolarBear with a number Of Claws totaling " + numberOfClaws + ".  The polar bear eats " + eats + ", and it is " + walksOnTwoFeet
				+ " that it can walk on two feet.  This bear's name is " + name + " and she walks on " + walksOn + " paws.  The polar bear " + furCoat + "ly has a fur coat that is " + color + " in color.  Coca-Cola is a "
				+ gender + " that weighs " + weight + " lbs.";
	}
	
}
