package Kompositum;


public class Speise extends SpeisekartenKomponente {
	private double preis;
	private boolean isVegetarisch;

	public Speise(String name, String beschreibung, double preis){
		super(name, beschreibung);
		this.preis = preis;
	}

	public void ausgeben(){
		System.out.println("\tSpeiseName: " + super.getName() + "  |  Preis: " + this.preis + "  |  vegetarisch: " + this.isVegetarisch());
	}


	public double getPreis(){
		return this.preis;
	}

	public String isVegetarisch(){
		if (isVegetarisch == true) {
			return "Ja";
		}
		else
			return "Nein";
	}
}