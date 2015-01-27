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
		
		// Konstruktor
		Warenkorb(){
			
		}
		
		// Methoden
		public double berechnePreis(){
			double gesamtpreis = 0;
			for (Titel tmp : this){
				gesamtpreis = gesamtpreis +  tmp.getPreis();
			}
			return gesamtpreis;
		}
		
		
}
