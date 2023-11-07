import java.util.Scanner;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MeasurableViewer {
	private static final int FRAMEWIDTH = 100;
	private static final int FRAMEHEIGHT = 100;
	public static void main(String[] args) {
		final int MAXIMUM = 1;
		final int MINIMUM = 2;
		final int AVERAGE = 3;
		
		//bank objects
		Measurable[] bank = new Measurable[3];
	    bank[0] = new BankAccount(176220);
	    bank[1] = new BankAccount(513120);
	    bank[2] = new BankAccount(30510);
	    //country objects
	    Measurable[] countries = new Measurable[3];
	    countries[0] = new Country("Uruguay", 176220);
	    countries[1] = new Country("Thailand", 513120);
	    countries[2] = new Country("Belgium", 30510);
	    //quiz objects
	    Measurable[] quiz = new Measurable[5];
	    quiz[0] = new Quiz(95);
	    quiz[1] = new Quiz(80);
	    quiz[2] = new Quiz(90);
	    quiz[3] = new Quiz(50);
	    quiz[4] = new Quiz(75);
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter metric to use, 1 for maximum, 2 for minimum, 3 for average: ");
		int metricChoice = in.nextInt();
		if (metricChoice >= 0 && metricChoice <= 3) {
		
		
		String metricToUse = "average";
		
		if (metricChoice == MAXIMUM) {
			metricToUse = "Maximum";
		}
		if (metricChoice == MINIMUM) {
			metricToUse = "Minimum";
		}
		if (metricChoice == AVERAGE) {
			metricToUse = "Average";
		}
		
		
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		// Create buttons	
		JButton buttonBankAccount = new JButton("Get " + metricToUse + " Balance");
		JButton buttonCountry = new JButton("Get " + metricToUse + " Area");
		JButton buttonQuiz = new JButton("Get " + metricToUse + " Score");
		// Create listeners
		ActionListener listenerBankAccount = new ButtonListener(bank, metricToUse);
		ActionListener listenerCountry = new ButtonListener(countries, metricToUse);
		ActionListener listenerQuiz = new ButtonListener(quiz, metricToUse);
		// Add listeners to buttons
		buttonBankAccount.addActionListener(listenerBankAccount);
		buttonCountry.addActionListener(listenerCountry);
		buttonQuiz.addActionListener(listenerQuiz);
		// Add buttons to panel
		panel.add(buttonBankAccount);
		panel.add(buttonCountry);
		panel.add(buttonQuiz);
		// Add panel to frame
		frame.add(panel);
		
		frame.setSize(FRAMEWIDTH, FRAMEHEIGHT);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setVisible(true);
		}
		else {
			System.out.println("Run the program again with valid input");
		}
		
		
		
		

	}

}
