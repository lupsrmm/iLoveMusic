package iLoveMusic.musikverwaltung;

public interface MusikVerwaltungInterface {
	
	/**
	 * Methode zum Suchen von Titel nach ausgewaehlten Kriterien.
	 * @param suchBegriff Begriff, nach dem Gesucht werden soll.
	 * @param suchKriterium Suchkriterium, innerhalb dessen gesucht werden soll:<br>
	 * <table border="1"><tr><th>int</th><th>Suchkriterium</th></tr>
	 * <tr><td>0</td><td>Liedtitel</td></tr>
	 * <tr><td>1</td><td>Interpret</td></tr>
	 * <tr><td>2</td><td></td>Albumtitel</tr></table>
	 * @return Der gefundene Titel. Wird kein Titel gefunden, wird <code>null</code> zurueckgegeben.
	 */
	public abstract Titel suchen(String suchBegriff, int suchKriterium);
	
	/**
	 * Methode zum Erstellen einer Playliste.
	 * @param tracks Ein Array der Tracks, die zur Playliste gehoeren sollen.
	 * @return Eine PlayListe, die die angegebenen Tracks enthaelt.
	 */
	public abstract PlayListe playlistErstellen(Track[] tracks);
	
	/**
	 * Methode um das Angebot um einen Track zu ergaenzen.
	 * @param track Der Track, der hinzugefuegt werden soll.
	 * @return <code>false</code>, falls der Track schon vorhanden war oder nicht hinzugefuegt werden konnte.
	 */
	public abstract boolean trackHinzufuegen(Track track);
	
	/**
	 * Methode um das Angebot um ein Album zu ergaenzen.
	 * @param tracks Ein Array der Tracks, die das Album enthalten soll.
	 * @return <code>false</code>, falls das Album schon vorhanden war oder nicht hinzugefuegt werden konnte.
	 */
	public abstract boolean albumErstellen(Track[] tracks);
	
	/**
	 * Methode zum Entfernen eines Titels aus dem Angebot.
	 * @param titel Der Titel, der aus dem Angebot entfernt werden soll.
	 * @return <code>true</code>, wenn der Titel entfernt oder nicht vorhanden war.
	 */
	public abstract boolean titelEntfernen(Titel titel);
	
	public abstract Angebot<Titel> getAngebot();
	
	public abstract void setAngebot(Angebot<Titel> angebot);
	
	

}
