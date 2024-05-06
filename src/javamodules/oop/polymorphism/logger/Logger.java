package javamodules.oop.polymorphism.logger;

public class Logger {
	
	ILogger logger;
	
	//constructorına ILogger interface ini 
	//implemente etmiş hangi obje gelirse gelsin çalış
	
	public Logger(ILogger logger)
	{
		this.logger = logger;
	}
	
	public void LogKayit(String deger)
	{
		logger.log(deger);
	}
	
}
