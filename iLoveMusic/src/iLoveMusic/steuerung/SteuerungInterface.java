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
	
	/**
	 * Abfrage des eingeloggten Benutzers.
	 * @return Wert des Datenfeldes eingeloggterBenutzer
	 */
	public abstract Customer getEingeloggterBenutzer();
	
	/**
	 * Setzt den eingeloggten Benutzer.
	 * @param eingeloggterBenutzer der Benutzer, der nun eingeloggt sein soll.
	 */
	public abstract void setEingeloggterBenutzer(Customer eingeloggterBenutzer);
	
	/**
	 * Abfrage der BenutzerVerwaltung.
	 * @return Wert des Datenfeldes benutzerVerwaltung
	 */
	public abstract BenutzerVerwaltung getBenutzerVerwaltung();
	
	/**
	 * Setzt die BenutzerVerwaltung
	 * @param benutzerVerwaltung die neue BenutzerVerwaltung
	 */
	public abstract void setBenutzerVerwaltung(BenutzerVerwaltung benutzerVerwaltung);
	
	/**
	 * Abfrage der MusikVerwaltung.
	 * @return Wert des Datenfeldes musikVerwaltung
	 */
	public abstract MusikVerwaltung getMusikVerwaltung();
	
	/**
	 * Setzt die MusikVerwaltung.
	 * @param musikVerwaltung die neue MusikVerwaltung
	 */
	public abstract void setMusikVerwaltung(MusikVerwaltung musikVerwaltung);
	
	/**
	 * Abfrage der KontoVerwaltung.
	 * @return Wert des Datenfeldes kontoVerwaltung
	 */
	public abstract KontoVerwaltung getKontoVerwaltung();
	
	/**
	 * Setzt die KontoVerwaltung.
	 * @param kontoVerwaltung die neue KontoVerwaltung
	 */
	public abstract void setKontoVerwaltung(KontoVerwaltung kontoVerwaltung);

}
