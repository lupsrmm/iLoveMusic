package iLoveMusic.musikverwaltung;


/**
 * @author Carla Schreiber, Julia Behrendt 
 * @date 20.01.2015
 *
 */
public class Track extends Titel{
	
	// Datenelemente
	private int chartplatzierung;
	
	// Konstruktor
	Track(String name, String interpret, int laenge, double preis, String bemerkung, int fsk, int chart){
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
	
}

