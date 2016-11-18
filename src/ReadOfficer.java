import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadOfficer {

	public static void main(String[] args) {
		//creates a variable for path of the file
		String fileLocation = File.separator + "Users" + File.separator + "wyattmorris" + File.separator + "git" + File.separator +  "e-voting" + File.separator +  "ElectionOfficer.txt";
		//creates variable for the text file
		File OfficerFile = new File(fileLocation);
		
		try {
			//creates the scanner that reads the file
			Scanner officerScanner = new Scanner(OfficerFile);
			
			//reads the first line of the file.
			String nextLine = officerScanner.nextLine();
			
			System.out.println("Next line: " + nextLine);
			
			String[] officerIDInfo = nextLine.split(",");
			System.out.println(officerIDInfo[0]);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		}
	
	
}
