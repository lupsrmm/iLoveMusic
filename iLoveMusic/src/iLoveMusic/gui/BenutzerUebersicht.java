package iLoveMusic.gui;


import iLoveMusic.steuerung.Steuerung;

//Awt
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

//Swing
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
	
@SuppressWarnings("serial")
public class BenutzerUebersicht extends JFrame implements ActionListener{
		
		private Steuerung steuerung;
		private JPanel contentPane, infoPanel;
		private JList<String> actions;
		private JButton suchenButton, logoutButton;
		private JTextField suchenTextField;

		
		public BenutzerUebersicht(Steuerung steuerung) {
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
			
			logoutButton = new JButton("Logout");
			logoutButton.addActionListener(this);
			topPanel.add(logoutButton);
			
			JPanel actionPanel = new JPanel();
			actionPanel.setBorder(new LineBorder(Color.BLUE, 1, true));
			contentPane.add(actionPanel, BorderLayout.WEST);

			final String [] menue = {"Benutzerdaten aendern","Playliste erstellen", "Guthaben aufladen", "Warenkorb anzeigen", "Titel herunterladen"};
			actions = new JList<String>(menue);
			actions.setBackground(this.getBackground());
			MouseAdapter mouseListener = new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					
			        if (e.getClickCount() == 1) {
			        	int index = actions.locationToIndex(e.getPoint());
			        	
			        	if(index == 0) updateView("daten aendern");
						else if(index == 1) updateView("playlist");
						else if(index == 2) updateView("guthaben");
						else if(index == 3) updateView("warenkorb");
						else if(index == 4)	updateView("download");
			        }
			     
			    }
			};
			actions.addMouseListener(mouseListener);
			actions.setLayoutOrientation(JList.VERTICAL);
			actions.setFont(new Font("DejaVu Sans", Font.PLAIN, 13));
			actionPanel.add(actions);
			
			infoPanel = new ChartListEingeloggtPanel(steuerung);
			contentPane.add(infoPanel, BorderLayout.CENTER);
			
			setVisible(true);
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == logoutButton){
				steuerung.logout();
				BesucherUebersicht bUe = new BesucherUebersicht(steuerung);
				bUe.setVisible(true);
				HelpWindow logOut = new HelpWindow("Logout", "Sie haben sich erfolgreich ausgeloggt!");
				logOut.setVisible(true);
				dispose();
			}
			
		}		
		
		public void updateView(String view){
			
			if(view.equals("warenkorb")){
				contentPane.remove(infoPanel);
				infoPanel = new WarenkorbPanel(steuerung, this);
				contentPane.add(infoPanel);
				validate();
				repaint();
			}
			else if(view.equals("charts")){
				contentPane.remove(infoPanel);
				infoPanel = new ChartListEingeloggtPanel(steuerung);
				contentPane.add(infoPanel);
				validate();
				repaint();
			}
			else if(view.equals("download")){
				contentPane.remove(infoPanel);
				infoPanel = new DownloadPanel(steuerung, this);
				contentPane.add(infoPanel);
				validate();
				repaint();
			}
			else{
			/*
				contentPane.remove(infoPanel);
				infoPanel = new ChartListEingeloggtPanel(steuerung);
				contentPane.add(infoPanel);
				validate();
				repaint();
				*/
			};
		}
	}

