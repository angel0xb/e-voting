import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class electionOfficeHandler {
	private electionOfficer officer;
//	private ElectionOfficerHandler handler;
	
	public electionOfficeHandler(){}
	
	public electionOfficeHandler(electionOfficer officer){
		this.officer = officer;
	}
	
	public electionOfficer readOfficer(String userInput){
		String fileLocation = File.separator + "Users" + File.separator + "wyattmorris" + File.separator + "git" + File.separator +  "e-voting" + File.separator +  "ElectionOfficer.txt";
		//creates variable for the text file
		File OfficerFile = new File(fileLocation);
			
			electionOfficer elec = new electionOfficer();
			
			try {
				//creates the scanner that reads the file
				Scanner officerScanner = new Scanner(OfficerFile);
				while(officerScanner.hasNextLine()){			
					//reads the first line of the file.
					String nextLine = officerScanner.nextLine();
			
				
					//Creates a list of strings for the current line of Officer ID info
					String[] officerIDInfo = nextLine.split(",");
					String currentID = officerIDInfo[0];
					String currentName = officerIDInfo[1];
					String currentPW = officerIDInfo[2];
					
					elec = new electionOfficer(currentID, currentName,currentPW);
					//System.out.print("Officerr Name " + elec.getName() + " ");


					if(currentID.equals(userInput)){
						elec.setOfficerID(currentID);
						elec.setName(currentName);
						elec.setPass(currentPW);
						break;
					}
					else{
						elec = new electionOfficer();
					}
					
				}
				//end while loop
				if(elec.getName() == null){
					System.out.println("Officer ID not found.");
				}
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return elec;
		
		
		
	}
	
	
//	Purpose: returns true if login is valid
//	Preconditions: takes in login information to verify
//	Postconditions: returns true or false
	public boolean approveLogin(String password){
		if(password == officer.officerPassword){
			return true;
		}
		return false;	
	}
	


//	Purpose:reads get the information from the database to display and print
//	Preconditions: none
//	Postconditions:  data from the data base  
	public void readDataBase(){};
	
//	Purpose:printns out current results 
//	Preconditions: takes in a String array of the results 
//	Postconditions: prints out the results 
	public void printResults(String[] results){
		
	} 
	

	

}
