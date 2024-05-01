package designpatterns.singleton.enumsingleton.araba;

public class YeniAraba {
	
	public Kasa kasa;
	public double fiyat;
	public int id;
	
	public YeniAraba(int id,Kasa kasa, double fiyat) {
		super();
		this.id = id;
		this.kasa = kasa;
		this.fiyat = fiyat;
		
	}
	
	public YeniAraba(Kasa kasa, double fiyat) {
		super();
		this.kasa = kasa;
		this.fiyat = fiyat;
		
	}
	
	
	
	public String paketleniyor;
	public String kargoya_Verildi;
	
	public void siparisVer()
	{
		System.out.println("Arabanın markası : " +kasa.marka.markasi+
				           " modeli : " +kasa.model.modeli+
				           " kapı sayısı : " +kasa.kapi.kapiSayisi+
				           " pencere sayısı : " +kasa.pencere.pencereSayisi+
				           " kasası : " +kasa.kasaTipi+
				           " fiyatı : " +fiyat);
		
		
		
		
	}
	

}
