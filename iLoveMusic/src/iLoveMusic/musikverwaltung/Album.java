package iLoveMusic.musikverwaltung;

/**
 * @author Carla Schreiber, Julia Behrendt 
 * @date 20.01.2015
 *
 */
public class Album extends Titel{
	/**
	 * Die Klasse Album ist eine Sammlung einzelner Tracks, die zu einem Angebot zusammengestellt sind.
	 */
	
	// Datenelemente
	/** Hier wird das Array mit den Tracks, die in dem Album enthalten sind, gespeichert. */
	private Track titelliste[];
	
	// Konstruktor
	/**
	 * Hier wird ein Album initialisiert und mit Werten belegt.
	 * @param name ist der Name des Albums.
	 * @param interpret ist der Interpret des Albums.
	 * @param bemerkung sind Bemerkungen zu dem Album.
	 * @param titelliste ist die Liste der im Album enthaltenen Tracks.
	 */
	
	Album(String name, String interpret, String bemerkung, Track titelliste []) {
		super(name, interpret, bemerkung);
		this.titelliste = titelliste;
		setPreis(0);
		setLaenge(0);
		setFSK(0);
		for (int i = 0; i < titelliste.length; i++){
			setPreis(getPreis() + titelliste[i].getPreis());
			setLaenge(getLaenge() + titelliste[i].getLaenge());
			if (titelliste[i].getFSK() > getFSK()){
				setFSK(titelliste[i].getFSK());
			}
		}
		setPreis(getPreis()*0.8);
	}
	
	// Getter
	/**
	 * Die Liste der im Album enthaltenen Tracks wird zurückgegeben.
	 * @return Es wird die Liste der im Album enthaltenen Tracks zurückgegeben.
	 */
	public Track [] getTitelliste(){
		return titelliste;
	}
	
	// Setter
	/**
	 * Die Liste der im Album enthaltenen Titel wird zurückgegeben.
	 * @param newTitelliste ist die neue Liste der im Album enthaltenen Titel.
	 */
	public void setTitelliste(Track newTitelliste[]){
		this.titelliste = newTitelliste;
	}
	
}