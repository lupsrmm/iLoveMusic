package iLoveMusic.gui;

import iLoveMusic.benutzerverwaltung.Customer;
import iLoveMusic.musikverwaltung.Track;
import iLoveMusic.steuerung.Steuerung;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
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
		contentPanel.setLayout(new GridLayout(tracks.length, 1, 0, 0));
		contentPanel.setAutoscrolls(true);

		final Customer benutzer = steuerung.getEingeloggterBenutzer();
		
		for (int i = 0; i < tracks.length; ++i) {
			JPanel buttonPanel = new JPanel();
			buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.X_AXIS));
			buttonPanel.add(Box.createRigidArea(new Dimension(10, 0)));
			
			JTextArea trackText = new JTextArea();
			trackText.setBackground(this.getBackground());
			trackText.setText(String.valueOf(i+1) + ". " + tracks[i].getName() + ", " + tracks[i].getInterpret());
			buttonPanel.add(trackText);
			
			JButton empfehlenButton = new JButton("Empfehlen");
			buttonPanel.add(empfehlenButton);
			
			final Track track = tracks[i];
			if(!benutzer.getKaufUebersicht().contains(track)){ // true, wenn noch nicht gekauft
				buttonPanel.add(Box.createRigidArea(new Dimension(10, 0)));
				JButton warenkorbButton = new JButton("In den Warenkorb");
				warenkorbButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
							if(benutzer.getWarenkorb().contains(track) == false)
								benutzer.getWarenkorb().add(track);
							}
				});
				buttonPanel.add(warenkorbButton);
			}
			else{
				buttonPanel.add(Box.createRigidArea(new Dimension(145, 0)));
			}
			buttonPanel.add(Box.createRigidArea(new Dimension(10, 0)));
			contentPanel.add(buttonPanel);
		}
		
		JScrollPane scrollP = new JScrollPane(contentPanel);
		if(scrollP.getPreferredSize().getHeight() > 600)
			scrollP.setPreferredSize(new java.awt.Dimension(600, 510));
        add(scrollP);
	}
}