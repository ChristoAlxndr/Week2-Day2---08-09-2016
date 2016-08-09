package com.assignment;

public class Animal {
	
	protected String name = null;
	protected int walksOn = 0;
	protected boolean furCoat = true;
	protected String color = null;
	protected String gender = null;
	protected float weight = 0.0f;
	
	public Animal(String name, int walksOn, boolean furCoat, String color, String gender, float weight) {
		this.name = name;
		this.walksOn = walksOn;
		this.furCoat = furCoat;
		this.color = color;
		this.gender = gender;
		this.weight = weight;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWalksOn() {
		return walksOn;
	}

	public void setWalksOn(int walksOn) {
		this.walksOn = walksOn;
	}

	public boolean isFurCoat() {
		return furCoat;
	}

	public void setFurCoat(boolean furCoat) {
		this.furCoat = furCoat;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}	
	
}
