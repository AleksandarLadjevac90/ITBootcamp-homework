package music;

public class Numera {
	private String naziv;
	private String izvodjac;
	private String trajanje;
	
	Numera(String naziv, String izvodjac, String trajanje) {
		this.naziv = naziv;
		this.izvodjac = izvodjac;
		this.trajanje = trajanje;
	}

	public String getNaziv() {
		return naziv;
	}

	public String getIzvodjac() {
		return izvodjac;
	}

	public String getTrajanje() {
		return trajanje;
	}
	
	public String toString() {
		String s = "Numera: " + this.naziv + " - Izvodjac: " 
				+ this.izvodjac + " - Trajanje: " + this.trajanje + "\n";
		return s;
	}
}
