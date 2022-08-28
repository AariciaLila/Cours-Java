package esgi.java;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;


public class CartoonManagerImpl implements CartoonManager {
	
	// La méthode getTitleOfMostRecentCartoon permet d'obtenir le titre du cartoon le plus récent
		@SuppressWarnings("rawtypes")
		public String getTitleOfMostRecentCartoon(Map<String, Cartoon> collection) {
			System.out.println("---------- Tests des méthodes CartoonManager ----------");
			Set set = collection.entrySet();
			Iterator itr = set.iterator();
			String title = "";
			LocalDate minimum = LocalDate.of(1900,01,01);
			while(itr.hasNext()) {
				Map.Entry mentry = (Map.Entry)itr.next();
				if (((Cartoon) mentry.getValue()).getReleaseDate().isAfter(minimum)) {
					title = (String) mentry.getKey();
				}
				minimum = (LocalDate) ((Cartoon) mentry.getValue()).getReleaseDate();
		        
		    }
			
			return title;
			
		}
		
		// La méthode getTitlesOfCartoonFromMusician permet d'obtenir les titres des cartoons qui ont
		// un musicien dont le nom complet comporte la chaîne passée en paramètre.
		// La recherche n'est pas sensible à la casse.
		@SuppressWarnings("rawtypes")
		public List<String> getTitlesOfCartoonFromMusician(String musicians, Map<String, Cartoon> collection) {
			Set set = collection.entrySet();
			Iterator itr = set.iterator();
			List<String> cartoonTitles = new ArrayList<>();
			while(itr.hasNext()) {
				Map.Entry mentry = (Map.Entry)itr.next();
				if (((Cartoon) mentry.getValue()).getMusicians().contains(musicians)) {
					cartoonTitles.add((String) mentry.getKey());
				}
		        
		    }
			
			return cartoonTitles;
			
		}
		
		// La méthode getTitleOfLongestCartoon permet de récupérer le titre du cartoon qui dure le
		// plus longtemps
		@SuppressWarnings("rawtypes")
		public String getTitleOfLongestCartoon(Map<String, Cartoon> collection) {
			Set set = collection.entrySet();
			Iterator itr = set.iterator();
			String title = "";
			int durationCartoon = 0;
			while(itr.hasNext()) {
				Map.Entry mentry = (Map.Entry)itr.next();
				if (((Cartoon) mentry.getValue()).getDuration() > durationCartoon) {
					title = (String) mentry.getKey();
				}
				durationCartoon = ((Cartoon) mentry.getValue()).getDuration();
		        
		    }
			
			return title;
			
		}
		
		// La méthode getCartoonTitlesWithEvenDuration permert de récupérer les titres des cartoons
		// dont la durée est paire
		public List<String> getCartoonTitlesWithEvenDuration(Map<String, Cartoon> collection){
			
			List<String> titles = collection.entrySet().stream()
					  .filter(e -> e.getValue().getDuration() %2 ==0)
					  .map(Map.Entry::getKey)
					  .collect(Collectors.toList());
			
			return titles;	
		}
		
		// La méthode getCartoonTitlesReleasedAfterCertainYear permet de récupérer les titres des
		// cartoos sortis après l'année passée en paramètre
		public List<String> getCartoonTitlesReleasedAfterCertainYear (int year, Map<String, Cartoon> collection){
			
			List<String> titles = collection.entrySet().stream()
					  .filter(e -> e.getValue().getReleaseDate().getYear() > year)
					  .map(Map.Entry::getKey)
					  .collect(Collectors.toList());
			
			return titles;	
		}
		
		

}
