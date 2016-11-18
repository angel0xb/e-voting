import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class votingDriver {
	
	public static void main(String args[]) throws IOException{
		
		System.out.println("Hello USER, please enter Officer ID");
		
		File officerInfo = new File("ElectionOfficer.txt");
		BufferedReader br = new BufferedReader(new FileReader(officerInfo));
		
		
		Scanner scan = new Scanner(System.in);
		String officerID = scan.next();
		
		String line = null;
		while ((line = br.readLine()) != null) {
			if (line.contains(officerID)) {
				//String strCurrentID = line.substring(line.lastIndexOf(","), line.length()-1).replaceAll(",","").trim();
				System.out.println("Please enter Officer Password:");
				String pass = scan.next();
				
				if (line.contentEquals(pass)){
					System.out.println("Login approved!");
				}
				else{
					System.out.println("Login denied. Invalid password or officerID");
				}
				
				
			}
			
			else{
				System.out.println("OfficerID not found.");
			}
			
			
		}
		
	}
	
	
	
}
