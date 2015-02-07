package iLoveMusic.benutzerverwaltung;

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
	 * Methode zum &Auml;ndern der E-Mailadresse eines Benutzers.
	 * @param benutzer Der Benutzer, dessen E-Mailadresse ge&auml;ndert werden soll.
	 * @param neueEMailAdresse Die neue E-Mailadresse.
	 * @param passwort Das Passwort des Benutzers, dessen E-Mailadresse g&auml;endert werden soll.
	 * @return <code>true</code>, wenn die &Auml;nderung der E-Mailadresse erfolgreich war.
	 */
	public abstract boolean eMailAdresseAendern(Customer benutzer, String neueEMailAdresse, String passwort);
	
	/**
	 * 
	 * @param benutzer Der Benutzer, dessen Passwort ge&auml;ndert werden soll.
	 * @param altesPasswort Das alte Passwort des Benutzers, dessen Passwort ge&auml;ndert werden soll. 
	 * @param neuesPasswort Das neue Passwort des Benutzers, dessen Passwort ge&auml;ndert werden soll.
	 * @return <code>true</code>, wenn die Aenderung des Passwortes erfolgreich war.
	 */
	public abstract boolean passwortAendern(Customer benutzer, String altesPasswort, String neuesPasswort);
	
	/**
	 * Methode zum &Auml;ndern des Benutzernamens eines Benutzers.
	 * @param benutzer Benutzer, dessen Benutzername ge&auml;ndert werden soll.
	 * @param neuerBenutzerNamen Der neue Benutzername des Benutzers.
	 * @return <code>true</code>, wenn die Aenderung des Benutzernamens erfolgreich war.
	 */
	public abstract boolean benutzerNamenAendern(Customer benutzer, String neuerBenutzerNamen);
	
	/**
	 * Methode zum L&ouml;schen eines Benutzers.
	 * @param benutzer Der Benutzer, der gel&ouml;scht werden soll.
	 * @return <code>true</code>, wenn der Benutzer erfolgreich gel&ouml;scht wurde.
	 */
	public abstract boolean benutzerLoeschen(Customer benutzer);
	
	/**
	 * Liefert die Liste der registrierten Benutzer.
	 * @return Liste der registrierten Benutzer als LinkedList.
	 */
	public abstract BenutzerListe getBenutzerListe();
	
	/**
	 * Setzt eine neue Benutzerliste.
	 * @param benutzerListe Die neue Liste aller registrierten Benutzer.
	 */
	public abstract void setBenutzerListe(BenutzerListe benutzerListe);
	
}
