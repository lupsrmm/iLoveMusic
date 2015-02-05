package iLoveMusic.benutzerverwaltung;
import java.util.Date;

/**
 * @author Carla Schreiber, Julia Behrendt 
 * @date 20.01.2015
 *
 */
public class Customer {
	
	// Datenelemente
	/** Hier wird der Benutzername des Customers gespeichert. */
	private String name;
	/** Hier wird die E-Mail-Adresse des Customers gespeichert. */
	private String eMailAdresse;
	/** Hier wird das Geburtsdatum des Customers gespeichert. */
	private Date geb;
	/** Hier wird das Passwort des Customers gespeichert. */
	private String passwort;
	/** Hier wird der Warenkorb des Customers gespeichert. */
	private Warenkorb korb;
	/** Hier wird die Übersicht der gekauften Titel des Customers gespeichert. */
	private KaufUebersicht uebersicht;
	/** Hier wird das Guthaben des Customers gespeichert. */
	private double guthaben;
	/** Hier werden die erstellten Playlisten des Customers gespeichert. */
	// private Playlist[] meinePlaylisten; 
	
	// Konstruktor
	/**
	 * Initialisiert einen Customer und weist ihm die gegebenen Werte zu.
	 * @param n ist der Benutzername des Customers.
	 * @param eMailAdresse ist die E-Mail-Adresse des Customers.
	 * @param geb ist der Geburtstag des Customers.
	 * @param pw ist das Passwort des Customers.
	 */
public Customer(String n, String eMailAdresse, Date geb, String pw){
		this.name = n;
		this.eMailAdresse = eMailAdresse;
		this.geb = geb;
		this.passwort = pw;
		this.guthaben = 0d;
		this.korb = new Warenkorb();
		this.uebersicht = new KaufUebersicht();
	}
	
	// Getter
	/**
	 * Gibt den Benutzernamen des Customers zurück.
	 * @return Der Name wird zurückgegeben.
	 */
	public String getName(){
		return name;
	}
	/**
	 * Gibt die E-Mail-Adresse des Customers zurück.
	 * @return Die E-Mail-Adresse wird zurückgegeben.
	 */
	public String getEMail(){
		return eMailAdresse;
	}
	/**
	 * Gibt das Geburtsdatum des Customers zurück.
	 * @return Das Geburtsdatum wird zurückgegeben.
	 */
	public Date getGeburtsdatum(){
		return geb;
	}
	/**
	 * Gibt das Passwort des Customers zurück.
	 * @return Das Passwort wird zurückgegeben.
	 */
	public String getPasswort(){
		return passwort;
	}
	/**
	 * Gibt den Warenkorb des Customers zurück.
	 * @return Der Warenkorb wird zurückgegeben.
	 */
	public Warenkorb getWarenkorb(){
		return korb;
	}
	/**
	 * Gibt die Kaufübersicht der Tracks des Customers zurück.
	 * @return Die Kaufübersicht wird zurückgegeben.
	 */
	public KaufUebersicht getKaufUebersicht(){
		return uebersicht;
	}
	/**
	 * Gibt das Guthaben des Customers zurück.
	 * @return Das Guthaben wird zurückgegeben.
	 */
	public double getGuthaben(){
		return guthaben;
	}
	
	
	// Setter
	/**
	 * Setzt den Benutzernamen neu.
	 * @param newName ist der neue Benutzername.
	 */
	public void setName(String newName){
		this.name = newName;
	}
	/**
	 * Setzt die E-Mail-Adresse neu.
	 * @param newEmailAdresse ist die neue E-Mail-Adresse.
	 */
	public void setEMailAdresse(String newEmailAdresse){
		this.eMailAdresse = newEmailAdresse;
	}
	/**
	 * Setzt das Geburtsdatum neu.
	 * @param newGeb ist das neue Geburtsdatum.
	 */
	public void setGeburtsdatum(Date newGeb){
		this.geb = newGeb;
	}
	/**
	 * Setzt das Passwort neu.
	 * @param newPasswort ist das neue Passwort.
	 */
	public void setPasswort(String newPasswort){
		this.passwort = newPasswort;
	}
	/**
	 * Setzt den Warenkorb neu.
	 * @param warenkorb ist der neue Warenkorb.
	 */
	public void setWarenkorb(Warenkorb warenkorb){
		this.korb = warenkorb;
	}
	/**
	 * Setzt das Guthaben neu.
	 * @param newGuthaben ist das neue Guthaben.
	 */
	public void setGuthaben(double newGuthaben){
		this.guthaben = newGuthaben;
	}
	
}