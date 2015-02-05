package iLoveMusic.gui;


import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JRootPane;
import javax.swing.border.LineBorder;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


@SuppressWarnings("serial")
public class HelpWindow extends JFrame {

	private JPanel contentPane;
	
	public HelpWindow(String titel, String text) {
		setTitle(titel);
		setSize(420, 180);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(Color.BLUE, 1, true));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
		
		contentPane.add(Box.createRigidArea(new Dimension(0, 45)));
		
		JLabel TextLabel = new JLabel(text);
		TextLabel.setAlignmentX(CENTER_ALIGNMENT);
		contentPane.add(TextLabel);
		
		contentPane.add(Box.createRigidArea(new Dimension(0, 10)));
		
		JButton schliessenButton = new JButton("Schliessen");
		schliessenButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		schliessenButton.setAlignmentX(CENTER_ALIGNMENT);
		contentPane.add(schliessenButton);
		
		JRootPane rootPane = this.getRootPane();
	    rootPane.setDefaultButton(schliessenButton);
	}
}
