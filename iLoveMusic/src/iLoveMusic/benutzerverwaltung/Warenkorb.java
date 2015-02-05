package iLoveMusic.benutzerverwaltung;
/**
 * @author Carla Schreiber
 * @date 21.01.2015
 *
 */

import iLoveMusic.musikverwaltung.Titel;

import java.util.LinkedList;

@SuppressWarnings("serial")
public class Warenkorb extends LinkedList<Titel> {
		
	/**
	 * Der Warenkorb ist eine Liste der Titel, die ein Benutzer zum Kauf ausgew&auml;hlt hat.
	*/
		
	// Methoden
	/**
	 * Methode zum berechnen des Gesamtpreises der Titel, die sich im Warenkorb befinden.
	 * @return Der Gesamtpreis aller Titel, die sich im Warenkorb befinden.
	 */
	public double berechnePreis(){
		double gesamtpreis = 0;
		for (Titel tmp : this){
			gesamtpreis = gesamtpreis +  tmp.getPreis();
		}
		return gesamtpreis;
	}		
}
