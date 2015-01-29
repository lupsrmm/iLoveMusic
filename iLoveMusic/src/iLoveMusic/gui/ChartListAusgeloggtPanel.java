package iLoveMusic.gui;

import java.awt.GridLayout;

import iLoveMusic.musikverwaltung.Track;
import iLoveMusic.steuerung.Steuerung;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class ChartListAusgeloggtPanel extends JPanel {
	
	Steuerung steuerung;

	public ChartListAusgeloggtPanel(Steuerung steuerung) {
		
		this.steuerung = steuerung;
		
		Track[] tracks = new Track[steuerung.getMusikVerwaltung().getTracks().size()];
		steuerung.getMusikVerwaltung().getTracks().toArray(tracks);
		
		JPanel contentPanel = new JPanel();
		contentPanel.setLayout(new GridLayout(tracks.length, 2, 0, 0));
		contentPanel.setAutoscrolls(true);
		
		for (int i = 0; i < tracks.length; ++i) {
			JPanel buttonPanel = new JPanel();
			JTextArea trackText = new JTextArea();
			trackText.setText(tracks[i].getName() + ", von " + tracks[i].getInterpret());
			buttonPanel.add(trackText);
			
			JButton empfehlenButton = new JButton("Empfehlen");
			buttonPanel.add(empfehlenButton);
			contentPanel.add(buttonPanel);
		}
		
		JScrollPane scrollP = new JScrollPane (contentPanel);
		if(scrollP.getPreferredSize().getHeight() > 600)
			scrollP.setPreferredSize(new java.awt.Dimension(600, 510));
        add(scrollP);
	}
}