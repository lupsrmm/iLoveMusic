package iLoveMusic.musikverwaltung;


/**
 * @author Carla Schreiber, Julia Behrendt 
 * @date 20.01.2015
 *
 */
public abstract class Titel {
	
	// Datenelemente
	private String name;
	private String interpret;
	private int laenge;
	private double preis;
	private String bemerkung;
	private int fsk;
	
	// Konstruktor
	Titel(String n, String i, String b){
		this.name = n;
		this.bemerkung = b;
		this.interpret = i;
	}
	Titel(String n, String i, String b, int l, double p, int f){
		this.name = n;
		this.bemerkung = b;
		this.interpret = i;
		this.laenge = l;
		this.preis = p;
		this.fsk = f;
	}
	
	
	// Getter
	public String getName(){
		return this.name;
	}
	
	public String getInterpret(){
		return this.interpret;
	}
	
	public int getLaenge(){
		return this.laenge;
	}
	
	public double getPreis(){
		return this.preis;
	}
	
	public String getBemerkung(){
		return this.bemerkung;
	}
	
	public int getFSK(){
		return this.fsk;
	}
	
	// Setter
	public void setPreis (double newPreis){
		this.preis = newPreis;
	}
	
	public void setBemerkung(String newBem){
		this.bemerkung = newBem;
	}
	
	public void setFSK(int newFSK){
		this.fsk = newFSK;
	}
	
	public void setLaenge(int newLaenge){
		this.laenge = newLaenge;
	}
	
	public void setName(String newName){
		this.name = newName;
	}
	
	public void setInterpret(String newInt){
		this.interpret = newInt;
	}
	
}