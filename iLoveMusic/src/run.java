import java.util.Collections;

import iLoveMusic.benutzerverwaltung.BenutzerListe;
import iLoveMusic.benutzerverwaltung.BenutzerVerwaltung;
import iLoveMusic.benutzerverwaltung.Customer;
import iLoveMusic.benutzerverwaltung.KontoVerwaltung;
import iLoveMusic.gui.BesucherUebersicht;
import iLoveMusic.musikverwaltung.MusikVerwaltung;
import iLoveMusic.musikverwaltung.Track;
import iLoveMusic.musikverwaltung.Tracks;
import iLoveMusic.steuerung.Steuerung;


public class run {

	public static void main(String[] args) {
	
		MusikVerwaltung musikVerwaltung = new MusikVerwaltung();
		musikVerwaltung.setTracks(new Tracks());


		Track track1 = new Track("Radioactive", "Lindsey Sterling", 0, 0.99, "", 0, 0);
		Track track2 = new Track("Hanging Tree", "Jennifer Lawrence", 0, 0.99, "", 0, 0);
		Track track3 = new Track("Sonne", "Rammstein", 0, 0.99, "", 0, 0);
		Track track4 = new Track("Bohemian Rhapsody", "Queen", 0, 0.99, "", 0, 0);
		Track track5 = new Track("Freaks", "Timmy Trumpets", 0, 0.99, "", 0, 0);
		Track track6 = new Track("Pokerface", "Lady Gaga", 0, 0.99, "", 0, 0);
		Track track7 = new Track("Horizont", "In Extremo", 0, 0.99, "", 0, 0);
		Track track8 = new Track("Intro", "The XX", 0, 0.99, "", 0, 0);
		Track track9 = new Track("Black Pearl", "Hans Zimmer", 0, 0.99, "", 0, 0);
		Track track10 = new Track("Can't Hold Us", "Pentatonix", 0, 0.99, "", 0, 0);
		Track track11 = new Track("Umbrella", "The Baseballs", 0, 0.99, "", 0, 0);
		Track track12 = new Track("Santiano", "Santiano", 0, 0.99, "", 0, 0);
		Track track13 = new Track("Streets Of Philadelphia", "Bruce Springsteen", 0, 0.99, "", 0, 0);
		Track track14 = new Track("Snow", "Red Hot Chili Peppers", 0, 0.99, "", 0, 0);
		Track track15 = new Track("Hotel California", "Eagles", 0, 0.99, "", 0, 0);
		Track track16 = new Track("The Fox", "Ylvis", 0, 0.99, "", 0, 0);
		Track track17 = new Track("Heart of Courage", "Two Steps From Hell", 0, 0.99, "", 0, 0);
		Track track18 = new Track("Stonehenge", "Ylvis", 0, 0.99, "", 0, 0);
		
		musikVerwaltung.getTracks().add(track1);
		musikVerwaltung.getTracks().add(track2);
		musikVerwaltung.getTracks().add(track3);
		musikVerwaltung.getTracks().add(track4);
		musikVerwaltung.getTracks().add(track5);
		musikVerwaltung.getTracks().add(track6);
		musikVerwaltung.getTracks().add(track7);
		musikVerwaltung.getTracks().add(track8);
		musikVerwaltung.getTracks().add(track9);
		musikVerwaltung.getTracks().add(track10);
		musikVerwaltung.getTracks().add(track11);
		musikVerwaltung.getTracks().add(track12);
		musikVerwaltung.getTracks().add(track13);
		musikVerwaltung.getTracks().add(track14);
		musikVerwaltung.getTracks().add(track15);
		musikVerwaltung.getTracks().add(track16);
		musikVerwaltung.getTracks().add(track17);
		musikVerwaltung.getTracks().add(track18);
		
		Collections.sort(musikVerwaltung.getTracks());
		
		Steuerung steuerung = new Steuerung();
		steuerung.setMusikVerwaltung(musikVerwaltung);
		steuerung.setKontoVerwaltung(new KontoVerwaltung(musikVerwaltung.getTracks()));
		steuerung.setBenutzerVerwaltung(new BenutzerVerwaltung());
		
		steuerung.getBenutzerVerwaltung().setBenutzerListe(new BenutzerListe());
		
		Customer benutzer1 = new Customer("Tom", "mail", null, "pass");
		steuerung.getKontoVerwaltung().guthabenVerrechnen(benutzer1, 90);
		
		Customer benutzer2 = new Customer("Sophia", "mail", null, "pass");
		steuerung.getKontoVerwaltung().guthabenVerrechnen(benutzer2, 5);
		
		steuerung.getBenutzerVerwaltung().getBenutzerListe().add(benutzer1);
		steuerung.getBenutzerVerwaltung().getBenutzerListe().add(benutzer2);
		
		@SuppressWarnings("unused")
		BesucherUebersicht view = new BesucherUebersicht(steuerung);

	}

}
