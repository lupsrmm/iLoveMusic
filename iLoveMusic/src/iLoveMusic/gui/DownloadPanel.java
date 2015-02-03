package iLoveMusic.gui;

import iLoveMusic.benutzerverwaltung.Customer;
import iLoveMusic.musikverwaltung.Track;
import iLoveMusic.steuerung.Steuerung;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class DownloadPanel extends JPanel {
	
	private JCheckBox titel [];
	private JButton zurueckButton, downloadButton;
	
	public DownloadPanel(Steuerung steuerung, BenutzerUebersicht bUe){
	
		final BenutzerUebersicht benutzerUebersicht = bUe;
		final Customer benutzer = steuerung.getEingeloggterBenutzer();
	
		Track[] tracks = new Track[steuerung.getEingeloggterBenutzer().getKaufUebersicht().size()];
		steuerung.getEingeloggterBenutzer().getKaufUebersicht().toArray(tracks);
	
		JPanel contentPanel = new JPanel();
		contentPanel.setLayout(new GridLayout(tracks.length+1, 2, 0, 0));
		contentPanel.setAutoscrolls(true);
		if(tracks.length == 0){
			JTextArea keineTitelText = new JTextArea();
			keineTitelText.setFont(new Font("DejaVu Sans", Font.PLAIN, 13));
			keineTitelText.setRows(11);
			keineTitelText.setText("Sie haben noch keine Titel gekauft.");
			keineTitelText.setEditable(false);
			contentPanel.add(keineTitelText);
		}
		else {
			JPanel checkPanel = new JPanel();
			checkPanel.setLayout(new GridLayout(tracks.length, 1, 0, 0));
		
			titel = new JCheckBox [benutzer.getKaufUebersicht().size()];
			for(int i = 0; i < tracks.length; i++) {
				titel[i] = new JCheckBox(tracks[i].getName() + " von " + tracks[i].getInterpret());
				titel[i].setHorizontalAlignment(SwingConstants.LEFT);
				titel[i].setVerticalAlignment(SwingConstants.CENTER);
				titel[i].setHorizontalTextPosition(SwingConstants.LEFT);
				titel[i].setVerticalTextPosition(SwingConstants.CENTER);
				checkPanel.add(titel[i]);
			}
			contentPanel.add(checkPanel);
		}
		
		// fixe Buttons
		JPanel buttonPanel = new JPanel();
		
		final JCheckBox [] titelCheck = titel;
		downloadButton = new JButton("Download");
		downloadButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(titelCheck != null){
					for(int i = 0; i < titelCheck.length; i++){
						if(titelCheck[i].isSelected()){
							HelpWindow download = new HelpWindow("iLoveMusic", "Sie haben die Titel erfolgreich heruntergeladen.");
							download.setVisible(true);
							benutzerUebersicht.updateView("download");
							break;
						}
					}
				}
				else{
					HelpWindow keineTitel = new HelpWindow("iLoveMusic", "Sie haben noch keine Titel gekauft.");
					keineTitel.setVisible(true);
				}
			}
		});
		buttonPanel.add(downloadButton);
		
		
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
