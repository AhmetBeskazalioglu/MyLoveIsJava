package org.javaturk.oopj.ch01;

public class Selam{
	
	String world = "millet"; 
	
	public String selamSoyle(String kime) {
		String cumle;
		if (kime != "")
			cumle = "Selam " + kime + " :)";
		else
			cumle = "Selam " + world + " :)";
		return cumle;
  }
} 
