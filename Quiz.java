
public class Quiz implements Measurable {
	final int LOWERBOUND = 0;
	final int UPPERBOUND = 100;
	private double quizScore;
	
	public  Quiz(double quizScore) {
		if (quizScore >= LOWERBOUND && quizScore <= UPPERBOUND) {
			this.quizScore = quizScore;
		}
		else {
			System.out.println("Invalid quiz score entered");
		}
		
	}
	
	
	public double getMeasure() {
		return quizScore;
	}
}
