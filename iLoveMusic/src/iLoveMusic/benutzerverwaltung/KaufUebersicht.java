package iLoveMusic.benutzerverwaltung;
/**
 * @author Carla Schreiber
 * @date 21.01.2015
 *
 */
import java.util.LinkedList;

public class KaufUebersicht<Titel>{
	// Datenelemente
	private LinkedList<Titel> uebersicht= new LinkedList<Titel>();
			
	// Konstruktor
	public KaufUebersicht(){
				
			}
			
	// Getter 
	public LinkedList<Titel> getWarenkorb(){
		return uebersicht;
	}
	
	// Methoden
	public String[] TitelListe(){
		int n = uebersicht.size();
		String [] titelliste = new String[n];
		for (int i = 0; i < n; i++){
			titelliste[i] = (((iLoveMusic.musikverwaltung.Titel) uebersicht.get(i)).getName());
		}
		return titelliste;
	}

	public String[][] TitelInterpretListe(){
		int n = uebersicht.size();
		String [][] titelliste = new String[n][2];
		for (int i = 0; i < n; i++){
			titelliste[i][1] = (((iLoveMusic.musikverwaltung.Titel) uebersicht.get(i)).getName());
			titelliste[i][2] = (((iLoveMusic.musikverwaltung.Titel) uebersicht.get(i)).getInterpret());
		}
		return titelliste;
	}
}
