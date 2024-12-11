package javamodules.oop.polymorphism.logger;

public class LoggerTest {

	public static void main(String[] args) {
		
		
		DbLog dbLog = new DbLog();
		XmlLog xmlLog = new XmlLog();
		TextLog textLog = new TextLog();
		EmptyClass emptyClass = new EmptyClass();

		Logger logger  = new Logger(dbLog);
		logger.LogKayit("501 sipariş başarılı");

		logger  = new Logger(xmlLog);
		logger.LogKayit("501 sipariş başarılı");

		//logger  = new Logger(emptyClass); // EmptyClass does not implement ILogger that's why to this line, it will not work
		//logger.LogKayit("501 sipariş başarılı");

		logger  = new Logger(textLog);
		logger.LogKayit("501 sipariş başarılı");
		

	}

}
