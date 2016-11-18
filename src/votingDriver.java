
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

			voteController controller = new voteController();
//			getting voter info to make voter object
			System.out.println("Welcome to eVoting, type your voter ID number to start: ");
			String voterID = sc.next();
			
			 voter v = controller.readVoter(voterID);
			 System.out.println("SS " + v.getVoterSS().trim());
//			System.out.println("Enter your full name.");
//			String name = sc.next();
//			name = name + " " +  sc.next();
			System.out.println("Enter your social:");
			String social = sc.next() + ".";
			
//			System.out.println("social:" + social.trim() + "\nSS:" + v.getVoterSS().trim());
//			String v1 = social;
//			String v2 = "9999.";
//			System.out.println("Compare " + v1.equals( v2));
//			System.out.println("compare "+"Whatß " + social.trim().equals(v.getVoterSS().trim()));
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
			
			//add age check for now all at least 21
//			create new voter
//			voter v = new voter(voterID, name, 21, social);

			

		         
		         
			//If valid voter
//				if ("a"=="a")  {
//					
//					
//					System.out.println("Please choose between the candidates:");
////					System.out.printf("1. %s\n",candidate1.getName());
////					System.out.printf("2. %s\n",candidate2.getName());
//
//
//						
//				
//				System.out.println("SUCCESS");
//			}
//			else
//			{
//				System.out.println("Your voter registration was not found.");
////				return;
//			}
	}
}

			