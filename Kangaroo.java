package com.assignment;

public class Kangaroo extends Animal {
	
	private String travelsBy = null;
	private boolean hasPouch = false;
	private String earsAre = null;
	
	public Kangaroo(String name, int walksOn, boolean furCoat, String color, String gender, float weight,
			String travelsBy, boolean hasPouch, String earsAre) {
		super(name, walksOn, furCoat, color, gender, weight);
		this.travelsBy = travelsBy;
		this.hasPouch = hasPouch;
		this.earsAre = earsAre;
	}

	public String getTravelsBy() {
		return travelsBy;
	}

	public void setTravelsBy(String travelsBy) {
		this.travelsBy = travelsBy;
	}

	public boolean isHasPouch() {
		return hasPouch;
	}

	public void setHasPouch(boolean hasPouch) {
		this.hasPouch = hasPouch;
	}

	public String getEarsAre() {
		return earsAre;
	}

	public void setEarsAre(String earsAre) {
		this.earsAre = earsAre;
	}

	@Override
	public String toString() {
		return "a Kangaroo.  She " + travelsBy + " to travel, and it is " + hasPouch + " that as a marsupial she has a pouch.  Her ears were " + earsAre + ".  The kangaroo's name is " + name
				+ ", and she walks on " + walksOn + " feet.  Her fur coat is " + furCoat + "ly, " + color + ".  She is a " + gender
				+ " that weighs " + weight + " lbs.";
	}
	
}
