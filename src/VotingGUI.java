import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import net.miginfocom.swing.MigLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;


public class VotingGUI extends JFrame {

	private JPanel contentPane;
	
	private JPanel panelSelectUser;
	private JPanel panelVoterLogin;
	private JPanel panelOfficerLogin;
	private JPanel officerMainPanel;

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
		setTitle("Voting System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		final JPanel panelSelectUser = new JPanel();
		contentPane.add(panelSelectUser, "name_462763692665141");
		panelSelectUser.setLayout(new CardLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("New label");
		panelSelectUser.add(lblNewLabel, "name_484379464841116");
		panelSelectUser.setVisible(true);
		
		JPanel panelVoterLogin = new JPanel();
		contentPane.add(panelVoterLogin, "name_462719861470530");
		panelVoterLogin.setLayout(new CardLayout(0, 0));
		panelVoterLogin.setVisible(false);
		
		JPanel panelOfficerLogin = new JPanel();
		contentPane.add(panelOfficerLogin, "name_462730483970302");
		panelOfficerLogin.setLayout(new CardLayout(0, 0));
		panelOfficerLogin.setVisible(false);
		
		JPanel officerMainPanel = new JPanel();
		contentPane.add(officerMainPanel, "name_472590713135461");
		officerMainPanel.setLayout(new CardLayout(0, 0));
		officerMainPanel.setVisible(false);
	}

}
