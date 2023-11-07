import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListener implements ActionListener{
	String metric;
	Measurable[] objects;
	double result;
	public ButtonListener(Measurable[] objects, String metric) {
		this.objects = objects;
		this.metric = metric;
		
	}
	public void actionPerformed(ActionEvent e) {
		if (metric == "Minimum") {
			result = Data.min(objects);	
		}
		if (metric == "Maximum") {
			result = Data.max(objects);
		}
		if (metric == "Average") {
			result = Data.average(objects);
		}
		// Printing
		if (objects[0].getClass().getName().equals("Country")) {
			System.out.println(metric + " " + "Country Area is" + " " + result);
		}
		if (objects[0].getClass().getName().equals("BankAccount")) {
			System.out.println(metric + " " + "Account Balance is" + " " + result);
		}
		if (objects[0].getClass().getName().equals("Quiz")) {
			System.out.println(metric + " " + "Quiz Score is" + " " + result);
		}
			
	}

}
