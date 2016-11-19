
import java.io.IOException;
import java.util.Scanner;

public class votingDriver {

	public static void main(String[] args) throws IOException {
		
	     Scanner sc = new Scanner(System.in);
<<<<<<< HEAD
	     
	     System.out.println("If you are a voter, type 0 and press enter. If you are an Election Officer, type 1 and press enter.");

	     int userPath = sc.nextInt();
	     
	     if(userPath == 0){
	     
||||||| merged common ancestors

=======
//			Create vote controller ID 
>>>>>>> master
			voteController controller = new voteController();
			
//			Prompt the voter to enter the ID HINT is so you dont have to check the voter.txt file
			System.out.println("Welcome to eVoting, type your voter ID number to start: ");
			System.out.println("*HINT* only A1, A2 and A3 are registered ID's");
			
<<<<<<< HEAD
			voter v = controller.readVoter(voterID);
			System.out.println("SS " + v.getVoterSS().trim());

||||||| merged common ancestors
			 voter v = controller.readVoter(voterID);
			 System.out.println("SS " + v.getVoterSS().trim());
//			System.out.println("Enter your full name.");
//			String name = sc.next();
//			name = name + " " +  sc.next();
=======
//			save voterid from the next scanner line.
			String voterID = sc.next().trim();
			 voter v = controller.readVoter(voterID);
//			Check to see if the voter exists.
			if(v.getVoterID()==null ){ System.out.println("NOT REGISTERED");}
			
//			if the voter exists do thhis
			if(v.getVoterID()!= null){
//				prints out the SS for the voter ID entered so no need to remember the SS for testing.
			 System.out.println("*HINT* SS = " + v.getVoterSS().trim());

//			 prompts the user for their SS
>>>>>>> master
			System.out.println("Enter your social:");
//			save social, trim add period to fit format.
			String social = sc.next().trim() + ".";
			
<<<<<<< HEAD

||||||| merged common ancestors
//			System.out.println("social:" + social.trim() + "\nSS:" + v.getVoterSS().trim());
//			String v1 = social;
//			String v2 = "9999.";
//			System.out.println("Compare " + v1.equals( v2));
//			System.out.println("compare "+"Whatß " + social.trim().equals(v.getVoterSS().trim()));
=======
//			compares the social you entered with the social from voter.txt file.
>>>>>>> master
			if( social.trim().equals(v.getVoterSS().trim())){
//				prompt user for voting opitons
				System.out.println("CANDIDATES");
				System.out.println(" PRESS A0 to vote for  HAM, PARTY: Mario."
						+ "\n PRESS A1 to vote  for TURKEY, PARTY: PARTY2."
						+ " \n PRESS A2  to vote for ME, PARTY: PARTYY."
						+ "\n PRESS A3  to vote for YOU, PARTY: NO PARTY.");
//				enter the ID to cast vote
				String candidateID = sc.next();
//				add vote using the candidate ID 
				database.addVote(candidateID);
				
				System.out.println("VOTE SUBMITTED");
			}
			
		
<<<<<<< HEAD
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
||||||| merged common ancestors
			database database = new database();
			
			//add age check for now all at least 21
//			create new voter
//			voter v = new voter(voterID, name, 21, social);
=======
>>>>>>> master

<<<<<<< HEAD
||||||| merged common ancestors
			
=======
			
		}
>>>>>>> master

	}
}


			