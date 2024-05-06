package javamodules.oop.polymorphism.logger;

public class TextLog implements ILogger{

	@Override
	public boolean log(String value) {
		System.out.println(value + " text e kaydedildi");
		return false;
	}

}
