package iLoveMusic.benutzerverwaltung;
/**
 * @author Carla Schreiber
 * @date 21.01.2015
 *
 */

import java.util.LinkedList;

public class Warenkorb<Titel> {
		// Datenelemente
		private LinkedList<Titel> korb= new LinkedList<Titel>();
		
		// Konstruktor
		Warenkorb(){
			
		}
		
		// Getter 
		public LinkedList<Titel> getWarenkorb(){
			return korb;
		}
		
		// Methoden
		public void berechnePreis(){
			int n = korb.size();
			double gesamtpreis = 0;
			for (int i = 0; i < n; i++){
				gesamtpreis = gesamtpreis + (((iLoveMusic.musikverwaltung.Titel) korb.get(i)).getPreis());
			}
		}
		
		
}
