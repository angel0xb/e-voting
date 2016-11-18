import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;


public class database {
	private static  ArrayList <candidate>canList = new ArrayList<candidate>();
//	private static ArrayList <voter> voterList = new ArrayList<voter>();
//	private static ArrayList <electionOfficer> electionOfficer = new ArrayList<electionOfficer>(); 
//	private int numVoters = voterList.size();
//	static int totalVotes =0;
	
//	ArrayList <candidate>canList
	public database(){
		
	}
	
public static void addVote(String candidateID) throws IOException{
	 int addvote;

     addvote = 1;

     File originalFile = new File("candidate.txt");
     BufferedReader br = new BufferedReader(new FileReader(originalFile));

     // Construct the new file that will later be renamed to the original
     // filename.
     File tempFile = new File("tempfile.txt");
     PrintWriter pw = new PrintWriter(new FileWriter(tempFile));

     String line = null;
     // Read from the original file and write to the new
     // unless content matches data to be removed.
     while ((line = br.readLine()) != null) {

         if (line.contains(candidateID)) {
             String strCurrentVote = line.substring(line.lastIndexOf(","), line.length()-1).replaceAll(","," ").trim() ;
             if (strCurrentVote != null || !strCurrentVote.trim().isEmpty()) {
                 int newVote = Integer.parseInt(strCurrentVote.trim()) + addvote;
                 System.out.println("new vote : " + newVote);
                 line = line.substring(0,line.lastIndexOf(",")) + "," + newVote + ".";
             }

         }
         pw.println(line);
         pw.flush();
     }
     pw.close();
     br.close();

     // Delete the original file
     if (!originalFile.delete()) {
         System.out.println("Could not delete file");
         return;
     }

     // Rename the new file to the filename the original file had.
     if (!tempFile.renameTo(originalFile))
         System.out.println("Could not rename file");

 
}
	public void addCand(candidate can){
		canList.add(can);
		
	}
	
	public static  void addCand(int index,candidate can){
		canList.add(index, can);
		
	}
	
	
	
	public void removeCand(candidate can){
		canList.remove(can);
		
	}
	
	public static candidate getCand(int index){
		return canList.get(index);
	}
	

	public static int getTotalVotes(){
		
		for(int i = 0; i< canList.size(); i++){
		totalVotes = totalVotes + canList.get(i).getVotes(); 
		}
		return totalVotes;
	}
	
	
	public static void printResults(){
		for(int i = 0; i< canList.size(); i++){
			System.out.println("Candiate Name: " + canList.get(i).getCandName());
			System.out.println("Candidate Party: " + canList.get(i).getCandidateParty());
			System.out.println("Candidate Votes: " + canList.get(i).getVotes());
		}
		System.out.println("Total Votes: "+ database.getTotalVotes());
	}
	

	

}
