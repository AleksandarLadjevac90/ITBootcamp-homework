package music;

public abstract class Artikal {
	private int id;
	private double cena;
	private int kolicina;
	private static int x = 0;
	
	Artikal(double cena, int kolicina){
		this.cena = cena;
		this.kolicina = kolicina;
		Artikal.x++;
		this.id = Artikal.x;
	}
	
	public boolean kupi() {
		if(this.kolicina > 0) {
			this.kolicina--;
			return true;
		} else {
			return false;
		}
	}
	
	public String toString() {
		String s = "#" + this.id + ": " + this.ime() + " - "
				+ this.cena + " [kol: " + this.kolicina + "]\n";
		return s;
	}
	
	abstract String ime();

	public int getId() {
		return id;
	}

	public double getCena() {
		return cena;
	}

	public int getKolicina() {
		return kolicina;
	}
}
