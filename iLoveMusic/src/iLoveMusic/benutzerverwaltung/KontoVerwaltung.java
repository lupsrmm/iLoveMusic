package iLoveMusic.benutzerverwaltung;

import iLoveMusic.musikverwaltung.Titel;

public class KontoVerwaltung implements KontoVerwaltungInterface{
	//Datenelemente
	
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
		return (benutzer.getGuthaben() + guthabenDifferenz);
	}
	
	@Override
	public boolean download(Titel[] titelListe){
		return true;
	}
	
	@Override
	public boolean kaufGutschreiben(Customer benutzer){
		for (Titel tmp : benutzer.getWarenkorb()){
			benutzer.getKaufUebersicht().add(tmp);
		}
		benutzer.setWarenkorb(new Warenkorb());
		return true;
	}	
}