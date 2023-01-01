
public abstract class Tatil {
	
	public Tatil(){
		
	}
	private double konaklama;
	private double ulasim;
	private int yemekMasrafi;
	
	public int getYemekMasrafi() {
		return yemekMasrafi;
	}
	public void setYemekMasrafi(int yemekMasrafi) {
		this.yemekMasrafi = yemekMasrafi;
	}
	public double getKonaklama() {
		return konaklama;
	}
	public void setKonaklama(double konaklama) {
		this.konaklama = konaklama;
	}
	public double getUlasim() {
		return ulasim;
	}
	public void setUlasim(double ulasim) {
		this.ulasim = ulasim;
	}

	public abstract double  hesapla() ;
	
	public abstract double hesapla(int secim);
	
	public abstract double indirimHesapla(); 
	
	public abstract double indirimHesapla(double tutar);
	

	

}
