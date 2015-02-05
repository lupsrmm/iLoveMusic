package iLoveMusic.benutzerverwaltung;
import iLoveMusic.musikverwaltung.Titel;



/**
 * @author Carla Schreiber
 * @date 21.01.2015
 *
 */
import java.util.LinkedList;

@SuppressWarnings("serial")
public class KaufUebersicht extends LinkedList<Titel>{
	
	// Methoden
	/**
	 * Methode liefert ein Array mit den Namen aller im Angebot enthaltenen Titel.
	 * @return String-Array mit den Namen aller im Angebot enthaltenen Titel.
	 */
	public String[] TitelListe(){
		int n = this.size();
		String [] titelliste = new String[n];
		int i = 0;
		for (Titel tmp : this){
			titelliste[i] = tmp.getName();
			i++;
		}
		return titelliste;
	}

	/**
	 * Methode liefert ein geschachteltes Array mit den Namen und Interpreten aller im Angebot enthaltenen Titel.
	 * @return Geschachteltes String-Array mit den Namen aller im Angebot enthaltenen Titel im ersten Feld und deren Interpreten im zweiten Feld.
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
