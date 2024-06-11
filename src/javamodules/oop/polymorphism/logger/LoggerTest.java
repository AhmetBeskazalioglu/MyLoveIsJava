package javamodules.oop.polymorphism.logger;

public class LoggerTest {

	public static void main(String[] args) {
		
		
		DbLog dbLog = new DbLog();
		XmlLog xmlLog = new XmlLog();
		TextLog textLog = new TextLog();
		Logger logger  = new Logger(textLog);
		logger.LogKayit("501 sipariş başarılı");
		

	}

}
