package day2;

public class Animal {

	private int age;  //privé à la classe
	String espece;  // package private(default)
	public String nom;  // attribut visible partout dans le projet
	
	protected double prix;
	
	public void info()
	{
		System.out.println(age);
	}
}
