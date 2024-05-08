package javamodules.serilization;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement
public class Kullanici implements Serializable {

	private int id;
	private String adi;
	private String soyadi;

	public Kullanici() {

	}

	public Kullanici(int id, String adi, String soyadi) {
		super();
		this.id = id;
		this.adi = adi;
		this.soyadi = soyadi;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public String getSoyadi() {
		return soyadi;
	}

	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}

	@Override
	public String toString() {
		return "Kullanici [id=" + id + ", adi=" + adi + ", soyadi=" + soyadi + "]";
	}

}
