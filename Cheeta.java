package com.assignment;

public class Cheeta extends Animal {
	
	private boolean hasTail = false;
	private String box = null;
	private int paws = 0;
	
	public Cheeta(String name, int walksOn, boolean furCoat, String color, String gender, float weight, boolean hasTail,
			String box, int paws) {
		super(name, walksOn, furCoat, color, gender, weight);
		this.hasTail = hasTail;
		this.box = box;
		this.paws = paws;
	}

	public boolean isHasTail() {
		return hasTail;
	}

	public void setHasTail(boolean hasTail) {
		this.hasTail = hasTail;
	}

	public String getBox() {
		return box;
	}

	public void setBox(String box) {
		this.box = box;
	}

	public int getPaws() {
		return paws;
	}

	public void setPaws(int paws) {
		this.paws = paws;
	}

	@Override
	public String toString() {
		return "a Cheeta with a " + hasTail + "ly magnificent tail, that " + box + " from an old refridgerator.  It has " + paws + " large paws and was named " + name + ".  Popeye walks on "
				+ walksOn + " legs.  It is  " + furCoat + " the cheeta has a fur coat and Popeye's was " + color + ".  Popeye is a " + gender + " that weighs " + weight
				+ " lbs.";
	}
	
	

}
