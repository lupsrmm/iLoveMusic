package iLoveMusic.steuerung;

import iLoveMusic.benutzerverwaltung.BenutzerVerwaltung;
import iLoveMusic.benutzerverwaltung.Customer;
import iLoveMusic.benutzerverwaltung.KontoVerwaltung;
import iLoveMusic.musikverwaltung.MusikVerwaltung;

public class Steuerung implements SteuerungInterface{ 
	/**
	 * Steuerung organisiert die verschiedenen Verwaltungen und 
	 * stellt diese zur Verfügung.
	 */
	
	/** speichert den eingeloggten Benutzer*/
	private Customer eingeloggterBenutzer;
	/** speichert die Benutzerverwaltung, mit der gearbeitet werden soll*/
	private BenutzerVerwaltung benutzerVerwaltung;
	/** speichert die Musikverwaltung, mit der gearbeitet werden soll*/
	private MusikVerwaltung musikVerwaltung;
	/** speichert die Kontoverwaltung, mit der das Konto des eingeloggten Benutzers bearbeitet wird*/
	private KontoVerwaltung kontoVerwaltung;

	@Override
	public boolean login(String loginName, String passwort){
        for (Customer temp : benutzerVerwaltung.getBenutzerListe()) { // Benutzerliste durchsuchen
        	if(loginName.equals(temp.getName())){	// true, wenn der Loginname existiert
        		if (temp.getPasswort().equals(passwort)){ // true, wenn auch das Passwort richtig ist
        			eingeloggterBenutzer= temp;
        			return true;
        		}
        	}
		}
        return false;
	}
    
	@Override
	public boolean logout(){
		eingeloggterBenutzer = null;
		return true;
	}
	
	@Override
	public Customer getEingeloggterBenutzer(){
		return eingeloggterBenutzer;
	}
	
	@Override
	public void setEingeloggterBenutzer(Customer eingeBenutzer){
		eingeloggterBenutzer = eingeBenutzer;
	}
	
	@Override
	public BenutzerVerwaltung getBenutzerVerwaltung(){
		return benutzerVerwaltung ;
	}
	
	@Override
	public void setBenutzerVerwaltung(BenutzerVerwaltung benutzVerwaltung){
		benutzerVerwaltung = benutzVerwaltung;
	}
	
	@Override
	public MusikVerwaltung getMusikVerwaltung(){
		return musikVerwaltung;
	}
	
	@Override
	public void setMusikVerwaltung(MusikVerwaltung musiVerwaltung){
		musikVerwaltung = musiVerwaltung;
	}
	
	@Override
	public KontoVerwaltung getKontoVerwaltung(){
		return kontoVerwaltung;
	}
	
	@Override
	public void setKontoVerwaltung(KontoVerwaltung kontVerwaltung){
		kontoVerwaltung = kontVerwaltung;
	}
}
