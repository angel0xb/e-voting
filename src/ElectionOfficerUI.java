import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.CardLayout;

import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.awt.event.ActionEvent;

import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.SwingConstants;

import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JLayeredPane;
//Task: provides an interface for the Election Officer
//Input: Takes information provided from the Election Officer to display
//Output: GUI or pages
public class ElectionOfficerUI extends JPanel{
	
	JLabel label;
    JFrame frame;
    String simpleDialogDesc = "Election Officer Options";
    

	
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
	
	public ElectionOfficerUI(JFrame frame) throws FileNotFoundException{
		super(new BorderLayout());
		
		this.frame = frame;
        JLabel title;
        JPanel choicePanel = showResults();
        
        title = new JLabel("Select which option you"+ " would like to choose.",
                JLabel.CENTER);
        label = new JLabel("Choose now!", JLabel.CENTER);
        label.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        choicePanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 5, 20));
        
        add(title, BorderLayout.NORTH);  
        add(label, BorderLayout.SOUTH);
        add(choicePanel, BorderLayout.CENTER);
	}
	
	public void setLabel(String newText){
		label.setText(newText);
	}
	
	private static void offLogin(JPanel panel) {

		panel.setLayout(null);
		
		System.out.println(BorderLayout.CENTER);
		JLabel officerLabel = new JLabel("Officer ID: ");
		officerLabel.setBounds(130, 80, 80, 25);
		panel.add(officerLabel,BorderLayout.CENTER);

		JTextField idText = new JTextField(20);
		idText.setBounds(200, 80, 160, 25);
		panel.add(idText,BorderLayout.CENTER);

		JLabel pwLabel = new JLabel("Password: ");
		pwLabel.setBounds(130, 140, 80, 25);
		panel.add(pwLabel);

		JPasswordField pwText = new JPasswordField(20);
		pwText.setBounds(200, 140, 160, 25);
		panel.add(pwText);

		JButton loginButton = new JButton("Login");
		loginButton.setBounds(360, 220, 80, 25);
		panel.add(loginButton);
		
	
	}
	 private JPanel createPane(String description,
             JTextArea text,
             JButton showButton) {
		
			JPanel box = new JPanel();
			JLabel label = new JLabel(description);
			
			box.setLayout(new BoxLayout(box, BoxLayout.PAGE_AXIS));
			box.add(label);
			
			
			box.add(text);
			
			
			
			JPanel pane = new JPanel(new BorderLayout());
			pane.add(box, BorderLayout.NORTH);
			pane.add(showButton, BorderLayout.SOUTH);
//			pane.setBackground(Color.GRAY);
			System.out.println("returning pane");
			return pane;
		}
	
	//creates panel for the officer view in which the officer
	//can choose between viewing results or printing results
	private JPanel showResults() throws FileNotFoundException{
		String simpleDialogDesc = "Results";
//		String simpleDialogDesc = "Results";
//		JPanel officerPanel = new JPanel();
//		JLabel officerLabel = new JLabel("Officer Actions...");
//		
//		officerPanel.setLayout(new BoxLayout(officerPanel, BoxLayout.PAGE_AXIS));
//		officerPanel.add(officerLabel);
//		
//		JButton viewResultsBtn = new JButton("View Results");
//		JButton printResultsBtn = new JButton("Print Results");
//		
//		viewResultsBtn.setBounds(130, 80, 80, 35);
//		printResultsBtn.setBounds(130, 140, 80, 35);
//		
//		JPanel pane = new JPanel(new BorderLayout());
//		pane.add(officerPanel, BorderLayout.NORTH);
//		System.out.println("reutrning pane");
//		return pane;
		
		//		read the candidate txt file
		File resultsFile = new File("candidate.txt");
		Scanner resultsScanner = new Scanner(resultsFile);
        JButton returnButton = new JButton("return");
		JTextArea candRes = new JTextArea(5,15);
		
		candRes.setBackground(Color.LIGHT_GRAY);
		int i =0;
//		read through all the lines
		while(resultsScanner.hasNextLine()){
			String nextLine = resultsScanner.nextLine();
			String[] splitLine = nextLine.split(",");
			String candidate = splitLine[1];
			String party = splitLine[2];
			String votes = splitLine[3];
			candRes.append("Cadidate " + candidate + " of the " + party  +" has " + votes + " votes \n");
			i++;
			
		}
        System.out.println("calling createPane");
        return createPane(simpleDialogDesc + ":",
                          candRes, 
                         returnButton);

		
	}
	
	
	
	
	public static void createAndShowGUI() throws FileNotFoundException {
	    //Make sure we have nice window decorations.
	    JFrame.setDefaultLookAndFeelDecorated(true);
	    JDialog.setDefaultLookAndFeelDecorated(true);
	   
	    //Create and set up the window.

	    
	    //************************************************************************************************
	    //************************************************************************************************
	    
	    JFrame frame1 = new JFrame("Results");
	    frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	  //Set up the content pane.
	    Container contentPane1 = frame1.getContentPane();
	    contentPane1.setLayout(new GridLayout(1,1));
	    contentPane1.add(new ElectionOfficerUI(frame1));
	    
	  //Display the window.
        frame1.pack();
        frame1.setVisible(true);
	    
	}
	
}
