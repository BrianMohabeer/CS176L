package edu.monmouth.microwaveproblem;

public class MicrowaveTester {

	public static void main(String[] args) {
		Microwave myMicrowave = new Microwave();
		System.out.printf("Time button was pressed. Time is %d seconds%n", myMicrowave.time());
		System.out.printf("Time button was pressed. Time is %d seconds %n", myMicrowave.time());
		System.out.printf("Power button was pressed. Power is level is %d%n", myMicrowave.power());
		myMicrowave.start();
		myMicrowave.reset();
		
	}

}
