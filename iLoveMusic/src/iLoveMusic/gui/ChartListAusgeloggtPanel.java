package iLoveMusic.gui;

import java.awt.Dimension;
import java.awt.GridLayout;

import iLoveMusic.musikverwaltung.Track;
import iLoveMusic.steuerung.Steuerung;

import javax.swing.Box;
import javax.swing.BoxLayout;
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
		contentPanel.setLayout(new GridLayout(tracks.length, 1, 0, 0));
		contentPanel.setAutoscrolls(true);
		
		for (int i = 0; i < tracks.length; ++i) {
			JPanel buttonPanel = new JPanel();
			buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.X_AXIS));
			buttonPanel.add(Box.createRigidArea(new Dimension(10, 0)));
			
			JTextArea trackText = new JTextArea();
			trackText.setBackground(this.getBackground());
			trackText.setText(tracks[i].getName() + ", von " + tracks[i].getInterpret());
			buttonPanel.add(trackText);
			
			JButton empfehlenButton = new JButton("Empfehlen");
			buttonPanel.add(empfehlenButton);
			
			buttonPanel.add(Box.createRigidArea(new Dimension(114, 0)));
			contentPanel.add(buttonPanel);
		}
		
		JScrollPane scrollP = new JScrollPane (contentPanel);
		if(scrollP.getPreferredSize().getHeight() > 600)
			scrollP.setPreferredSize(new java.awt.Dimension(600, 510));
        add(scrollP);
	}
}