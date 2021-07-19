package day1;

public class MainVoiture {

	public static void main(String[] args) {
		
		//Voiture v1 = new Voiture();
		
		//Voiture v2 = new Voiture("Rouge"); // on utilise le constructeur avec paramètre marque
		//System.out.println(v2.marque);
		
		
		
		Voiture v3 = new Voiture("BMW",30000,"25-07-2021","Noir");
		//v3.detailsVoiture();
		System.out.println(v3.toString());
		System.out.println(v3);
		/*
		//v3 = v2;
		System.out.println("Couleur :" + v1.couleur + " Marque :" + v1.marque + " Prix : "+v1.prix +" Immat : "+v1.immat);
        v1.marque = "Peugeot 2008";
        v1.couleur ="Noir";
        v1.immat ="19-07-2021";
        v1.prix = 15000;
        
        System.out.println("Couleur :" + v1.couleur + " Marque :" + v1.marque + " Prix : "+v1.prix +" Immat : "+v1.immat);
		*/
  }

}
