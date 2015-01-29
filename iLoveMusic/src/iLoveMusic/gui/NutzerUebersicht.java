package iLoveMusic.gui;


import iLoveMusic.benutzerverwaltung.Customer;
import iLoveMusic.steuerung.Steuerung;

//Awt
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Observable;

//Swing
	import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
	
@SuppressWarnings("serial")
public class NutzerUebersicht extends JFrame implements ActionListener{
		
		private Steuerung steuerung;
		
		private JPanel contentPane;
		private JList<String> actions;	// wird beobachtet
		
		ControlPanel control;
		
		JPanel infoPanel;
		/**
		 * Create the frame.
		 * 
		 */
		public NutzerUebersicht(Steuerung steuerung) {
			this.steuerung = steuerung;
			initComponents();
		}
		private void initComponents() {		
			
			setTitle("Menu Window");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 800, 600);
			
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(new BorderLayout(0, 0));
			
			JPanel LogoutPanel = new JPanel();
			LogoutPanel.setBorder(new LineBorder(Color.BLUE, 1, true));
			contentPane.add(LogoutPanel, BorderLayout.NORTH);
			
			JButton btnLogout = new JButton("Logout");
			btnLogout.addActionListener(this);
			btnLogout.setHorizontalAlignment(SwingConstants.RIGHT);
			LogoutPanel.add(btnLogout);
			
			JPanel actionPanel = new JPanel();
			actionPanel.setBorder(new LineBorder(Color.BLUE, 1, true));
			contentPane.add(actionPanel, BorderLayout.WEST);

			final String [] menue = {"Benutzerdaten aendern","Playliste erstellen", "Guthaben aufladen", "Warenkorb anzeigen", "Titel herunterladen"};
			actions = new JList<String>(menue);
			MouseAdapter mouseListener = new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					
			        if (e.getClickCount() == 1) {
			        	int index = actions.locationToIndex(e.getPoint());
			        	
			        	if(index == 0) control.updateView("daten aendern");
						else if(index == 1) control.updateView("playlist erstellen");
						else if(index == 2) control.updateView("guthaben aufladen");
						else if(index == 3) control.updateView("warenkorb");
						else if(index == 4)	control.updateView("titel herunterladen");
			        }
			     
			    }
			};
			actions.addMouseListener(mouseListener);
			actions.setLayoutOrientation(JList.VERTICAL);
			actions.setFont(new Font("DejaVu Sans", Font.PLAIN, 13));
			actionPanel.add(actions);
			
			currentPanel();	//Dieser Funktion passt die Views an!	
			
			setVisible(true);
		}
		
		public JPanel currentPanel() {
			this.control = new ControlPanel(steuerung);
			//contentPane.add(control, BorderLayout.CENTER);
			contentPane.add(new ChartListEingeloggt(steuerung), BorderLayout.CENTER);
			return control;
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			steuerung.logout();
			LoginWindow lin = new LoginWindow(steuerung);
			lin.setVisible(true);
			LogoutWindow lout = new LogoutWindow();
			lout.setVisible(true);
			dispose();
			
		}		
		
		public static void main(String[] args){
			NutzerUebersicht test = new NutzerUebersicht();
			
		}
	}

