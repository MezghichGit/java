package day1;

public class Voiture {
    
	//Les attributs : les caractéristiques d'un objet
	
	public String marque; // c'est attribut de type référence, la valeur par défaut des types références est null
	public double prix; // la valeur par défaut est 0.0
	public String immat;
	public String couleur;
	
	//Une voiture
	public void info()
	{
		System.out.println("Une voiture");
	}
	
	public Voiture() //Constructeur par défaut
	{
		System.out.println("Une nouvelle voiture créer!");
	}
	
	public Voiture(String marque) //Constructeur avec paramètres
	{
		System.out.println("Une nouvelle voiture créer avec marque!");
		this.marque = marque;
	}
}
