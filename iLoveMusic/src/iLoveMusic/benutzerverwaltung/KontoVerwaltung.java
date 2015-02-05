package iLoveMusic.benutzerverwaltung;

import java.util.Collections;

import iLoveMusic.musikverwaltung.Titel;
import iLoveMusic.musikverwaltung.Track;
import iLoveMusic.musikverwaltung.Tracks;

public class KontoVerwaltung implements KontoVerwaltungInterface{
	//Datenelemente
	/**
	 * Eine Liste der einzelnen Tracks, die angeboten werden.
	 */
	Tracks trackAngebot;
	
	// Konsruktor
	/**
	 * Erstellt ein Objekt der Klasse KontoVerwaltung und initialisiert dessen Datenfeld trackAngebot.
	 * @param trackAngebot Die Liste der angebotenen Tracks.
	 */
	public KontoVerwaltung(Tracks trackAngebot){
		this.trackAngebot = trackAngebot;
	}
	
	//Methoden
	@Override
	public boolean guthabenPruefen(Customer benutzer){
		if (benutzer.getWarenkorb().berechnePreis() > benutzer.getGuthaben())
			return false;
		else
			return true;	
			
	}
	
	@Override
	public double guthabenVerrechnen(Customer benutzer, double guthabenDifferenz){
		double neuesGuthaben = (benutzer.getGuthaben() + guthabenDifferenz);
		benutzer.setGuthaben(neuesGuthaben);
		return neuesGuthaben;
	}
	
	@Override
	public boolean download(Titel[] titelListe){
		return true;
	}
	
	@Override
	public boolean kaufGutschreiben(Customer benutzer){
		for (Titel tmp : benutzer.getWarenkorb()){
			benutzer.getKaufUebersicht().add(tmp);
			Track tempTrack = (Track) tmp;
			int verkauf = tempTrack.getVerkaufszahlen();
			tempTrack.setVerkaufszahlen(verkauf+1);
		}
		benutzer.setWarenkorb(new Warenkorb());
		Collections.sort(trackAngebot);
		return true;
	}	
}