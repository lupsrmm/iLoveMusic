package iLoveMusic.gui;

import iLoveMusic.steuerung.Steuerung;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;

@SuppressWarnings("serial")
public class ControlPanel extends JPanel {

	Steuerung steuerung;
	JPanel infoPanel;
	
	public ControlPanel(Steuerung steuerung) {
		
		this.steuerung = steuerung;
		this.infoPanel = new JPanel();
		infoPanel.setToolTipText("");
		infoPanel.setBorder(new LineBorder(Color.BLUE, 1, true));
		
		
		JTextArea TextArea = new JTextArea();
		TextArea.setFont(new Font("DejaVu Sans", Font.PLAIN, 13));
		TextArea.setRows(11);
		TextArea.setText("Sie haben sich erfolgreich eingeloggt!");
		TextArea.setEditable(false);
		infoPanel.add(TextArea);
		
		this.add(infoPanel);

	}
	/**
	 * Methode zum Aktualisieren der Ansicht.
	 * @param view zum Abgleich, welche Ansicht als naechstes Geladen werden soll
	 */
	public void updateView(String view) {
		remove(infoPanel);
		
		if(view.equals("leer"))
			infoPanel = new JPanel();
		
		/* Administrator Views */
		else if (view.equals("benutzer verwalten"))
			infoPanel = new BenutzerVerwaltenView(this);
		else if(view.equals("benutzer anlegen"))
			infoPanel = new BenutzerAnlegenView(this);		
		
		add(infoPanel);
		validate();
		repaint();
	}
	

	public Steuerung getSteuerung(){
		return this.steuerung;
	}
}
