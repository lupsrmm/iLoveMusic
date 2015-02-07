package iLoveMusic.gui;


import iLoveMusic.steuerung.Steuerung;


//Awt
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.DefaultComboBoxModel;
//Swing
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
		
@SuppressWarnings("serial")
public class BesucherUebersicht extends JFrame implements ActionListener{
			
	private Steuerung steuerung;
	private JPanel contentPane, infoPanel;
	private JButton suchenButton, loginButton, registrierenButton;
	private JTextField suchenTextField;
			
	public BesucherUebersicht(Steuerung steuerung) {
		this.steuerung = steuerung;
		initComponents();
	}

	private void initComponents() {		
			
		setTitle("iLoveMusic");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
			
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(Color.BLUE, 1, true));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
			
		JPanel topPanel = new JPanel();
		topPanel.setBorder(new LineBorder(Color.BLUE, 1, true));
		contentPane.add(topPanel, BorderLayout.NORTH);
			
		JLabel suche = new JLabel("Suchen: ");
		topPanel.add(suche);
		
		suchenTextField = new JTextField();
		topPanel.add(suchenTextField);
		suchenTextField.setColumns(10);
			
		suchenButton = new JButton("Suchen");
		topPanel.add(suchenButton);
		
		loginButton = new JButton("Login");
		loginButton.addActionListener(this);
		topPanel.add(loginButton);
		
		registrierenButton = new JButton("Registrieren");
		topPanel.add(registrierenButton);
		
		// Sprachauswahl noch nicht implementiert
		JComboBox<String> sprachAuswahl = new JComboBox<String>();
		sprachAuswahl.setModel(new DefaultComboBoxModel<String>(new String[] {"Deutsch", "Englisch"}));
		topPanel.add(sprachAuswahl);
		
		
		infoPanel = new ChartListAusgeloggtPanel(steuerung);
		contentPane.add(infoPanel, BorderLayout.CENTER);
		
		setVisible(true);
	}
	
	public void login(){
		BenutzerUebersicht nutzerUebersicht = new BenutzerUebersicht(steuerung);
		nutzerUebersicht.setVisible(true);
		dispose();
	}
			
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == this.loginButton){
			LoginWindow loginFrame = new LoginWindow(steuerung, this);
			loginFrame.setVisible(true);
		}
	}	
}


