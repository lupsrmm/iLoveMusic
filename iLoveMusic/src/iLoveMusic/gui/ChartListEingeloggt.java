package iLoveMusic.gui;

import iLoveMusic.musikverwaltung.Track;
import iLoveMusic.steuerung.Steuerung;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;

@SuppressWarnings("serial")
public class ChartListEingeloggt extends JPanel {
	
	Steuerung steuerung;

	public ChartListEingeloggt(Steuerung steuerung) {
		
		this.steuerung = steuerung;
		
		Track[] tracks = new Track[steuerung.getMusikVerwaltung().getTracks().size()];
		steuerung.getMusikVerwaltung().getTracks().toArray(tracks);
		
		setLayout(new java.awt.GridLayout(tracks.length, 3));
		
		for (int i = 0; i < tracks.length; ++i) {
			
			JTextArea trackText = new JTextArea();
			trackText.setText(tracks[i].getName() + ", von " + tracks[i].getInterpret());
			add(trackText);
			
			JButton empfehlen = new JButton("Empfehlen");
			add(empfehlen);
			JButton warenkorb = new JButton("In den Warenkorb");
			warenkorb.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					steuerung.getEingeloggterBenutzer().getWarenkorb().add(tracks[i]);
				}
			});
			add(warenkorb);
		}
		
		JScrollPane scrollP = new JScrollPane (this);
		scrollP.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollP.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	}
}