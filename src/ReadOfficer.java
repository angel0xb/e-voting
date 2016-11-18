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
		
		electionOfficer e = new electionOfficer();
		
		try {
			//creates the scanner that reads the file
			Scanner officerScanner = new Scanner(OfficerFile);
			
			//reads the first line of the file.
			String nextLine = officerScanner.nextLine();
			
			//System.out.println("Next line: " + nextLine);
			
			//Creates a list of strings for the current line of Officer ID info
			String[] officerIDInfo = nextLine.split(",");
			String currentID = officerIDInfo[0];
			String currentName = officerIDInfo[1];
			String currentPW = officerIDInfo[3];
			
			while(!nextLine.equals(null)){
				if(currentID.equals(nextLine)){
					e.setOfficerID(currentID);
					e.setName(currentName);
					e.setPass(currentPW);
					
				}
				else{
					nextLine = officerScanner.nextLine();
				}
			}
				
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		}
	
	
}
