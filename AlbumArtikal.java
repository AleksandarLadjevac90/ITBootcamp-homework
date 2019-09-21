package music;

public abstract class AlbumArtikal extends Artikal{
	
	private String izdavac;
	protected Album album;
	
	AlbumArtikal(Album album, String izdavac, double cena, int kolicina){
		super(cena, kolicina);
		this.album = album;
		this.izdavac = izdavac;
	}
}
