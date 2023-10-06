package edu.monmouth.donations;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DonationsTester {

	public static void main(String[] args) throws FileNotFoundException {
		File inputFile = new File("Donations.txt");
		Scanner console = new Scanner(System.in);
		System.out.println("Would you like to process donations now? (enter 'Yes' to continue): ");
		String keepGoing = console.next();
		console.close();
		Donations giveToMe = new Donations();
		if (keepGoing.equals("Yes")) {
		
		Scanner reader = new Scanner(inputFile);
		while (reader.hasNextLine()) {
			String data = reader.nextLine();
			String[] lines = data.split("[<>]");
			String type = lines[1];
			if (lines[1].equals("EOF")) {
				break;
			}
			String numstr = lines[2];
			double num = Double.parseDouble(numstr);
			
			giveToMe.processDonation(type, num);
			
		}
		System.out.printf("Individual: #:%d $%.1f %n",giveToMe.getStatisticsIndividualNum(),giveToMe.getStatisticsIndividualAmt());
		System.out.printf("Business: #:%d $%.1f %n",giveToMe.getStatisticsBusinessNum(),giveToMe.getStatisticsBusinessAmt());
		System.out.printf("Other: #:%d $%.1f %n",giveToMe.getStatisticsOtherNum(),giveToMe.getStatisticsOtherAmt());
		
		reader.close();
		
		}
		else {
			System.out.println("Ending now without processing donations");
		}
		
		
		
	}

}


