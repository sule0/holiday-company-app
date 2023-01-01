import java.util.Scanner;

public class TekneTatili extends Tatil {
	double gunlukTutar;

	public TekneTatili() {

		System.out.println("********Tekne tatilini sectiniz **********");
	}

	@Override
	public double hesapla() {

		System.out.println("Tekne Tatili icin seceneklerimiz:");
		System.out.println(" 1.Standart oda  2.Delux oda--->");
		Scanner klavye = new Scanner(System.in);
		int oda = klavye.nextInt();
		KullaniciBilgileri bilgi = new KullaniciBilgileri();
		bilgi.bilgiAl();
		int kisiSayisi = bilgi.kisiSayisi;
		if (oda == 1) {
			setKonaklama(760);
			gunlukTutar = kisiSayisi * getKonaklama();
			System.out.println("Kisi basi Standart oda fiyatimiz: " + getKonaklama());
		} else {

			setKonaklama(1050);
			gunlukTutar = kisiSayisi * getKonaklama();
			System.out.println("Kisi basi Delux oda fiyatimiz: " + getKonaklama());
		}

		return 0;

	}

	@Override
	public double hesapla(int secim) {
		System.out.println("Toplam odemeniz gereken tutar: " + gunlukTutar);

		return 0;
	}

	@Override
	public double indirimHesapla() {
	
		return 0;
	}

	@Override
	public double indirimHesapla(double tutar) {
		System.out.println("Sansli gununuzdesiniz bugune ozel indirimimiz bulunuyor!");

		int indirim = (int) (Math.random() *10 + 5);

		System.out.println("******************************************************");
		System.out.println("Kazandiginiz indirim--------->" + "%" + indirim);
		
		double indirimliTutar=(gunlukTutar)*(100-indirim)/100;
		
		System.out.println("Indrimli toplam tutar: "+indirimliTutar);
		
		return 0;
	}
}
