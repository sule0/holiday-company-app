import java.util.Scanner;

public class KullaniciBilgileri {

	public int kisiSayisi;
	public int tatilTuru;

	Scanner klavye = new Scanner(System.in);

	public void bilgiAl() {

		System.out.println("Tatile kac kisi katilacaksiniz? ");

		kisiSayisi = klavye.nextInt();

		
		

		for (int i = 0; i < kisiSayisi; i++) {

			System.out.println(i + 1 + ". Kisinin ismini giriniz : ");
			String isim = klavye.next();
			System.out.println(i+1+".Kisinin soy ismini giriniz: ");
			String soyisim=klavye.next();

			
	}
			
	
	}
	
	

	public void tatilSec() throws Exception {
		
		System.out.println("\n****************KACA TATIL SITESINE HOSGELDINIZ***************\n");

		System.out.println("1.Yurt Ici Tatil Turu");
		System.out.println("2.Yurtdisi Tatil Turu ");
		System.out.println("3.Tekne Turu Tatili\n");
		System.out.println("Tatil turunuzu seciniz( sectiginiz turun numarasini giriniz ): \n ");
	
		tatilTuru = klavye.nextInt();

		if (tatilTuru != 1 && tatilTuru != 2 && tatilTuru != 3) {
			throw new Exception("Yanlis tusladiniz.");
		
		}
			
		
		

		switch (tatilTuru) {
		case 1:
			YurticiTatil yurticiTatil = new YurticiTatil();
			
			System.out.println("Yurtici tatili icin hangisini tercih edersiniz: ");
			System.out.println("1.Dogu Turu");
			System.out.println("2.Karadeniz Turu");
			
			int secim = klavye.nextInt();
			if (secim != 1 && secim != 2 ) {
				throw new Exception("Yanlis tusladiniz.");
			}
			
           yurticiTatil.hesapla(secim);
			break;
			
		case 2:
		
			Yurtdisi yurtdisi = new Yurtdisi();
			yurtdisi.hesapla(); 
			yurtdisi.toplam();
			yurtdisi.indirimHesapla();
		
			break;

		case 3:
			TekneTatili tekneTatili = new TekneTatili();
			tekneTatili.hesapla();
			tekneTatili.hesapla(3);
			tekneTatili.indirimHesapla(88);
			break;
		}

	}

}
