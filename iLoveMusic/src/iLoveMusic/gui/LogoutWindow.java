package iLoveMusic.gui;

//import java.awt.BorderLayout;
//import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
//import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

//import java.awt.GridLayout;

//import org.eclipse.wb.swing.FocusTraversalOnArray;

//import java.awt.Component;

import javax.swing.border.LineBorder;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


@SuppressWarnings("serial")
public class LogoutWindow extends JFrame {

	private JPanel contentPane;
	/**
	 * Create the frame.
	 */
	public LogoutWindow() {
		setTitle("Logout");
		setSize(420, 180);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(Color.BLUE, 1, true));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel TextLabel = new JLabel("Sie haben sich erfolgreich ausgeloggt!");
		TextLabel.setBounds(71, 39, 292, 15);
		contentPane.add(TextLabel);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnExit.setBounds(158, 98, 117, 25);
		contentPane.add(btnExit);
		//contentPane.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{TextLabel, btnExit}));
	}
}
