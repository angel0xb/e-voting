import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import com.sun.xml.internal.ws.api.Component;

import java.awt.event.ActionListener;

//Task: provides an interface for the voter
//Input: Takes information provided from the voter to display
//Output: GUI or pages


public class voterUI extends JPanel{
	JLabel label;
    JFrame frame;
    String simpleDialogDesc = "The candidates";
    
    voteController vController = new voteController();

	
	
    public static void main(String[] args) {
    	

	
		
		
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
					createAndShowGUI();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });
    }
//    add page number to parameters
//    depending on page number open certain txt file ex: 1 will open "candidate1.txt" 
	
	public voterUI(JFrame frame) throws FileNotFoundException{
		super(new BorderLayout());
		
		
		this.frame = frame;
        JLabel title;
        
        //Create the components.
        JPanel choicePanel = createCheckBoxes();
        
        System.out.println("passed createSimpleDialogBox");
                
        title = new JLabel("Click the \"Vote\" button"
                           + " once you have selected a candidate.",
                           JLabel.CENTER);
        
        label = new JLabel("Vote now!", JLabel.CENTER);
        label.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        choicePanel.setBorder(BorderFactory.createEmptyBorder(20,20,5,20));

        //Lay out the main panel.
        add(title, BorderLayout.NORTH);  
        add(label, BorderLayout.SOUTH);        
        add(choicePanel, BorderLayout.CENTER);
    }
    void setLabel(String newText) {
        label.setText(newText);
    }
	
