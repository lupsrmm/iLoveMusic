package iLoveMusic.benutzerverwaltung;

import iLoveMusic.musikverwaltung.Titel;
import iLoveMusic.musikverwaltung.Tracks;

import java.util.Collections;

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
		// Titel aus dem Warenkorb dem Kaeufer zuordnen
		for (Titel tmp : benutzer.getWarenkorb()){
			benutzer.getKaufUebersicht().add(tmp);
			// Verkaufszahlen anpassen
			int verkauf = tmp.getVerkaufszahlen();
			tmp.setVerkaufszahlen(verkauf++);
		}
		// Warenkorb leeren
		benutzer.setWarenkorb(new Warenkorb());
		// Ranking neu sortieren
		Collections.sort(trackAngebot);
		return true;
	}	
}