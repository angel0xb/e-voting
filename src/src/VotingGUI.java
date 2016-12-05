import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.*;

//damb ass
public class VotingGUI extends JFrame {

	private JPanel contentPane;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VotingGUI frame = new VotingGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VotingGUI() {
		
		initComponents();
		createEvents();
		
		
	}
	//This method creates and initializes all components of the GUI
	private void initComponents() {
		
		setTitle("Voting System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Voter");
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Election Officer");
		contentPane.add(rdbtnNewRadioButton_1);
		contentPane.add(rdbtnNewRadioButton);
		
		JLabel label1 = new JLabel();
		label1.setText("Username");
//		JTextField tex
	}
	
	
	//This method creates all the events of the GUI
	private void createEvents() {
		// TODO Auto-generated method stub
		
	}

	

}
