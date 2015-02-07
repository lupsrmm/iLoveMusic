package iLoveMusic.musikverwaltung;

public class MusikVerwaltung implements MusikVerwaltungInterface{
	/**
	 * Die Klasse MusikVerwaltung dient der Vorhaltung des Angebotes der Musikplattform und der Methoden zur Verwaltung der entsprechenden Listen.
	 */
	
	/**
	 *  Datenelement f&uuml;r die Liste der angebotenen Tracks.
	 */
	Tracks tracks;
	/**
	 * Datenelement f&uumlr die Liste der angebotenen Alben.
	 */
	// Alben alben;
	
	/**
	 * Noch nicht implementiert.
	 */
	@Override
	public void setTracks(Tracks tracks){
		this.tracks = tracks;
	}
	
	/**
	 * Noch nicht implementiert.
	 */
	@Override
	public Tracks getTracks(){
		return tracks;
	}

	/**
	 * Noch nicht implementiert.
	 */
	@Override
	public Titel suchen(String suchBegriff, int suchKriterium) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Noch nicht implementiert.
	 */
	@Override
	public PlayListe playlistErstellen(Track[] tracks) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean trackHinzufuegen(Track track) {
		return tracks.add(track);
	}

	/**
	 * Noch nicht implementiert.
	 */
	@Override
	public boolean albumErstellen(Track[] tracks) {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * Entfernt einen Titel aus dem Angebot. Nur f&uuml;r Tracks implementiert.
	 */
	@Override
	public boolean titelEntfernen(Titel titel) {
		return tracks.remove(titel);
	}

	/**
	 * Noch nicht implementiert.
	 */
	@Override
	public Alben getAlben() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Noch nicht implementiert.
	 */
	@Override
	public void setAlben(Alben alben) {
		// TODO Auto-generated method stub
	}
}
