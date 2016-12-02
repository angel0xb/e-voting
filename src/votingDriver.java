import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class votingDriver {

	public static void main(String[] args) throws IOException {
		
	     Scanner sc = new Scanner(System.in);
	     
	     System.out.println("If you are a voter, type 0 and press enter. If you are an Election Officer, type 1 and press enter.");

	     int userPath = sc.nextInt();
	     
	     if(userPath == 0){
	     
			voteController controller = new voteController();
//			getting voter info to make voter object
			System.out.println("Welcome to eVoting, type your voter ID number to start: ");
			String voterID = sc.next();
			
			voter v = controller.readVoter(voterID);
			System.out.println("SS " + v.getVoterSS().trim());

			System.out.println("Enter your social:");
			String social = sc.next() + ".";
			

			if( social.trim().equals(v.getVoterSS().trim())){
				System.out.println("CANDIDATES");
				System.out.println(" PRESS A0 to vote for  HAM, PARTY: Mario."
						+ "\n PRESS A1 to vote  for TURKEY, PARTY: PARTY2."
						+ " \n PRESS A2  to vote for ME, PARTY: PARTYY."
						+ "\n PRESS A3  to vote for YOU, PARTY: NO PARTY.");
				String candidateID = sc.next();
				database.addVote(candidateID);
				
				System.out.println("VOTE SUBMITTED");
			}
			
		
			database database = new database();
	     }
	     
	     else if(userPath == 1){
	    	 
	    	 System.out.println("Hello, please enter Officer ID.");
	    	 String ID = sc.next();
	    	 
	    	 electionOfficeHandler offHandler = new electionOfficeHandler();
	    	 electionOfficer officer = offHandler.readOfficer(ID);
	    	 
//	    	 System.out.println("Hello, please enter Officer ID.");
//	    	 String ID = sc.next();
	    	 String realpass = officer.getPass().trim();
	    	 System.out.println("(for testing purposes) Password should be: " + realpass);
	    	 System.out.println("Please enter your password.");
	    	 
	    	 String pw = sc.next();
	    	 System.out.println("this checks the pws: " + officer.getPass().trim().equals(realpass));
	    	 if(pw.equals(officer.getPass().trim())){
	    		 System.out.println("Please type the number for your next action.");
	    		 System.out.println("To view results enter the value 0. To print results enter the value 1.");
	    		 int decision = sc.nextInt();
	    		 
	    		 if(decision == 0){
	    			 officer.viewResults();
	    		 }
	    		 else if(decision == 1){
	    			 //officer.printResults(results);
	    		 }
	    	 }
	    	 else{
	    		 System.out.println("incorrect password");
	    	 }
	    	 
	     }
	     
	     else{
	    	 System.out.println("you have entered the wrong information. goodbye.");
	     }


	}
}