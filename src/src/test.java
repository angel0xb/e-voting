import java.io.IOException;


public class test {
	


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 candidate can = new candidate(234390432,"john", "g", 45);
		 
		
		candidate can2 = new candidate(00000000,"guyman", "L", 56);
		
		candidate can3 = new candidate(00000000,"man", "L", 56);

		voter v = new voter("11","JJJJ JJJJ",19,"lldkfjkl");
		voter v2 = new voter("11", "BBBBBBBBB", 18, "lldkfjkl");
		
//		System.out.println("TEST " + v.getVoterName() + "   " + v2.getVoterName());
		
		voteController controller = new voteController(v);
		System.out.println("*******************************************************************************");
		controller.readVoter("A4");
		System.out.println("*******************************************************************************");
		String line = "11,JJJJ JJJJ,19,lldkfjkl";
		
		System.out .println("TET2 " + controller.approveLogin( line));
		database.addCand(0,can);
		
		database.addCand(1,can2);
		database.addCand(2,can3);
		
		electionOfficer off1 = new electionOfficer(123,"JJJJ","pass");
		electionOfficer off2 = new electionOfficer(3453,"KKkK","pass1");
		
//		System.out.println(off1.getName() + "   " + off2.getName());
		
//		System.out.println("****"+ can2.getCandName());
		System.out.println(database.getCand(0).candidateName);
		database.addVote("A2");
		
		
//		database.printResults();
		

	}

}
