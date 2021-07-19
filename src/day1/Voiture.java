package day1;

public class Voiture {
    
	//Les attributs : les caractéristiques d'un objet
	
	public String marque; // c'est attribut de type référence, la valeur par défaut des types références est null
	public double prix; // la valeur par défaut est 0.0
	public String immat;
	
	static int nombre; // attribut de la classe
	
	public static void getNbrVoitures()
	{
		System.out.println(nombre);
	}
	
	static{
		System.out.println("Bloc static de classe");
	}
	
	//bloc d'initialisation d'instance : ce block s'exécute juste avant le constructeur
	{
		System.out.println("Je suis un blc 1 d'initialisation");
	}
	
	{
		System.out.println("Je suis un blc 2 d'initialisation");
	}
	
	
	public String toString() {
		return "Voiture [marque=" + marque + ", prix=" + prix + ", immat=" + immat + ", couleur=" + couleur + "]";
	}

	public String couleur;
	
	//Une voiture
	public void info()
	{
		System.out.println("Une voiture");
	}
	
	public Voiture() //Constructeur par défaut
	{
		nombre++;
		System.out.println("Une nouvelle voiture créer!");
	}
	
	public Voiture(String marque) //Constructeur avec paramètres
	{
		System.out.println("Une nouvelle voiture créer avec marque!");
		this.marque = marque;
	}

	public Voiture(String marque, double prix, String immat, String couleur) {
		
		
		this.marque = marque;
		this.prix = prix;
		this.immat = immat;
		this.couleur = couleur;
	}
	
	/*
	public Voiture(String marque, String cl,String imt, double pr) //Constructeur avec paramètres
	{
		System.out.println("Une nouvelle voiture créer 4 paramètres!");
		this.marque = marque;
		this.couleur = cl;
		this.immat = imt;
		this.prix = pr;
	}
	
	public void detailsVoiture()
	{
	System.out.println("Voiture [Marque : "+this.marque+" Couleur : "+this.couleur+" Immat : "+this.immat+" Prix :"+this.prix+"]");
	}*/
	
	
	public void finalize()
	{
		System.out.println("Destruction de l'objet");
	}
}
