package music;

public class Prodavnica {

	private String ime;
	private String lokacija;
	private Artikal[] inventar;
	private int artikalBrojac;
	
	Prodavnica(String ime, String lokacija){
		this.ime = ime;
		this.lokacija = lokacija;
		inventar = new Artikal[10];
	}
	
	public Artikal[] pretrazi(String tekst) {
		
		int n = 0;
		for(int i = 0; i < artikalBrojac; i++) {
			if (inventar[i].ime().toLowerCase().contains(tekst.toLowerCase())) {
				n++;
			}
		}
		
		Artikal[] niz = new Artikal[n];
		for(int i = 0, j = 0; i < artikalBrojac; i++) {
			if (inventar[i].ime().toLowerCase().contains(tekst.toLowerCase())) {
				niz[j] = inventar[i];
				System.out.println(inventar[i].ime());
				j++;
			}
		}
		
		return niz;
	}
	
	public String toString() {
		String s = this.ime + ": " + this.lokacija + "\n";
		for(int i = 0, j = 0; i < artikalBrojac; i++) {
			s += "\t" + inventar[i].toString();
		}
		return s;
	}
	
	public void dodaj(Artikal A) {
		if(artikalBrojac < inventar.length - 1) {
			inventar[artikalBrojac] = A;
			artikalBrojac++;
		} else {
			Artikal[] noviNiz = new Artikal[inventar.length*2];
			for(int i = 0; i < inventar.length; i++) {
				noviNiz[i] = inventar[i];
			}
			inventar = noviNiz;
			noviNiz = null;
			inventar[artikalBrojac] = A;
			artikalBrojac++;
		}
	}

	public String getIme() {
		return ime;
	}

	public String getLokacija() {
		return lokacija;
	}
}
