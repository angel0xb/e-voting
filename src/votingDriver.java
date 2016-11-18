
import java.io.IOException;
import java.util.Scanner;

public class votingDriver {

	public static void main(String[] args) throws IOException {
		
	     Scanner sc = new Scanner(System.in);
//			Create vote controller ID 
			voteController controller = new voteController();
			
//			Prompt the voter to enter the ID HINT is so you dont have to check the voter.txt file
			System.out.println("Welcome to eVoting, type your voter ID number to start: ");
			System.out.println("*HINT* only A1, A2 and A3 are registered ID's");
			
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
			System.out.println("Enter your social:");
//			save social, trim add period to fit format.
			String social = sc.next().trim() + ".";
			
//			compares the social you entered with the social from voter.txt file.
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
			
		

			
		}

	}
}

			