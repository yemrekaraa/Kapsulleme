package deafult;

import com.yemrekara.model.Calisan;

public class Test {

	public static void main(String[] args) {
		Calisan calisan = new Calisan(null, null, null, 0);
		
		calisan.setId(15L);
		System.out.println("Çalışanın id'si : " + calisan.getId());
		
		calisan.setMaas(3500);
		System.out.println("Maaş : " + calisan.getMaas());
	}

}
