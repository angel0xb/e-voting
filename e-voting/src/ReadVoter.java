import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadVoter {
	public String getID(String line){
		String[] split = line.split(",");
		return split[0];
	}
	
	public static String getName(String linesSplit){
//		linesSplit = linesSplit.split(",");
		String[] split = linesSplit.split(",");
		return split[1];
	}
	
	public String getAge(String line){
		String[] split = line.split(",");
		return split[2];
	}
	
	public String getReg(String line){
		String[] split = line.split(",");
		return split[3];
	}
	
	public static String getPass(String line){
		String[] split = line.split(",");
		return split[4];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;
		try{
			String CurrentLine;
			String lines =""; 
			br = new BufferedReader(new FileReader("voter.txt"));
			while((CurrentLine = br.readLine()) != null){
				
//				System.out.println("line " + CurrentLine + "size " + CurrentLine.length() );
				lines =lines + CurrentLine ;
			}
			System.out.println("lines " + lines + "size" + lines.length());
			
			
			String[] linesSplit = lines.split("\\.");
			

			System.out.println(linesSplit[0].split(",")[0]);

			
			for(int i = 0; i < linesSplit.length-1;i++){
				System.out.println("line" + i + " " + linesSplit[i]);
			}
			
			System.out.println("TEST\nNAME " + getName(linesSplit[1]) + "\n" + "Pass " + getPass(linesSplit[1]) );
			
		
//			String[] dataSplit = null ;
			
//				for(int j = 0; j < linesSplit.length-1; j++){
//				dataSplit =  linesSplit[j].split(",");
//				
//				}
//			System.out.println("data " + dataSplit[1]);
			
			
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try{
				if(br != null)br.close();
			}catch(IOException ex){
				ex.printStackTrace();
			}
		}
	}

}
