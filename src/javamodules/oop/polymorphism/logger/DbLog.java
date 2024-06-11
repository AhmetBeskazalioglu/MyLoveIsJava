package javamodules.oop.polymorphism.logger;

public class DbLog implements ILogger{

	@Override
	public boolean log(String value) {
	
		System.out.println(value + " database kaydedildi");
		return false;
	}

}
