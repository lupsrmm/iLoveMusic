package iLoveMusic.steuerung;

import iLoveMusic.benutzerverwaltung.BenutzerVerwaltung;
import iLoveMusic.benutzerverwaltung.Customer;
import iLoveMusic.benutzerverwaltung.KontoVerwaltung;
import iLoveMusic.musikverwaltung.MusikVerwaltung;

public class Steuerung{ 
private Customer eingeloggterBenutzer;
private BenutzerVerwaltung benutzerVerwaltung;
private MusikVerwaltung musikVerwaltung;
private KontoVerwaltung kontoVerwaltung;
	/**
	 * Methode zum Einloggen.
	 * @param eMailAdresse Die E-Mailadresse des Benutzers, der sich einloggen will.
	 * @param passwort Das Passwort des Benutzers, der sich einloggen will.
	 * @return <code>true</code>, wenn der Login erfolgreich war.
	 */
public boolean login(String loginName, String passwort){
        for (Customer temp : benutzerVerwaltung.getBenutzerListe()) {
        	if(loginName.equals(temp.getName())){
        		if (temp.getPasswort().equals(passwort)){
        			eingeloggterBenutzer= temp;;
        			//eingeloggter Benutzer.setLoginSatus(true);
        			return true;
        		}
        	}
		}
        return false;
	}
    
 
	/**
	 * Methode zum ausloggen des eingeloggten Benutzers.
	 * @return <code>true</code>, wenn der Logout erfolgreich war.
	 */
	public boolean logout(){
		eingeloggterBenutzer = null;
		return true;
	};
	
	public Customer getEingeloggterBenutzer(){
		return eingeloggterBenutzer;
	};
	
	public void setEingeloggterBenutzer(Customer eingeBenutzer){
		eingeloggterBenutzer = eingeBenutzer;
	};
	
	public BenutzerVerwaltung getBenutzerVerwaltung(){
		return benutzerVerwaltung ;
	};
	
	public void setBenutzerVerwaltung(BenutzerVerwaltung benutzVerwaltung){
		benutzerVerwaltung = benutzVerwaltung;
	};
	
	public MusikVerwaltung getMusikVerwaltung(){
		return musikVerwaltung;
	};
	
	public void setMusikVerwaltung(MusikVerwaltung musiVerwaltung){
		musikVerwaltung = musiVerwaltung;
	};
	
	public KontoVerwaltung getKontoVerwaltung(){
		return kontoVerwaltung;
	};
	
	public void setKontoVerwaltung(KontoVerwaltung kontVerwaltung){
		kontoVerwaltung = kontVerwaltung;
	};


}
