import java.util.ArrayList;


public class database {
	private static  ArrayList <candidate>canList = new ArrayList<candidate>();
	private static ArrayList <voter> voterList = new ArrayList<voter>();
	private static ArrayList <electionOfficer> electionOfficer = new ArrayList<electionOfficer>(); 
	private int numVoters = voterList.size();
	static int totalVotes =0;
	
//	ArrayList <candidate>canList
	public database(){
		
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
	
	public candidate getCand(int index){
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
