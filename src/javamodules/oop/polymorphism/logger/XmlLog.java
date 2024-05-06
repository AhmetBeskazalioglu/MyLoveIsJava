package javamodules.oop.polymorphism.logger;

public class XmlLog implements ILogger {

	@Override
	public boolean log(String value) {
		System.out.println(value + " xml dosyasına kaydedildi");
		return false;
	}

}
