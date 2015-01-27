package iLoveMusic.musikverwaltung;

import java.util.LinkedList;

@SuppressWarnings("serial")
public class PlayListe extends LinkedList<Titel> {
	
	/**
	 * Methode liefert ein Array mit den Namen aller im Angebot enthaltenen Titel.
	 * @return String-Array mit den Namen aller im Angebot enthaltenen Titel.
	 */
	public String[] titelArray(){
		String[] titel = new String[this.size()]; // Array der Titel hat die Groesse entsprechend der Laenge der Angebotsliste
		int i = 0; // Iterator
		for(Titel tmp : this){	// Schleife fuellt Rueckgabearray mit den Namen der Titel im Angebot
			titel[i] = tmp.getName();
			i++;
		}
		return titel;
	}
	
	/**
	 * Methode liefert ein geschachteltes Array mit den Namen und Interpreten aller im Angebot enthaltenen Titel.
	 * @return Geschachteltes String-Array mit den Namen aller im Angebot enthaltenen Titel im ersten Feld und deren Interpreten im zweiten Feld..
	 */
	public String[][] titelInterpretArray(){
		String[][] titelInterpret = new String[this.size()][2];
		int i = 0;
		for(Titel tmp : this){
			titelInterpret[i][0] = tmp.getName();
			titelInterpret[i][1] = tmp.getInterpret();
			i++;
		}
		return titelInterpret;
	}

}
