//Task: provides an interface for the Election Officer
//Input: Takes information provided from the Election Officer to display
//Output: GUI or pages
public class ElectionOfficerUI {
	
//	Purpose: displays the login page
//	Preconditions: none
//	Postconditions: login screen is displayed 
	public void displayLogin(){};
	
	
//	Purpose: if login is verified then displays login successful 
//	Preconditions: login must be successful
//	Postconditions: login success screen is displayed 
	public void displayUnsuccessfulLogin(){};
	
//	Purpose: if login is verified then displays login unsuccessful 
//	Preconditions: login unsuccessful
//	Postconditions: login unsuccessful screen is displayed 
	public void displaySuccessfulLogin(){};
	
	

//	Purpose: displays the current results 
//	Preconditions: takes in an array of candidates *different from current class diagram*
//	Postconditions: displays the amount of votes each candidate has 
	public void displayResults(String[] candidate){};
}
