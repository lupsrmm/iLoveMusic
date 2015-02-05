package iLoveMusic.benutzerverwaltung;

import iLoveMusic.musikverwaltung.Titel;

public interface KontoVerwaltungInterface {
	
	/**
	 * Funktion zum Pruefen, ob das Guthaben des Customers ausreicht, um den aktuellen Inhalt des Warenkorbs zu kaufen.
	 * @param customer ist der eingeloggte Benutzer.
	 * @return	<code>true</code>, wenn das Guthaben ausreicht.
	 */
	public abstract boolean guthabenPruefen(Customer customer);
	
	/**
	 * Erhoeht oder veringert des Guthabens eines Customers um einen bestimmten Wert.
	 * @param customer ist der eingeloggte Benutzer.
	 * @param guthabenDifferenz ist der Wert, der auf das aktuelle Guthaben addiert werden soll (negativ, falls Guthaben abgezogen werden soll).
	 * @return Das aktualisierte Guthaben.
	 */
	public abstract double guthabenVerrechnen(Customer customer, double guthabenDifferenz);
	
	/**
	 * Fuegt gekaufte Titel (aus dem Warenkorb) der kaufUebersicht des Customers hinzu, erhoeht die Verkaufszahlen der gekauften Titel und sortiert das Angebot erneut..
	 * @param customer ist der eingeloggte Benutzer.
	 * @return <code>true</code>, wenn erfolgreich.
	 */
	public abstract boolean kaufGutschreiben(Customer customer);
	
	/**
	 * Ermoeglicht den Download gekaufter Titel.
	 * @param titelListe ist die Liste der Titel, die zum DOwnload bereitgestellt werden sollen.
	 * @return <code>true</code>, wenn erfolgreich.
	 */
	public abstract boolean download(Titel[] titelListe);

}
