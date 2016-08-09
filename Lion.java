package com.assignment;

public class Lion extends Animal {
	
	private boolean mane = false;
	private String callsBy = null;
	private boolean hasTail = false;
	
	public Lion(String name, int walksOn, boolean furCoat, String color, String gender, float weight, boolean mane,
			String callsBy, boolean hasTail) {
		super(name, walksOn, furCoat, color, gender, weight);
		this.mane = mane;
		this.callsBy = callsBy;
		this.hasTail = hasTail;
	}

	public boolean isMane() {
		return mane;
	}

	public void setMane(boolean mane) {
		this.mane = mane;
	}

	public String getCallsBy() {
		return callsBy;
	}

	public void setCallsBy(String callsBy) {
		this.callsBy = callsBy;
	}

	public boolean isHasTail() {
		return hasTail;
	}

	public void setHasTail(boolean hasTail) {
		this.hasTail = hasTail;
	}

	@Override
	public String toString() {
		return "A Lion,  it is " + mane + " that it has a mane, and that it calls by a " + callsBy + ".  Yes, it is " + hasTail + " it has a tail. It's name was " + name + " and it walks on "
				+ walksOn + " paws.  His coat is " + furCoat + "ly, " + color + ".  Simba is a " + gender + ",  and weighs " + weight + " lbs.";
	}
	
}
