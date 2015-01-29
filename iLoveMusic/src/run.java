import iLoveMusic.benutzerverwaltung.Customer;
import iLoveMusic.gui.NutzerUebersicht;
import iLoveMusic.musikverwaltung.MusikVerwaltung;
import iLoveMusic.musikverwaltung.Track;
import iLoveMusic.musikverwaltung.Tracks;
import iLoveMusic.steuerung.Steuerung;


public class run {

	public static void main(String[] args) {
		Customer benutzer = new Customer("name", "mail", null, "pass");
		
		MusikVerwaltung musikVerwaltung = new MusikVerwaltung();
		musikVerwaltung.setTracks(new Tracks());
		
		Track track1 = new Track("name", "interpret", 0, 0, "", 0, 0);
		Track track2 = new Track("name2", "interpret2", 0, 0, "", 0, 0);
		musikVerwaltung.getTracks().add(track1);
		musikVerwaltung.getTracks().add(track2);
		
		Steuerung steuerung = new Steuerung();
		steuerung.setEingeloggterBenutzer(benutzer);
		steuerung.setMusikVerwaltung(musikVerwaltung);
		
		NutzerUebersicht view = new NutzerUebersicht(steuerung);

	}

}
