package iLoveMusic.musikverwaltung;

public interface MusikVerwaltungInterface {
	
	/**
	 * Methode zum Suchen von Titel nach ausgew&auml;hlten Kriterien.
	 * @param suchBegriff Begriff, nach dem Gesucht werden soll.
	 * @param suchKriterium Suchkriterium, innerhalb dessen gesucht werden soll:<br>
	 * <table border="1"><tr><th>int</th><th>Suchkriterium</th></tr>
	 * <tr><td>0</td><td>Liedtitel</td></tr>
	 * <tr><td>1</td><td>Interpret</td></tr>
	 * <tr><td>2</td><td></td>Albumtitel</tr></table>
	 * @return Der gefundene Titel. Wird kein Titel gefunden, wird <code>null</code> zur&uuml;ckgegeben.
	 */
	public abstract Titel suchen(String suchBegriff, int suchKriterium);
	
	/**
	 * Methode zum Erstellen einer Playliste.
	 * @param tracks Ein Array der Tracks, die zur Playliste geh&ouml;ren sollen.
	 * @return Eine PlayListe, die die angegebenen Tracks enthaelt.
	 */
	public abstract PlayListe playlistErstellen(Track[] tracks);
	
	/**
	 * Methode um das Angebot um einen Track zu erg&auml;nzen.
	 * @param track Der Track, der hinzugef&uuml;gt werden soll.
	 * @return <code>false</code>, falls der Track schon vorhanden war oder nicht hinzugef&uuml;gt werden konnte.
	 */
	public abstract boolean trackHinzufuegen(Track track);
	
	/**
	 * Methode um das Angebot um ein Album zu erg&auml;nzen.
	 * @param tracks Ein Array der Tracks, die das Album enthalten soll.
	 * @return <code>false</code>, falls das Album schon vorhanden war oder nicht hinzugef&uuml;gt werden konnte.
	 */
	public abstract boolean albumErstellen(Track[] tracks);
	
	/**
	 * Methode zum Entfernen eines Titels aus dem Angebot.
	 * @param titel Der Titel, der aus dem Angebot entfernt werden soll.
	 * @return <code>true</code>, wenn der Titel entfernt oder nicht vorhanden war.
	 */
	public abstract boolean titelEntfernen(Titel titel);
	
	/**
	 * Methode zum Abfragen des Datenelementes alben.
	 * @return Eine LinkedList mit allen Alben, die sich im Angebot befinden.
	 */
	public abstract Alben getAlben();
	
	/**
	 * Methode zum ueberschreiben des Datenelementes alben.
	 * @param alben Die neue Liste der angebotenen Alben.
	 */
	public abstract void setAlben(Alben alben);
	
	/**
	 * Methode zum Abfragen des Datenelementes tracks.
	 * @return Eine LinkedList mit allen Tracks, die sich im Angebot befinden.
	 */
	public abstract Tracks getTracks();
	
	/**
	 * Methode zum ueberschreiben des Datenelementes tracks.
	 * @param tracks Die neue Liste der angebotenen Tracks.
	 */
	public abstract void setTracks(Tracks tracks);
}
