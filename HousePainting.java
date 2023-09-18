import java.util.Scanner;
public class HousePainting {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	//Get all input
	System.out.print("Please enter the cost per square foot: ");
	double costPerSqft = sc.nextDouble();
	
	System.out.print("Please enter the length of the house in feet: ");
	double houseLength = sc.nextDouble();
	
	System.out.print("Please enter width of the house in feet: ");
	double houseWidth = sc.nextDouble();
	
	System.out.print("Please enter the height of the house in feet: ");
	double houseHeight = sc.nextDouble();
	
	System.out.print("Please enter the number of windows: ");
	double numWindows = sc.nextDouble();
	
	System.out.print("Please enter the length of a window: ");
	double windowLength = sc.nextDouble();
	
	System.out.print("Please enter the width of a window: ");
	double windowWidth = sc.nextDouble();
	
	System.out.print("Please enter the number of doors: ");
	double numDoors = sc.nextDouble();
	
	System.out.print("Please enter the length of a door: ");
	double doorLength = sc.nextDouble();
	
	System.out.print("Please enter the width of a door: ");
	double doorWidth = sc.nextDouble();

	sc.close();
	//Do calculations
	double windowSqft = (windowWidth * windowLength * numWindows);
	double doorSqft = (doorWidth * doorLength * numDoors);
	double normalSideHouseSqft = 2 * houseLength * houseWidth;
	double peakSideHouseSqft = ((houseLength * houseWidth) + (.5*(houseLength*(houseHeight-houseWidth))))*2;
	double subtractedSpace = windowSqft + doorSqft;
	double totalSqftOfHouse = normalSideHouseSqft + peakSideHouseSqft;
	double exactHouseSqft = totalSqftOfHouse - subtractedSpace; 
	double totalCost = costPerSqft * exactHouseSqft;

	//Output results
	System.out.println("Your total paintable surface area is " + exactHouseSqft);
	System.out.println(String.format("%s$%,.2f", "Your estimate is ",totalCost));
	}

}
