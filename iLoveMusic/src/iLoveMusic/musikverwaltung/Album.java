package iLoveMusic.musikverwaltung;



/**
 * @author Carla Schreiber, Julia Behrendt 
 * @date 20.01.2015
 *
 */
public class Album extends Titel{
	
	// Datenelemente
	private Track titelliste[];
	
	// Konstruktor
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
	public Track [] getTitelliste(){
		return titelliste;
	}
	
	// Setter
	public void setTitelliste(Track newTitelliste[]){
		this.titelliste = newTitelliste;
	}
	
}
	
