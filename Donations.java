package edu.monmouth.donations;

public class Donations {
	private int numIndividual;
	private double amtIndividual;
	private int numBusiness;
	private double amtBusiness;
	private int numOther;
	private double amtOther;
	
	public void processDonation(String cat, double donation) {
		if (cat.equals("business donation")){
			if (donation > 0) {
				this.numBusiness = numBusiness + 1;
				this.amtBusiness  = amtBusiness + donation;
				}
			else {
				this.numBusiness = numBusiness - 1;
				this.amtBusiness = amtBusiness + donation;
			}
			}
				
		
		else if (cat.equals("individual donation")){
			if (donation > 0) {
				this.numIndividual = numIndividual + 1;
				this.amtIndividual = amtIndividual + donation;
				}
			else {
				this.numIndividual = numIndividual - 1;
				this.amtIndividual = numIndividual + donation;
			}
		}
		else if (cat.equals("other donation")){
			if (donation > 0) {
				this.numOther = numOther + 1;
				this.amtOther = amtOther + donation;
				}
			else {
				this.numOther = numOther -1;
				this.amtOther = amtOther + donation;
			}
		}
	}
	public double getStatisticsBusinessAmt() {
		return  amtBusiness;
	}
	public int getStatisticsBusinessNum() {
		return numBusiness;
	}
	public double getStatisticsIndividualAmt() {
		return amtIndividual;
	}
	public int getStatisticsIndividualNum() {
		return numIndividual;
	}
	public double getStatisticsOtherAmt() {
		return amtOther;
	}
	public int getStatisticsOtherNum() {
		return numOther;
	}
	

}
