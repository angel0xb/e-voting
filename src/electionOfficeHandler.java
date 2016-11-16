
public class electionOfficeHandler {
	private electionOfficer officer;
//	private ElectionOfficerHandler handler;
	
	public electionOfficeHandler(electionOfficer officer){
		this.officer = officer;
	}
	
	public void setOfficerID(int ID){
		officer.setOfficerID(ID);
		
	}
	
	public int getOfficerID(){
		return officer.getID();
	}
	
	public void setOfficerName(String name){
		officer.setName(name);
	}
	
	public String getName(){
		return officer.getName();
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
