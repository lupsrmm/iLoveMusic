package iLoveMusic.gui;

import iLoveMusic.benutzerverwaltung.Customer;
import iLoveMusic.benutzerverwaltung.KontoVerwaltung;
import iLoveMusic.musikverwaltung.Titel;
import iLoveMusic.musikverwaltung.Track;
import iLoveMusic.steuerung.Steuerung;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class WarenkorbPanel extends JPanel {
	
	private JButton zurueckButton, kaufenButton;
	
	public WarenkorbPanel(Steuerung steuerung, BenutzerUebersicht bUe){

		final BenutzerUebersicht benutzerUebersicht = bUe;
		final Customer benutzer = steuerung.getEingeloggterBenutzer();
		final KontoVerwaltung kontoVerwaltung = steuerung.getKontoVerwaltung();
		
		Track[] tracks = new Track[steuerung.getEingeloggterBenutzer().getWarenkorb().size()];
		steuerung.getEingeloggterBenutzer().getWarenkorb().toArray(tracks);
// debug
		for (int i = 0; i < tracks.length; ++i) {
			System.out.println(tracks[i].getName());
		}
//
		
		JPanel contentPanel = new JPanel();
		contentPanel.setLayout(new GridLayout(tracks.length+2, 2, 0, 0));
		contentPanel.setAutoscrolls(true);
		
		for (int i = 0; i < tracks.length; ++i) {
			JPanel buttonPanel = new JPanel();
			JTextArea trackText = new JTextArea();
			trackText.setText(tracks[i].getName() + ", von " + tracks[i].getInterpret());
			buttonPanel.add(trackText);
			
			final Track track = tracks[i];
			JButton entfernenButton = new JButton("Aus dem Warenkorb entfernen");
			entfernenButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					benutzer.getWarenkorb().remove(track);
					benutzerUebersicht.updateView("warenkorb");
				}
			});
				
			buttonPanel.add(entfernenButton);
	
			contentPanel.add(buttonPanel);
		}
		// Guthaben und Preis
		JLabel guthabenPreisLabel = new JLabel("Ihr Guthaben betraegt " + String.valueOf(benutzer.getGuthaben()) + " EUR.\n Ihr Einkauf kostet " + String.valueOf(benutzer.getWarenkorb().berechnePreis()) + " EUR.");
		contentPanel.add(guthabenPreisLabel);
		
		// fixe Buttons
		JPanel buttonPanel = new JPanel();
		
		kaufenButton = new JButton("Kaufen");
		buttonPanel.add(kaufenButton);
		kaufenButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(kontoVerwaltung.guthabenPruefen(benutzer)){
					kontoVerwaltung.guthabenVerrechnen(benutzer, benutzer.getWarenkorb().berechnePreis());
					kontoVerwaltung.kaufGutschreiben(benutzer);
					benutzerUebersicht.updateView("download");
				}
				else{
					HelpWindow zuwenig = new HelpWindow("iLoveMusic", "Leider reicht Ihr Guthaben nicht fuer diesen Kauf.");
					zuwenig.setVisible(true);
				}
				
				
			}
		});
		
		zurueckButton = new JButton("Zurueck");
		zurueckButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				benutzerUebersicht.updateView("charts");
			}
		});
		buttonPanel.add(zurueckButton);
		
		contentPanel.add(buttonPanel);
		
		
		// ScrollPane
		JScrollPane scrollP = new JScrollPane (contentPanel);
		if(scrollP.getPreferredSize().getHeight() > 600)
			scrollP.setPreferredSize(new java.awt.Dimension(600, 510));
        add(scrollP);
	}
}
