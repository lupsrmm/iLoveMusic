package iLoveMusic.musikverwaltung;

import java.text.Collator;
import java.util.Locale;


/**
 * @author Carla Schreiber, Julia Behrendt 
 * @date 20.01.2015
 *
 */
public class Track extends Titel implements Comparable<Track>{
	
	// Datenelemente
	private int chartplatzierung;
	
	// Konstruktor
public Track(String name, String interpret, int laenge, double preis, String bemerkung, int fsk, int chart){
		super(name, interpret, bemerkung, laenge, preis, fsk);
		this.chartplatzierung = chart;
	}
	
	// Getter 
	public int getChartplatzierung(){
		return chartplatzierung;
	}
	
	// Setter
	public void setChartplatzierung(int newChartplatzierung){
		this.chartplatzierung = newChartplatzierung;
	}

	@Override
	public int compareTo(Track tmp) {
		Collator deCollator = Collator.getInstance(Locale.GERMAN);
		Integer trackVergleich;
		
		if(this.getChartplatzierung() > tmp.getChartplatzierung()) return 1;
		else if(this.getChartplatzierung() < tmp.getChartplatzierung()) return -1;
		else{
			trackVergleich = deCollator.compare(this.getInterpret(),  tmp.getInterpret());
			if(trackVergleich == 0)
				trackVergleich = deCollator.compare(this.getName(),  tmp.getName());
			return trackVergleich;
		}
	}
	
}

