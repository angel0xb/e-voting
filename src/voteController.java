//Task: handles interaction between the voter and the voterUI (display)
//Input: Several inputs to handle interaction
//Output: actions

public class voteController {
	private voter voter;
	
	public voteController(voter voter){
		this.voter = voter;
	}
//	Purpose: returns true if login is valid
//	Preconditions: takes in login information to verify
//	Postconditions: returns true or false
	public boolean approveLogin( String lineSplit){
		System.out.println("VINFO " + voter.getVoterInfo());
		System.out.println("LINE " + lineSplit.split(",")[3]);
		
		boolean sol = false;
			if(lineSplit.split(",")[3].equals( voter.getVoterInfo() )){
				sol = true;
		}
			
		return sol;
					
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
