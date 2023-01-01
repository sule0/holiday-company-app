
public class YurticiTatil extends Tatil {
	
	public double kisiBasiKonaklama;

	public YurticiTatil() {
		
		System.out.println("\n------ Yurtici tatil secenegini sectiniz ------\n");

	}
	
	public class DoguTuru {
		
	public double ucret;	
	double ucretKonaklama;

		public void ulasımHesapla() {

			KullaniciBilgileri kb = new KullaniciBilgileri();
			kb.bilgiAl();
			int kisiUlasimUcreti = 750;
			int kisisayisi = kb.kisiSayisi;

			if (kb.kisiSayisi < 3) {

				ucret = kisiUlasimUcreti * kisisayisi;
				setUlasim(ucret);
				System.out.println("Toplam ulasim ucretiniz: " + getUlasim());
			} else {

				ucret = (kisiUlasimUcreti * kisisayisi) * 0.9;
				setUlasim(ucret);
				System.out.println("\nTEBRIKLER %10 INDIRIM HAKKI KAZANDINIZ\n");
				System.out.println("Toplam ulasim(otobus) ucretiniz: " + getUlasim());

			}

			kisiBasiKonaklama = 856;
			ucretKonaklama = kisiBasiKonaklama * kisisayisi;
			setKonaklama(ucretKonaklama);

			System.out.println(
					"Toplam konaklama ucretiniz (konaklama ucretine kahvaltida dahildir. ): " + getKonaklama());

		}
		
		
		public void toplam(){
			
			System.out.println("Toplam odemeniz gereken tutar: "+(ucret+ucretKonaklama));
			
		}
		

	}

	public class KaradenizTuru {
		
		double ucret;
		double ucretKonaklama;
		public void karadenizUlasim() {
			
			KullaniciBilgileri kb = new KullaniciBilgileri();
			kb.bilgiAl();
			int kisiUlasimUcreti = 500;
			int kisisayisi = kb.kisiSayisi;
			if (kb.kisiSayisi < 5) {

				ucret = kisiUlasimUcreti * kisisayisi;
				setUlasim(ucret);
				System.out.println("Toplam ulasim ucretiniz: " + getUlasim());
			} else {

				ucret = (kisiUlasimUcreti * kisisayisi) * 0.85;
				setUlasim(ucret);
				System.out.println("Tebrikler %15 indirim hakki kazandiniz.");
				System.out.println("Toplam ulasim(otobus) ucretiniz: " + getUlasim());

			}
			kisiBasiKonaklama = 1204;
		 ucretKonaklama = kisiBasiKonaklama * kisisayisi;
			setKonaklama(ucretKonaklama);

			System.out.println(
					"Toplam konaklama ucretiniz (konaklama ucretine kahvaltida dahildir. ): " + getKonaklama());}

		
		
		public void toplam(){
			
			System.out.println("Toplam odemeniz gereken tutar: "+(ucret+ucretKonaklama));
			
		}
		
	}

	@Override
	public double hesapla() {
		return 0;

	}

	@Override
	public double hesapla(int secim) {

		if (secim == 1) {

			DoguTuru dturu = new DoguTuru();
			dturu.ulasımHesapla();
			dturu.toplam();
		}
		if (secim == 2) {
			KaradenizTuru karadenizTuru = new KaradenizTuru();
			karadenizTuru.karadenizUlasim();
			karadenizTuru.toplam();
		}
	

		return 0;
	}

	@Override
	public double indirimHesapla() {
		
		return 0;
	}

	@Override
	public double indirimHesapla(double tutar) {
		// TODO Auto-generated method stub
		return 0;
	}

}
