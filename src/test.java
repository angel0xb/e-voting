
public class test {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 candidate can = new candidate(234390432,"john", "g", 45);
		 
		
		candidate can2 = new candidate(00000000,"guyman", "L", 56);
		
		candidate can3 = new candidate(00000000,"man", "L", 56);

		
		database.addCand(0,can);
		
		database.addCand(1,can2);
		database.addCand(2,can3);
		
		electionOfficer off1 = new electionOfficer(123,"JJJJ","pass");
		electionOfficer off2 = new electionOfficer(3453,"KKkK","pass1");
		
//		System.out.println(off1.getName() + "   " + off2.getName());
		
//		System.out.println("****"+ can2.getCandName());
//		System.out.println(database.getCand(0));
		database.printResults();
		

	}

}
