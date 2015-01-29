package iLoveMusic.gui;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JList;

public class InitActionMenu extends java.util.Observable{
	
	private final JList<String> actionMenu;
		
	public InitActionMenu(String [] actions) {
	
		this.actionMenu = new JList<String>(actions);
		MouseAdapter mouseListener = new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
		        if (e.getClickCount() == 1) {
		        	setChanged();
		        	notifyObservers(actionMenu.locationToIndex(e.getPoint()));		        			            
		        }
		     
		    }
		};
		actionMenu.addMouseListener(mouseListener);
				
	}
	public JList<String> Init() {
		
		return actionMenu;
	}
	
}	