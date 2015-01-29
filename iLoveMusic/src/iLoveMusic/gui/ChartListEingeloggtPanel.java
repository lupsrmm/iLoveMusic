package iLoveMusic.gui;

import iLoveMusic.benutzerverwaltung.Customer;
import iLoveMusic.musikverwaltung.Track;
import iLoveMusic.steuerung.Steuerung;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class ChartListEingeloggtPanel extends JPanel {
	
	Steuerung steuerung;

	public ChartListEingeloggtPanel(Steuerung steuerung) {
		
		this.steuerung = steuerung;
		
		Track[] tracks = new Track[steuerung.getMusikVerwaltung().getTracks().size()];
		steuerung.getMusikVerwaltung().getTracks().toArray(tracks);
		
		JPanel contentPanel = new JPanel();
		contentPanel.setLayout(new GridLayout(tracks.length, 3, 0, 0));
		contentPanel.setAutoscrolls(true);

		final Customer benutzer = steuerung.getEingeloggterBenutzer();
		
		for (int i = 0; i < tracks.length; ++i) {
			JPanel buttonPanel = new JPanel();
			JTextArea trackText = new JTextArea();
			trackText.setText(tracks[i].getName() + ", von " + tracks[i].getInterpret());
			buttonPanel.add(trackText);
			
			JButton empfehlenButton = new JButton("Empfehlen");
			buttonPanel.add(empfehlenButton);
			
			final Track track = tracks[i];
			JButton warenkorbButton = new JButton("In den Warenkorb");
			warenkorbButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(benutzer.getKaufUebersicht().contains(track) == false){
						if(benutzer.getWarenkorb().contains(track) == false)
							benutzer.getWarenkorb().add(track);
					}
					else{
						System.out.println("schon gekauft!");
						HelpWindow schonGekauft = new HelpWindow("iLoveMusic", "Diesen Titel haben Sie bereits gekauft!");
						schonGekauft.setVisible(true);
					}
					
				}
			});
			buttonPanel.add(warenkorbButton);
			contentPanel.add(buttonPanel);
		}
		
		JScrollPane scrollP = new JScrollPane(contentPanel);
		if(scrollP.getPreferredSize().getHeight() > 600)
			scrollP.setPreferredSize(new java.awt.Dimension(600, 510));
        add(scrollP);
	}
}