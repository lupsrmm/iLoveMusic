package iLoveMusic.musikverwaltung;

import java.text.Collator;
import java.util.Locale;


/**
 * @author Carla Schreiber, Julia Behrendt 
 * @date 20.01.2015
 *
 */
public abstract class Titel implements Comparable<Titel>{
	
	// Datenelemente
	/** Hier wird der Name des Titels gespeichert. */
	private String name;
	/** Hier wird der Interpret des Titels gespeichert. */
	private String interpret;
	/** Hier wird die Länge des Titels gespeichert. */
	private int laenge;
	/** Hier wird der Preis des Titels gespeichert. */
	private double preis;
	/** Hier werden Bemerkungen zu dem Titel gespeichert. */
	private String bemerkung;
	/** Hier wird die Altersfreigabe des Titels gespeichert. */
	private int fsk;
	/** Anzahl der K&auml;ufe dieses Titels. */
	private int verkaufszahlen;
	
	// Konstruktor
	/**
	 * Superkonstruktor f&uuml;r Alben.
	 * @param name ist der Name des Titels.
	 * @param interpret ist der Interpret des Titels.
	 * @param bemerkung sind Bemerkungen zu dem Titel.
	 */
	public Titel(String name, String interpret, String bemerkung){
		this.name = name;
		this.bemerkung = bemerkung;
		this.interpret = interpret;
		this.verkaufszahlen = 0;
	}
	/**
	 * Hier wird der Titel initialisiert und die Datenelemente werden initialisiert. Superkonstruktor f&uuml;r Tracks.
	 * @param name ist der Name des Titels.
	 * @param interpret ist der Interpret des Titels.
	 * @param bemerkung sind Bemerkungen zu dem Titel.
	 * @param laenge ist die L&auml;nge des Titels.
	 * @param preis ist der Preis des Titels.
	 * @param fsk ist die FSK des Titels.
	 */
	public Titel(String name, String interpret, String bemerkung, int laenge, double preis, int fsk){
		this.name = name;
		this.bemerkung = bemerkung;
		this.interpret = interpret;
		this.laenge = laenge;
		this.preis = preis;
		this.fsk = fsk;
		this.verkaufszahlen = 0;
	}
		
	// Getter
	/**
	 * Gibt den Namen des Titels zurück.
	 * @return Name des Titels wird zurückgegeben.
	 */
	public String getName(){
		return this.name;
	}
	/**
	 * Gibt den Interpret des Titels zurück.
	 * @return Interpret des Titels wird zurückgegeben.
	 */
	public String getInterpret(){
		return this.interpret;
	}
	/**
	 * Gibt die Länge des Titels zurück.
	 * @return Länge des Titels wird zurückgegeben.
	 */
	public int getLaenge(){
		return this.laenge;
	}
	/**
	 * Gibt den Preis des Titels zurück.
	 * @return Preis des Titels wird zurückgegeben.
	 */
	public double getPreis(){
		return this.preis;
	}
	/**
	 * Gibt Bemerkungen zu dem Titels zurück.
	 * @return Bemerkungen zu dem Titel werden zurückgegeben.
	 */
	public String getBemerkung(){
		return this.bemerkung;
	}
	/**
	 * Gibt die FSK des Titels zurück.
	 * @return FSK des Titels wird zurückgegeben.
	 */
	public int getFSK(){
		return this.fsk;
	}
	/**
	 * Gibt die Verkaufszahlen des Tracks zurück.
	 * @return Es werden die Verkaufszahlen des Tracks zurückgegeben.
	 */
	public int getVerkaufszahlen(){
		return verkaufszahlen;
	}
	
	// Setter
	/**
	 * Setzt den Preis eines Titels neu.
	 * @param newPreis ist der neue Preis.
	 */
	public void setPreis (double newPreis){
		this.preis = newPreis;
	}
	/**
	 * Setzt Bemerkungen eines Titels neu.
	 * @param newBem sind die neuen Bemerkungen.
	 */
	public void setBemerkung(String newBem){
		this.bemerkung = newBem;
	}
	/**
	 * Setzt die Altersfreigabe eines Titels neu.
	 * @param newFSK ist die neue Altersfreigabe.
	 */
	public void setFSK(int newFSK){
		this.fsk = newFSK;
	}
	/**
	 * Setzt die Länge des Titels neu.
	 * @param newLaenge ist die neue Länge.
	 */
	public void setLaenge(int newLaenge){
		this.laenge = newLaenge;
	}
	/**
	 * Setzt den Namen des Titels neu.
	 * @param newName ist der neue Name.
	 */
	public void setName(String newName){
		this.name = newName;
	}
	/**
	 * Setzt den Interpret des Titels neu.
	 * @param newInt ist der neue Interpret.
	 */
	public void setInterpret(String newInt){
		this.interpret = newInt;
	}
	/**
	 * Setzt die Verkaufszahlen des Tracks neu.
	 * @param newVerkaufszahlen sind die neuen Verkaufszahlen.
	 */
	public void setVerkaufszahlen(int newVerkaufszahlen){
		this.verkaufszahlen = newVerkaufszahlen;
	}
	
	@Override
	/**
	 * Sortiert zun&auml;chst nach Verkaufszahlen, dann nach Interpret und zuletzt nach Namen des Titels.
	 */
	public int compareTo(Titel tmp) {
		Collator deCollator = Collator.getInstance(Locale.GERMAN);
		Integer titelVergleich;
		
		if(this.getVerkaufszahlen() < tmp.getVerkaufszahlen()) return 1;
		else if(this.getVerkaufszahlen() > tmp.getVerkaufszahlen()) return -1;
		else{
			titelVergleich = deCollator.compare(this.getInterpret(),  tmp.getInterpret());
			if(titelVergleich == 0)
				titelVergleich = deCollator.compare(this.getName(),  tmp.getName());
			return titelVergleich;
		}
	}
}