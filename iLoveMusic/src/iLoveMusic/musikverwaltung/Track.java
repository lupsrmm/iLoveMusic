package iLoveMusic.musikverwaltung;

/**
 * @author Carla Schreiber, Julia Behrendt 
 * @date 20.01.2015
 *
 */
public class Track extends Titel{
	
	/**
	 * Die Klasse Track repres&auml;ntiert ein Lied im Angebot der Musikplattform.
	 */
	
	// Konstruktor
	/**
	 * Es wird ein Objekt der Klasse Track erzeugt und dessen Datenelemente initialisiert.
	 * @param name ist der Name des Tracks.
	 * @param interpret ist der Interpret des Tracks.
	 * @param laenge ist die Länge des Tracks.
	 * @param preis ist der Preis des Tracks.
	 * @param bemerkung ist die Bemerkung des Tracks.
	 * @param fsk ist die Altersfreigabe des Tracks.
	 */
	public Track(String name, String interpret, int laenge, double preis, String bemerkung, int fsk){
		super(name, interpret, bemerkung, laenge, preis, fsk);
	}
}