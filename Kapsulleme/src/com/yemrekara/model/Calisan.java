package com.yemrekara.model;

public class Calisan {

	// pivate olan bir class özelliklerini Constructor -- getter setter(kapsulleme)
	// ile erişebiliriz
	 
	private Long id;
	private String isim;
	private String soyisim;
	private int maas;
	public Calisan(Long id, String isim, String soyisim, int maas) {
		super();
		this.id = id;
		this.isim = isim;
		this.soyisim = soyisim;
		this.maas = maas;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public String getSoyisim() {
		return soyisim;
	}
	public void setSoyisim(String soyisim) {
		this.soyisim = soyisim;
	}
	public int getMaas() {
		return maas;
	}
	public void setMaas(int maas) {
		if (maas>=1000 && maas<=5000) 
		{
			this.maas = maas;
		}
	}
	
	// ALT + SHİFT + S
	
}
