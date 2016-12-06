import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//Task: handles interaction between the voter and the voterUI (display)
//Input: Several inputs to handle interaction
//Output: actions

public class voteController {
	private Voter voter;
	
	public voteController(){
		
	}
	public voteController(Voter voter){
		this.voter = voter;
	}
//	Purpose: returns true if login is valid
//	Preconditions: takes in login information to verify
//	Postconditions: returns true or false
	public boolean approveSS( String lineSplit){
		System.out.println("VINFO: "+ lineSplit.split(",")[3]+ " GIVEN: " + voter.getVoterSS());
		System.out.println("VoterID: " + lineSplit.split(",")[0].trim() + " GIVEN: " + voter.getVoterID());
		System.out.println("VOTER NAME: " + lineSplit.split(",")[1].trim() + " GIVEN: " + voter.getVoterName()) ;
		System.out.println("VOTER AGE: " + lineSplit.split(",")[2].trim() + " GIVEN: " + voter.getAge());
		
		
		
		boolean sol = false;
			if(lineSplit.split(",")[3].trim().equals( voter.getVoterSS()) && 
					lineSplit.split(",")[0].trim().equals(( voter.getVoterID())) &&
					lineSplit.split(",")[1].trim().equals( voter.getVoterName()) && 
					 Integer.parseInt(lineSplit.split(",")[2].trim()) == voter.getAge() &&
							 Integer.parseInt(lineSplit.split(",")[2].trim()) >= 18){
				sol = true;
				}
			
		return sol;
					
	}
	
	public Voter readVoter(String voterID){
		 String voteIDInput = voterID;
	     File originalFile = new File("voter.txt");
//	     BufferedReader br = new BufferedReader(new FileReader(originalFile));
	     
		Voter v = new Voter();
		
		try {
			//creates the scanner that reads the file
			Scanner vScanner = new Scanner(originalFile);
			
			//reads the first line of the file.
			
			
			while(vScanner.hasNextLine()){
			//Creates a list of strings for the current line of Officer ID info
				
				String nextLine = vScanner.nextLine();
				
				
				String[] voterInfo = nextLine.split(",");
				String currentID = voterInfo[0];
				String currentName = voterInfo[1];
				String currentSS = voterInfo[3];

				v = new Voter(currentID,currentName,21,currentSS);
//				System.out.println("VoterID " + v.getVoterID());
//					System.out.println("next " + nextLine);
					if(currentID.equals(voteIDInput)){
						v.setVoterID(currentID);
						v.setVoterName(currentName);
						v.setVoterSS(currentSS);
						break;
					}
				
					else{
						v = new Voter();
						
					}
			}
			//end while loop
			if(v.getVoterID() == null){
				System.out.println("Not Registered");
			}
			else{
//			System.out.println("Voter " + v.getVoterName());
				System.out.println("ID Found");
			}
				
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return v;
	}
	
	public void login(){
		
	}
	
	
//	Purpose:not needed approveLogin will handle this
//	Preconditions: none
//	Postconditions:  
//	danyVote()
	
	
//	Purpose: distribute votes to candidates this function may be given to candidates
//	Preconditions: given the candidate 
//	Postconditions: votes will be distributed to the candidate
	public void distribute(candidate[] candidates){
		
		
	}
	
//	Purpose: print out ticket
//	Preconditions: takes voter information and review for printing purposes 
//	Postconditions: collective information will be printed on a ticket 
	public void printTicket(String voterInfo, String review){
		
	}
//	Purpose: transfer data safely to data base
//	Preconditions: 
//	Postconditions: data is transfered to database. 
	public void saveToDatabase(){
		
	}
	

}
