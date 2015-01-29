import iLoveMusic.benutzerverwaltung.BenutzerListe;
import iLoveMusic.benutzerverwaltung.BenutzerVerwaltung;
import iLoveMusic.benutzerverwaltung.Customer;
import iLoveMusic.benutzerverwaltung.KontoVerwaltung;
import iLoveMusic.gui.BesucherUebersicht;
import iLoveMusic.gui.BenutzerUebersicht;
import iLoveMusic.musikverwaltung.MusikVerwaltung;
import iLoveMusic.musikverwaltung.Track;
import iLoveMusic.musikverwaltung.Tracks;
import iLoveMusic.steuerung.Steuerung;


public class run {

	public static void main(String[] args) {
		Customer benutzer = new Customer("name", "mail", null, "pass");
		
		MusikVerwaltung musikVerwaltung = new MusikVerwaltung();
		musikVerwaltung.setTracks(new Tracks());
		/*
		Track track1 = new Track("name", "interpret", 0, 0, "", 0, 0);
		Track track2 = new Track("name2", "interpret2", 0, 0, "", 0, 0);
		Track track3 = new Track("name3", "interpret3", 0, 0, "", 0, 0);
		*/
		for(int i = 1; i < 31; i++){
			String name = new String("titel" + String.valueOf(i));
			Track track = new Track(name, "interpret", 0, 0, "", 0, 0);
			musikVerwaltung.getTracks().add(track);
		}
		/*
		musikVerwaltung.getTracks().add(track1);
		musikVerwaltung.getTracks().add(track2);
		musikVerwaltung.getTracks().add(track3);
		*/
		Steuerung steuerung = new Steuerung();
		steuerung.setEingeloggterBenutzer(benutzer);
		steuerung.setMusikVerwaltung(musikVerwaltung);
		steuerung.setKontoVerwaltung(new KontoVerwaltung());
		steuerung.setBenutzerVerwaltung(new BenutzerVerwaltung());
		
		steuerung.getBenutzerVerwaltung().setBenutzerListe(new BenutzerListe());
		
		steuerung.getBenutzerVerwaltung().getBenutzerListe().add(benutzer);
		
		BesucherUebersicht view = new BesucherUebersicht(steuerung);

	}

}
