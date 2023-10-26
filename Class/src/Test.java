import java.util.Scanner;

public class Test { public static void main(String[] args) {
	System.out.println("UYGULAMAYA HOŞGELDİNİZ");
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("No değerini giriniz : ");
	int no = scanner.nextInt();
	scanner.nextLine();
	
	System.out.println("İsim değerini giriniz : ");
	String isim = scanner.nextLine();
	
	System.out.println("Soyisim değerini giriniz : ");
	String soyisim= scanner.nextLine();
	
	System.out.println("Tecrübe değerini giriniz : ");
	int tecrube = scanner.nextInt();
	scanner.nextLine();
	
	System.out.println("Maaş değerini giriniz : ");
	double maas = scanner.nextDouble();
	scanner.nextLine();
	
	Calisan calisan = new Calisan(no, soyisim, isim, tecrube, maas);
	
	String islemler ="1- Çalışan bilgilerini göster\n"
		+"2- Zam yap\n"
		+"3- Format at";
	System.out.println("------------");
	System.out.println(islemler);
	System.out.println("Seçim yapınız : ");
	
	int secim = scanner.nextInt();
	scanner.nextLine();
	
	switch (secim) {
	case 1: 
		calisan.calisanBilgileriGoster();
		break;
	
	case 2:
		System.out.println("Zam değerini giriniz : ");
		int zamDegeri = scanner.nextInt();
		scanner.nextLine();
		calisan.zamYap(zamDegeri);
		break;
	
	case 3: 
		System.out.println("Kim format atacak ismini giriniz : ");
		String kisi = scanner.nextLine();
		
		System.out.println("İşletim sistemini Yazınız : ");
		String isletimSistemi= scanner.nextLine();
		
		calisan.formatAt(isletimSistemi	, kisi);
		break;
	
	
	
	default:
		System.out.println("LÜTFEN BELİRTİLEN ARALIKTA BİR DEĞER SEÇİNİZ");
		break;
		
	}
	
	
	
	
	
	
}

}
