import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
   Used to test the BlankLinesRemover class.
*/
public class InputOutputFiles
{
   public static void main(String[] args) throws FileNotFoundException
   {
	  boolean verify = true;
	  while (verify == true) {
		  
		  try {
			  Scanner scan = new Scanner(System.in);
			  System.out.println("Please enter the path to open the input file for example C:\\Downloads\\lines.txt");
			  String input = scan.next();
			  File inputFile = new File(input);
			  PrintWriter outputFile = new PrintWriter("C:\\Users\\geckert\\Downloads\\e02\\student\\outlines.txt");
			  Scanner in = new Scanner(inputFile);
	  
			  while (in.hasNext()) 
			  {
				  String what = in.next();
				  outputFile.println(what);
			  }
	  
			  scan.close();
			  in.close();
			  outputFile.close();
			  
			  verify = false;
			  
		  } catch (Exception FileNotFoundException) {
			  System.out.println("File not found, please try again");
			  
		  }
	  	}
	  
   }
}
