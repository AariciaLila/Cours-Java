package esgi.java;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main {
	

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		
		try {
		
		// Partie Instanciation
		
	
		// création de la map
		Map<String, Cartoon> cartoons = new TreeMap<>();
		
		List<String> directors_latt = new ArrayList<>();
		directors_latt.add("Hamilton Luske");
		directors_latt.add("Clyde Geronimi");
		directors_latt.add("Wilfred Jackson");
		
		List<String> musicians_latt = new ArrayList<>();
		musicians_latt.add("Sony Burke");
		musicians_latt.add("Peggy Lee");
		musicians_latt.add("Olivier G. Wallace");
		
		List<String> directors_pp = new ArrayList<>();
		directors_pp.add("Hamilton Luske");
		directors_pp.add("Clyde Geronimi");
		directors_pp.add("Wilfred Jackson");
		
		List<String> musicians_pp = new ArrayList<>();
		musicians_pp.add("Sammy Cahn");
		musicians_pp.add("Frank Churchill");
		musicians_pp.add("Edward H. Plumb");
		musicians_pp.add("Olivier G. Wallace");
		
		List<String> directors_swatsd = new ArrayList<>();
		directors_swatsd.add("Walt Disney");
		directors_swatsd.add("David Hand");
		
		List<String> musicians_swatsd = new ArrayList<>();
		musicians_swatsd.add("Frank Churchill");
		musicians_swatsd.add("Leigh Harline");
		musicians_swatsd.add("Larry Morey");
		musicians_swatsd.add("Paul J.Smith");
				
		// ajout des pairs clé-valeur à TreeMap	
		cartoons.put("Lady and the Tramp", new Cartoon("Lady and the Tramp","Walt Disney Animation Studios", directors_latt, musicians_latt, 75, LocalDate.of(1995,06,16), "Animation 2D CinemaScope", "1 heures et 15 minutes"));
		cartoons.put("Peter Pan", new Cartoon("Peter Pan", "Walt Disney Animation Studios", directors_pp, musicians_pp, 76, LocalDate.of(1953,02,05), "Animation 2D", "1 heures et 16 minutes"));
		cartoons.put("Snow White and the Seven Dwarfs", new Cartoon("Snow White and the Seven Dwarfs","Walt Disney Animation Studios", directors_swatsd, musicians_swatsd, 83, LocalDate.of(1937,12,21), "Animation 2D", "1 heures et 23 minutes"));
		
		
		
		// obtention de l'ensemble des entrées
		Set set = cartoons.entrySet();
		     
		// obtention de l'iterator pour parcourir la liste
		Iterator itr = set.iterator();
		     
		// Parcourir la liste des entrées de la Map pour afficher chaque entrée
		System.out.println("--------------- Liste des cartoons ---------------");
		while(itr.hasNext()) {
			Map.Entry mentry = (Map.Entry)itr.next();
	        System.out.print(mentry.getKey() + "=Cartoon ");
	        System.out.println(mentry.getValue());
	    }
		
		// Parcourir la liste des valeurs de la Map pour afficher la durée des cartoons en heures
		System.out.println("--------------- Durée des cartoons ---------------");
		itr = set.iterator();
		while(itr.hasNext()) {
			Map.Entry mentry = (Map.Entry)itr.next();
	        System.out.print(mentry.getKey() + " dure ");
	        System.out.println(((Cartoon) mentry.getValue()).getDurationInHours());
	    }
		
		// Parcourir la liste des clés de la Map pour afficher les titres des cartoons
		System.out.println("--------------- Titres des cartoons ---------------");
		itr = set.iterator();
		while(itr.hasNext()) {
			Map.Entry mentry = (Map.Entry)itr.next();
	        System.out.println(mentry.getKey());
	    }
		
		CartoonManager cartoonManager = new CartoonManagerImpl();
		System.out.println("Cartoon le plus récent: " + cartoonManager.getTitleOfMostRecentCartoon(cartoons));
		System.out.println("Cartoon dont un musicien a pour nom de famille Churchill: " + cartoonManager.getTitlesOfCartoonFromMusician("Frank Churchill", cartoons));
		System.out.println("Cartoon qui dure le plus longtemps: " + cartoonManager.getTitleOfLongestCartoon(cartoons));
		System.out.println("Cartoon dont la durée est paire: " + cartoonManager.getCartoonTitlesWithEvenDuration(cartoons));
		System.out.println("Cartoon sortis après 1950: " + cartoonManager.getCartoonTitlesReleasedAfterCertainYear(1950, cartoons));
		
		System.out.println("--------------- Test Lambda ---------------");
		ConcatListLambda cll = (a,sep) -> String.join(sep, a);
		System.out.println(cll.concate(directors_latt, "   "));
		System.out.println(cll.concate(musicians_pp, "   "));
		
		// Ce constructeur prend en paramètre le titre du cartoon uniquement et soulève une
		// TooLongTitleException si la taille du titre est strictement supérieur à 35 caractères
		Cartoon ct = new Cartoon("DuckTales : The Treasure of the Golden Suns");
		ct.play();
			
			}catch(TooLongTitleException e) {
				e.printStackTrace();
			}
		
		
		
		
		
	}
	

	

}
