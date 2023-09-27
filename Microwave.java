package edu.monmouth.microwaveproblem;

public class Microwave {
	private int time = 0;
	private int power = 1;
	
	public int power() {
		if (power == 1)
			power = power + 1;
		else 
			power = power -1;
		return power;
	}
	public int getPower() {
		return power;
	}
	public int time() {
		time = time + 30;
		return time;
	}
	public int getTime() {
		return time;
	}
	public void reset() {
		resetTime();
		resetPower();
		System.out.println("Reset button was pressed. Power level is 1. Time is 0 seconds.");
	}
	public void resetTime() {
	    time = 0;
	}
	public void resetPower() {
	    power = 0;
	}
	public void start() {
		System.out.printf("Cooking for %d seconds at level %d %n",getTime(), getPower() );
	}
}
