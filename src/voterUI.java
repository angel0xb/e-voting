import javax.swing.JFrame;

//Task: provides an interface for the voter
//Input: Takes information provided from the voter to display
//Output: GUI or pages


public class voterUI extends JFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new voterUI();
	}
	
	public voterUI() {
		
		
	}

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
	
//	Purpose: once login successful candidates are displayed 
//	Preconditions: login must be successful
//	Postconditions: login success screen is displayed 
	public void displayCandidates(){};
	
//	Purpose: continue on to next page 
//	Preconditions: none
//	Postconditions: next page is displayed 
	public void nextPage(){};
	
//	Purpose: return to previous page 
//	Preconditions: none
//	Postconditions: display previous page
	public void prevPage(){};
	
//	Purpose: displays voters choices for review
//	Preconditions: none
//	Postconditions: review screen displayed
	public void displayReview(){};

}
