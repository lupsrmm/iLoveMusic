package iLoveMusic.benutzerverwaltung;
import java.util.Date;

/**
 * @author Carla Schreiber, Julia Behrendt 
 * @date 20.01.2015
 *
 */
public class Customer {
	
	// Datenelemente
	private String name;
	private String eMailAdresse;
	private Date geb;
	private String passwort;
	private Warenkorb korb;
	private KaufUebersicht uebersicht;
	private double guthaben;
	// private LinkedList <Track> Playlist;
	
	// Konstruktor
	Customer(String n, String eMailAdresse, Date geb, String pw){
		this.name = n;
		this.eMailAdresse = eMailAdresse;
		this.geb = geb;
		this.passwort = pw;
		this.guthaben = 0;
		this.korb = new Warenkorb();
		this.uebersicht = new KaufUebersicht();
	}
	
	// Getter
	public String getName(){
		return name;
	}
	
	public String getEMail(){
		return eMailAdresse;
	}
	
	public Date getGeburtsdatum(){
		return geb;
	}
	
	public String getPasswort(){
		return passwort;
	}
	
	public Warenkorb getWarenkorb(){
		return korb;
	}
	
	public KaufUebersicht getKaufuebersicht(){
		return uebersicht;
	}
	
	public double getGuthaben(){
		return guthaben;
	}
	
	
	// Setter
	
	public void setName(String newName){
		this.name = newName;
	}
	
	public void setEMailAdresse(String newEmailAdresse){
		this.eMailAdresse = newEmailAdresse;
	}
	
	public void setGeburtsdatum(Date newGeb){
		this.geb = newGeb;
	}
	
	public void setPasswort(String newPasswort){
		this.passwort = newPasswort;
	}
	
	public void setGuthaben(double newGuthaben){
		this.guthaben = newGuthaben;
	}
	
}

