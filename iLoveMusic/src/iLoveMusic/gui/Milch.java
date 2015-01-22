package iLoveMusic.gui;

public class Milch extends ZutatenDekorierer {
	
	// Konstruktor
	public Milch(Getraenk getraenk){
		this.getraenk = getraenk;
		this.preis = 0.15;
	}

	@Override
	public String getBeschreibung() {
		return (getraenk.getBeschreibung() + ", Milch");
	}

}
