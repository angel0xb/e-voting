import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class test2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

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

            if (line.contains("A0")) {
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
	

}
