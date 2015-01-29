package iLoveMusic.gui;


import iLoveMusic.benutzerverwaltung.Customer;
import iLoveMusic.steuerung.Steuerung;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


@SuppressWarnings("serial")
public class LoginWindow extends JFrame implements ActionListener {

	private Steuerung steuerung;
	private BesucherUebersicht besucherUebersicht;
	private JPanel contentPane;
	private JTextField nameTextField;
	private JPasswordField passwortPasswordField;
	private JButton schliessenButton, loginButton;
	
	public LoginWindow(Steuerung steuerung, BesucherUebersicht besucherUebersicht) {
		
		this.steuerung = steuerung;
		this.besucherUebersicht = besucherUebersicht;
		
		setTitle("Login");
		setSize(420, 180);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(Color.BLUE, 1, true));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
		
		contentPane.add(Box.createRigidArea(new Dimension(0, 10)));
		
		JLabel TextLabel = new JLabel("Willkommen bei iLoveMusic!");
		TextLabel.setAlignmentX(CENTER_ALIGNMENT);
		contentPane.add(TextLabel);
		
		contentPane.add(Box.createRigidArea(new Dimension(0, 10)));
		
		//Loginbereich
		// Name
		JPanel loginNamePanel = new JPanel();
		loginNamePanel.setLayout(new BoxLayout(loginNamePanel, BoxLayout.X_AXIS));
		
		JLabel nameLabel = new JLabel("Benutzername: ");
		loginNamePanel.add(nameLabel);
		
		loginNamePanel.add(Box.createRigidArea(new Dimension(10, 0)));
		
		nameTextField = new JTextField();
		nameTextField.setText("");
		nameTextField.setColumns(12);
		nameTextField.setMaximumSize(nameTextField.getPreferredSize());
		loginNamePanel.add(nameTextField);
		
		contentPane.add(loginNamePanel);
		
		// Passwort
		JPanel loginPasswortPanel = new JPanel();
		loginPasswortPanel.setLayout(new BoxLayout(loginPasswortPanel, BoxLayout.X_AXIS));
		
		loginPasswortPanel.add(Box.createRigidArea(new Dimension(28, 0)));
		
		JLabel passwortLabel = new JLabel("Passwort: ");
		loginPasswortPanel.add(passwortLabel);
		
		loginPasswortPanel.add(Box.createRigidArea(new Dimension(10, 0)));
		
		passwortPasswordField = new JPasswordField(12);
		passwortPasswordField.setText("");
		passwortPasswordField.setMaximumSize(passwortPasswordField.getPreferredSize());
		loginPasswortPanel.add(passwortPasswordField);
		
		contentPane.add(loginPasswortPanel);
		
		
		// ButtonPanel
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.X_AXIS));
		
		loginButton = new JButton("Login");
		loginButton.addActionListener(this);
		loginButton.setAlignmentX(CENTER_ALIGNMENT);
		buttonPanel.add(loginButton);
		
		buttonPanel.add(Box.createRigidArea(new Dimension(10, 0)));
		
		schliessenButton = new JButton("Schliessen");
		schliessenButton.addActionListener(this);
		schliessenButton.setAlignmentX(CENTER_ALIGNMENT);
		buttonPanel.add(schliessenButton);
		
		contentPane.add(buttonPanel);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == schliessenButton)
			dispose();
		else if(e.getSource() == loginButton){
			String name ="", passwort = "";
			
			name = nameTextField.getText();
			passwort = new String(passwortPasswordField.getPassword());
			
			if(steuerung.login(name, passwort)){
				besucherUebersicht.login();
			}
			dispose();
		}
	}
}