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
	// Datenelemente
			
	// Konstruktor
	public KaufUebersicht(){
		
	}
	
	// Methoden
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
