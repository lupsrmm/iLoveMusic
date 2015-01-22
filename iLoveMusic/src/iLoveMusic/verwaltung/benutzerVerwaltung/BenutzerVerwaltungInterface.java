package iLoveMusic.verwaltung.benutzerVerwaltung;

import java.util.Date;

public interface BenutzerVerwaltungInterface {	
	
	/**
	 * Methode zum registrieren neuer Benutzer.
	 * @param name Benutzername des neuen Benutzers.
	 * @param eMailAdresse E-Mailadresse des neuen Benutzers.
	 * @param geburtstag Geburtsdatum des neuen Benutzers.
	 * @param passwort Passwort des neuen Benutzers.
	 * @return <code>true</code>, wenn die Registrierung erfolgreich war.
	 */
	public abstract boolean register(String name, String eMailAdresse, Date geburtstag, String passwort);
	
	/**
	 * Methode zum Aendern der E-Mailadresse eines Benutzers.
	 * @param benutzer Der Benutzer, dessen E-Mailadresse geaendert werden soll.
	 * @param neueEMailAdresse Die neue E-Mailadresse.
	 * @param passwort Das Passwort des Benutzers, dessen E-Mailadresse geaendert werden soll.
	 * @return <code>true</code>, wenn die Aenderung der E-Mailadresse erfolgreich war.
	 */
	public abstract boolean eMailAdresseAendern(Customer benutzer, String neueEMailAdresse, String passwort);
	
	/**
	 * 
	 * @param benutzer Der Benutzer, dessen Passwort geaendert werden soll.
	 * @param altesPasswort Das alte Passwort des Benutzers, dessen Passwort geaendert werden soll. 
	 * @param neuesPasswort Das neue Passwort des Benutzers, dessen Passwort geaendert werden soll.
	 * @return <code>true</code>, wenn die Aenderung des Passwortes erfolgreich war.
	 */
	public abstract boolean passwortAendern(Customer benutzer, String altesPasswort, String neuesPasswort);
	
	/**
	 * Methode zum aendern des Benutzernamens eines Benutzers.
	 * @param benutzer Benutzer, dessen Benutzername geaendert werden soll.
	 * @param neuerBenutzerNamen Der neue Benutzername des Benutzers.
	 * @return <code>true</code>, wenn die Aenderung des Benutzernamens erfolgreich war.
	 */
	public abstract boolean benutzerNamenAendern(Customer benutzer, String neuerBenutzerNamen);
	
	/**
	 * Methode zum loeschen eines Benutzers.
	 * @param benutzer Der Benutzer, der geloescht werden soll.
	 * @return <code>true</code>, wenn der Benutzer erfolgreich geloescht wurde.
	 */
	public abstract boolean benutzerLoeschen(Customer benutzer);
	
	/**
	 * Liefert die Liste der registrierten Benutzer.
	 * @return Liste der registrierten Benutzer als LinkedList.
	 */
	public abstract BenutzerListe<Customer> getBenutzerListe();
	
	/**
	 * Setzt eine neue Benutzerliste.
	 * @param benutzerListe Die neue Liste aller registrierten Benutzer.
	 */
	public abstract void setBenutzerListe(BenutzerListe<Customer> benutzerListe);
	
}
