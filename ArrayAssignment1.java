
public class ArrayAssignment1 {

	public static void main(String[] args) {
		
		double [] values = {25.3, 100, -10, -1.5, 13, 98.6, 17, 123.145, 125.6, 123.146};
	    int LENGTH = values.length;
		for (double element : values) {
			System.out.print(element + " ");
		}
		
		double largest = values[0];
		int countNegative = 0;
		
		for (int i = 1; i < LENGTH; i++ ) {
			if (values[i] > largest) {
				largest = values[i];			}
			if (values[i] < 0) {
				countNegative++;
			}
		}
		System.out.println(" ");
		System.out.println("The largest element in the array is" + " " + largest);
		System.out.println("There are" + " " + countNegative + " " + "negative elements in the array");
	}

}