//	change to have input of string for the file read
//	create a file for each page of candidates
	public JPanel createCheckBoxes() throws FileNotFoundException{
		String simpleDialogDesc = "The candidates";
		
//		group for checkboxes 
		final ButtonGroup group = new ButtonGroup();
		
		int candidates = 5;
		
//		create an array of checkboxes
		final JCheckBox[] checkboxes = new JCheckBox[candidates];
		
//		read the candidate txt file
		File resultsFile = new File("candidate.txt");
		Scanner resultsScanner = new Scanner(resultsFile);

		int i =0;
//		read through all the lines
		while(resultsScanner.hasNextLine()){
			
			String nextLine = resultsScanner.nextLine();
//			split line and obtain necessary data
			String[] splitLine = nextLine.split(",");
			String candidate = splitLine[1];
			String party = splitLine[2];
			
//			populate checkboxes with data
			checkboxes[i] = new JCheckBox("<html>Candidate "+i+": "+ candidate + " of the " + party + " party." + "</html>");
			group.add(checkboxes[i]);
			
			i++;	
	
		}


        JButton voteButton = new JButton("Submit");
        voteButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
//        		for(int i =0;i<checkboxes.length;i++){
//        		implment switch case?
        		
        		database db = new database();
//        		checks to see which checkbox is selected
        			if(checkboxes[0].isSelected())
        			{
        				try {
							db.addVote("A0");
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
        			}
        			else if(checkboxes[1].isSelected()){
        				try {
							db.addVote("A1");
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
        			}
        			else if(checkboxes[2].isSelected()){
        				try {
							db.addVote("A2");
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
        			}
        			
        			else if(checkboxes[3].isSelected()){
        				try {
							db.addVote("A3");
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
        			} else
						try {
							db.addVote("A4");
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
//        			 System.out.println(checkboxes[i].isSelected() + " is checked");
//        		}
        		
        		
        	}
        	
        });
        
        
        System.out.println("calling createPane");
        return createPane(simpleDialogDesc + ":",
                          checkboxes, 
                          voteButton);
		
		
	}
	
	 private JPanel createPane(String description,
             JCheckBox[] checkboxes,
             JButton showButton) {
			int numChoices = checkboxes.length;
			JPanel box = new JPanel();
			JLabel label = new JLabel(description);
			
			box.setLayout(new BoxLayout(box, BoxLayout.PAGE_AXIS));
			box.add(label);
			
			for (int i = 0; i < numChoices; i++) {
			box.add(checkboxes[i]);
			}
			
			
			JPanel pane = new JPanel(new BorderLayout());
			pane.add(box, BorderLayout.NORTH);
			pane.add(showButton, BorderLayout.SOUTH);
			System.out.println("returning pane");
			return pane;
		}
	 
	 
	    private static void createAndShowGUI() throws FileNotFoundException {
	        //Make sure we have nice window decorations.
	        JFrame.setDefaultLookAndFeelDecorated(true);
	        JDialog.setDefaultLookAndFeelDecorated(true);
	        
//	        ***************************************************************************************************
//	    	creates login window
	    	JFrame frame1 = new JFrame("Voter Login");
			frame1.setSize(480, 300);
//			Access to toolkit that has helpful methods
			Toolkit tk = Toolkit.getDefaultToolkit();
			
//			another way to center the screen
//			dimentison class to get the dimension of the screen tk grabs the screensize
			Dimension dim = tk.getScreenSize();
//			get the x and y pos
			final int xPos = (dim.width /2) - (frame1.getWidth() /2); 
			final int yPos = (dim.height /2) - (frame1.getHeight() /2); 
			frame1.setLocation(xPos, yPos);
			frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			JPanel panel = new JPanel();
			frame1.add(panel);
			
			voterUI v = new voterUI(frame1);
			v.login(panel);

			frame1.setVisible(true);
//			 ***************************************************************************************************
	        //Create and set up the window.
	        JFrame frame = new JFrame("VoteDialog");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

	        //Set up the content pane.
	        Container contentPane = frame.getContentPane();
	        contentPane.setLayout(new GridLayout(1,1));
	        contentPane.add(new voterUI(frame));

	        //Display the window.
	        frame.pack();
	        frame.setVisible(true);
	
	    }
//	Purpose: displays the login page
//	Preconditions: none
//	Postconditions: login screen is displayed 
	    private void login(final JPanel panel) {
//	    	final JFrame topFrame = (JFrame) SwingUtilities.getRoot(this);
	    
	        final JFrame topFrame = (JFrame) SwingUtilities.getRoot(panel);

			panel.setLayout(null);
			
			System.out.println(BorderLayout.CENTER);
//			int center = Integer.parseInt(BorderLayout.CENTER);
			JLabel voterLabel = new JLabel("Voter ID: ");
			voterLabel.setBounds(130, 80, 80, 25);
			panel.add(voterLabel,BorderLayout.CENTER);

			final JTextField voterText = new JTextField(20);
			voterText.setBounds(200, 80, 160, 25);
			panel.add(voterText,BorderLayout.CENTER);

			JLabel socialLabel = new JLabel("Social: ");
			socialLabel.setBounds(130, 140, 80, 25);
			panel.add(socialLabel);

			final JPasswordField socialText = new JPasswordField(20);
			socialText.setBounds(200, 140, 160, 25);
			panel.add(socialText);

			JButton loginButton = new JButton("Login");
			loginButton.setBounds(360, 220, 80, 25);
			loginButton.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        		voteController controller = new voteController();
	        		
	        		String voterID = voterText.getText();
	        		System.out.println("ID " + voterID);
	        		Voter v = controller.readVoter(voterID);
//	        		Check to see if the voter exists.
	        		if(v.getVoterID()==null ){ System.out.println("NOT REGISTERED");}
//		    		if the voter exists do this
		    		if(v.getVoterID()!= null){
//		    			prints out the SS for the voter ID entered so no need to remember the SS for testing.
		    			 System.out.println("*HINT* SS = " + v.getVoterSS().trim());
		    			
						String social = String.valueOf(socialText.getPassword()) + ".";
		    			 System.out.println("scoial " + social);
//		    			 panel.setVisible(false);
		    			 if( social.trim().equals(v.getVoterSS().trim())){
//		    				 topFrame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
		    				 topFrame.setVisible(false);
//		    				 frame1.setVisibel(true);
		    				 
//		    				 Add e
		    				 System.out.println("Logging in");
		    			 }
		    		}
	        		}

	        	
	        	});
			panel.add(loginButton);
			
		
		}

	
	
	


}
