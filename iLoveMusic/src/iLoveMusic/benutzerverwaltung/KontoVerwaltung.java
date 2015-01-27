package iLoveMusic.benutzerverwaltung;

public class Kontoverwaltung {
	//Datenelemente
	
	//Methoden
	public boolean guthabenPruefen(Customer benutzer){
		if (benutzer.warenkorb > benutzer.guthaben)
			return false;
		else
			return true;	
			
	}
	
	public double guthabenVerrechnen(Customer benutzer, double guthabenDifferenz){
		return benutzer.guthaben = benutzer.guthaben + guthabenDifferenz;
	}
	
	public boolean download(Titel[] titelListe){
		return true;
	}
	
	public boolean kaufGutschreiben(Customer benutzer){
		
	}	
}