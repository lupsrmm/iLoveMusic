package iLoveMusic.benutzerverwaltung;

import java.util.Date;


public class BenutzerVerwaltung implements BenutzerVerwaltungInterface{
	//Datenelemente
	private BenutzerListe benutzerListe;
	
	//Methoden
	@Override
	public boolean register(String name, String eMailAdresse, Date geburtstag,String passwort){
		//for-schleife einrichten zum Durchsuchen der Benutzerliste, ob eMail schon vergeben
		Customer benutzer = new Customer(name, eMailAdresse, geburtstag, passwort);
		return benutzerListe.add(benutzer);
		
	}
	
	@Override
	public boolean eMailAdresseAendern(Customer benutzer, String altesPasswort, String neueEmailAdresse){
		if (benutzer.getPasswort().equals(altesPasswort)){
			benutzer.setEMailAdresse(neueEmailAdresse);
			return true;
		}else{
			return false;
		}
		
	}
	
	@Override
	public boolean passwortAendern(Customer benutzer, String altesPasswort, String neuesPasswort){
		if(benutzer.getPasswort().equals(altesPasswort)){
			benutzer.setPasswort(neuesPasswort);
			return true;
		}else{
			return false;
		}
	}
	
	@Override
	public boolean benutzerNamenAendern(Customer benutzer, String neuerBenutzerName){
		benutzer.setName(neuerBenutzerName);
		return true;
	}
	
	@Override
	public boolean benutzerLoeschen(Customer benutzer){
		return benutzerListe.remove(benutzer);
		
	}
	
	@Override
	public BenutzerListe getBenutzerListe(){
		return benutzerListe;
	}
	
	@Override
	public void setBenutzerListe(BenutzerListe liste){
		benutzerListe = liste;
	}
}