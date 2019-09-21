package music;

public class CD extends AlbumArtikal{
	
	CD(Album album, String izdavac, double cena, int kolicina){
		super(album, izdavac, cena, kolicina);
	}

	String ime() {
		return this.album.getIzvodjac() + " - " + this.album.getNaziv()
			+ " (CD)";
	}
}
