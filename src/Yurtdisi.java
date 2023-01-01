
public class Yurtdisi extends Tatil {
	public double ucret;
	double konaklamaucret;

	public Yurtdisi() {
		System.out.println("******* Yurtdisi tatil secenegini sectiniz *********");
	}

	KullaniciBilgileri bilgi = new KullaniciBilgileri();

	@Override
	public double hesapla() {

		bilgi.bilgiAl();
		int kisisayisi = bilgi.kisiSayisi;
		ucret = kisisayisi * 3279;
		setUlasim(ucret);
		System.out.println("Yurtdisi tatili icin toplam ulasim ucretiniz: " + getUlasim() + " Lira");
		konaklamaucret = kisisayisi * 5000;
		setKonaklama(konaklamaucret);
		System.out.println("\nYurtdisi tatili icin toplam konaklama ucretiniz: " + getKonaklama());
		return 0;

	}

	public void toplam() {

		System.out.println("\nToplam odemeniz gereken tutar: " + (ucret +konaklamaucret));
	}

	@Override
	public double hesapla(int secim) {

		return 0;
	}

	@Override
	public double indirimHesapla() {
	
		System.out.println("Sansli gununuzdesiniz bugune ozel indirimimiz bulunuyor!\n");
		
		int indirim=(int )(Math.random()*15+5);
		
		
		
		System.out.println("******************************************************\n");
		System.out.println("Kazandiginiz indirim--------->"+"%"+indirim);
		
		double indirimliTutar=(ucret+konaklamaucret)*(100-indirim)/100;
		
		System.out.println("Indrimli toplam tutar: "+indirimliTutar);
		
		
		return indirimliTutar;
	}

	@Override
	public double indirimHesapla(double tutar) {
		// TODO Auto-generated method stub
		return 0;
	}
}
