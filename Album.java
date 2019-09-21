package music;

public class Album {
	private String naziv;
	private String izvodjac;
	private int datum;
	private Numera[] lista;
	private int numeraBrojac;
	
	Album(String naziv, String izvodjac, int datum){
		this.naziv = naziv;
		this.izvodjac = izvodjac;
		this.datum = datum;
		lista = new Numera[10];
		numeraBrojac = 0;
	}
	
	public void dodaj(Numera X) {
		if(numeraBrojac < lista.length - 1) {
			lista[numeraBrojac] = X;
			numeraBrojac++;
		} else {
			Numera[] noviNiz = new Numera[lista.length*2];
			for(int i = 0; i < lista.length; i++) {
				noviNiz[i] = lista[i];
			}
			lista = noviNiz;
			noviNiz = null;
			lista[numeraBrojac] = X;
			numeraBrojac++;
		}
	}
	
	public void dodaj(String name, String trajanje) {
		dodaj(new Numera(name, this.izvodjac, trajanje));
	}
	
	public Numera getNumera(int index) {
		return lista[index];
	}

	public String getNaziv() {
		return naziv;
	}

	public String getIzvodjac() {
		return izvodjac;
	}
	
	public String getTrajanje() {
		int min = 0;
		int sec = 0;
		for(int i = 0; i < numeraBrojac; i++) {
			min += Integer.parseInt(lista[i].getTrajanje().split(":")[0]);
			sec += Integer.parseInt(lista[i].getTrajanje().split(":")[1]);
		}
		min += sec/60;
		sec = sec%60;
		String s = Integer.toString(min) + ":" + Integer.toString(sec);
		return s; 
	}
	
	public String toString() {
		String s = "Naziv albuma: " + this.naziv + "\n";
		s += "Izvodjac: " + this.izvodjac + "\n";
		s += "Datum izlaska: " + Integer.toString(this.datum) + "\n";
		s += "Numere:\n";
		for(int i = 1; i <= numeraBrojac; i++) {
			s += "[" + i + "]" + lista[i-1].toString();
		}
		s += "Trajanje celog albuma: " + getTrajanje();
		return s;
	}
	
}
