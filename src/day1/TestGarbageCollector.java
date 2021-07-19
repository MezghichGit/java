package day1;
/*
import day2.Animal;
import day2.Chat;
import day2.Oiseau;*/

import day2.*;
import day2.matin.*;
/*import day3.Cours;
import day3.TP;*/

import static day2.matin.Vehicule.*; // import statique
import day3.*;
public class TestGarbageCollector {

	public static void main(String[] args) {
		
		System.out.println(vitesseMax);
		info();
		
		Cours c1 = new Cours();
		TP t = new TP();
		day2.Animal  a = new day2.Animal();
		Oiseau o = new Oiseau();
		Chat c = new Chat();
		Vehicule v = new Vehicule();
		
		Personne p1 = new Personne();
		Personne p2 = new Personne();
		Personne p3 = new Personne();
		// 766; 673; 12
		p2 = p1;
		
		p1= null;
		p2=null;
		p3 = null;
		
		System.gc();  // appel au garbage collector
		for(int i=0;i<1000;i++)
		{
			System.out.println(i);
		}
		
		System.out.println("Fin du programme");

	}

}
