
public class Test {

	public static void main(String[] args) {
		
		//System.out.println("Bonjour � tous");
		
		// Part 1 : Les variables et les types primitifs
		/*
		byte x = 10;
		short y = 100;
		int z = 200;
		long k = 10000;
		
		double moy = 17.5;
		
		float salaire = 12.5F;
		
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		
		System.out.println(Short.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		
		System.out.println(Float.MAX_VALUE);
		System.out.println(Float.MIN_VALUE);
       */
		
		
		boolean res =false; // type primitif bool�en
		char car ='a';   // type primitif caract�re
		
		
		// Les types r�f�rence
		/*
		String formation = "Java";  // type r�f�rence pr�d�finie
		System.out.println("Vous �tudiez " + formation); // message mixte
		
		int l = formation.length(); 
		System.out.println("Longueur de la chaine Java est : "+l);
		
		Personne p = new Personne(); // type r�f�rence d�finie par moi(d�veloppeur)
		p.info();*/
		
		
		// Partie 2 : les tableaux en Java
		
		String [] tab = {"Amine","Jean","Abir","Jean Michelle","Patrick"}; // d�claration et initialisation d'un tableau
		String names []= new String[3]; // un tableau initialis� � des valeurs null
		
		names[0]="OCA";
		names[1]="OCP";
		/*
		System.out.println(tab[0]);
		System.out.println(tab[1]);
		System.out.println(tab[2]);
		System.out.println(tab[3]);
		System.out.println(tab[4]);
		*/
		for(int i =0; i<tab.length; i++)
		{
			if(tab[i].length()>6)
			     {
				   System.out.println(tab[i]);
			     }
		}
		
		for(int i = 0; i<names.length;i++)
		{
			System.out.println(names[i]);
		}
		
		
		
		
		
		
		
		
		
	}

}
