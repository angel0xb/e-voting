import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class VoteReader {

//	private static VoteReader v2;
		
	public static void main(String[] args) throws IOException {
		 String voteIDInput = "A3";
		     File originalFile = new File("voter.txt");
//		     BufferedReader br = new BufferedReader(new FileReader(originalFile));
		     
			voter v = new voter();
			
			try {
				//creates the scanner that reads the file
				Scanner vScanner = new Scanner(originalFile);
				
				//reads the first line of the file.
				
//				System.out.println("next " + nextLine);
				
				//System.out.println("Next line: " + nextLine);
				
				while(vScanner.hasNextLine()){
				//Creates a list of strings for the current line of Officer ID info
					
					String nextLine = vScanner.nextLine();
					
					
					String[] voterInfo = nextLine.split(",");
					String currentID = voterInfo[0];
					String currentName = voterInfo[1];
					String currentSS = voterInfo[3];
	
					v = new voter(currentID,currentName,21,currentSS);
//					System.out.println("VoterID " + v.getVoterID());
//						System.out.println("next " + nextLine);
						if(currentID.equals(voteIDInput)){
							v.setVoterID(currentID);
							v.setVoterName(currentName);
							v.setVoterSS(currentSS);
							break;
						}
					
						else{
							v = new voter();
							
						}
				}
				//end while loop
				if(v.getVoterID() == null){
					System.out.println("Not Registered");
				}
				else{
//				System.out.println("Voter " + v.getVoterName());
					System.out.println("SUCCESS");
				}
					
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}
		
}
