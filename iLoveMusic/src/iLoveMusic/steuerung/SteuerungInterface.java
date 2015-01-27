package iLoveMusic.steuerung;

import iLoveMusic.benutzerverwaltung.BenutzerVerwaltung;
import iLoveMusic.benutzerverwaltung.Customer;
import iLoveMusic.benutzerverwaltung.KontoVerwaltung;
import iLoveMusic.musikverwaltung.MusikVerwaltung;

public interface SteuerungInterface {
	
	/**
	 * Methode zum Einloggen.
	 * @param benutzerName Der Benutzername des Benutzers, der sich einloggen will.
	 * @param passwort Das Passwort des Benutzers, der sich einloggen will.
	 * @return <code>true</code>, wenn der Login erfolgreich war.
	 */
	public abstract boolean login(String benutzerName, String passwort);
	
	/**
	 * Methode zum ausloggen des eingeloggten Benutzers.
	 * @return <code>true</code>, wenn der Logout erfolgreich war.
	 */
	public abstract boolean logout();
	
	public abstract Customer getEingeloggterBenutzer();
	
	public abstract void setEingeloggterBenutzer(Customer eingeloggterBenutzer);
	
	public abstract BenutzerVerwaltung getBenutzerVerwaltung();
	
	public abstract void setBenutzerVerwaltung(BenutzerVerwaltung benutzerVerwaltung);
	
	public abstract MusikVerwaltung getMusikVerwaltung();
	
	public abstract void setMusikVerwaltung(MusikVerwaltung musikVerwaltung);
	
	public abstract KontoVerwaltung getKontoVerwaltung();
	
	public abstract void setKontoVerwaltung(KontoVerwaltung kontoVerwaltung);

}
