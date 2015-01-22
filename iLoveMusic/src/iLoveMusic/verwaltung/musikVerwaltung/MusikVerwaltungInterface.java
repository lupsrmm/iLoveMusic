package iLoveMusic.verwaltung.musikVerwaltung;

public interface MusikVerwaltungInterface {
	
	public abstract Titel suchen(String suchBegriff, int suchKriterium);
	
	public abstract PlayListe playlistErstellen(Track[] tracks);
	
	public abstract boolean trackHinzufuegen(Track track);
	
	public abstract boolean albumErstellen(Track[] tracks);
	
	public abstract boolean titelEntfernen(Titel titel);
	
	public abstract Angebot<Titel> getAngebot();
	
	public abstract void setAngebot(Angebot<Titel> angebot);
	
	

}
