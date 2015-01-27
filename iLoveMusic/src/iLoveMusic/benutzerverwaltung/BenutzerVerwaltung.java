package iLoveMusic.benutzerverwaltung;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;


public class BenutzerVerwaltung {
	//Datenelemente
	private BenutzerListe benutzerListe;
	
	//Methoden
	public boolean register(String name, String eMailAdresse, Date geburtstag,String passwort){
		//for-schleife einrichten zum Durchsuchen der Benutzerliste, ob eMail schon vergeben
		Customer benutzer = new Customer(name, eMailAdresse, geburtstag, passwort);
		
	}
	
	public boolean eMailAdresseAendern(Customer benutzer, String altesPasswort, String neueEmailAdresse){
		if (benutzer.passwort == altesPasswort){
			benutzer.email = neueEmailAdresse;
			return true;
		}else{
			return false;
		}
		
	}
	
	public boolean passwortAendern(Customer benutzer, String altesPasswort, String neuesPasswort){
		if(benutzer.passwort == altesPasswort){
			benutzer.passwort = neuesPasswort;
			return true;
		}else{
			return false;
		}
	}
	
	public boolean benutzerNamenAendern(Customer benutzer, String neuerBenutzerName){
		benutzer.name = neuerBenutzerName;
	}
	
	public boolean benutzerLoeschen(Customer benutzer){
		
	}
	
	public BenutzerListe getBenutzerListe(){
		return benutzerListe;
	}
	
	public void setBenutzerListe(BenutzerListe Liste){
		benutzerListe = Liste;
	}
}