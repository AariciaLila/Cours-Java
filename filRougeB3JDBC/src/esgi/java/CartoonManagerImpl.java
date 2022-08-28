package esgi.java;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;


public class CartoonManagerImpl implements CartoonManager {
	
	// La m�thode getTitleOfMostRecentCartoon permet d'obtenir le titre du cartoon le plus r�cent
		@SuppressWarnings("rawtypes")
		public String getTitleOfMostRecentCartoon(Map<String, Cartoon> collection) {
			System.out.println("---------- Tests des m�thodes CartoonManager ----------");
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
		
		// La m�thode getTitlesOfCartoonFromMusician permet d'obtenir les titres des cartoons qui ont
		// un musicien dont le nom complet comporte la cha�ne pass�e en param�tre.
		// La recherche n'est pas sensible � la casse.
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
		
		// La m�thode getTitleOfLongestCartoon permet de r�cup�rer le titre du cartoon qui dure le
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
		
		// La m�thode getCartoonTitlesWithEvenDuration permert de r�cup�rer les titres des cartoons
		// dont la dur�e est paire
		public List<String> getCartoonTitlesWithEvenDuration(Map<String, Cartoon> collection){
			
			List<String> titles = collection.entrySet().stream()
					  .filter(e -> e.getValue().getDuration() %2 ==0)
					  .map(Map.Entry::getKey)
					  .collect(Collectors.toList());
			
			return titles;	
		}
		
		// La m�thode getCartoonTitlesReleasedAfterCertainYear permet de r�cup�rer les titres des
		// cartoos sortis apr�s l'ann�e pass�e en param�tre
		public List<String> getCartoonTitlesReleasedAfterCertainYear (int year, Map<String, Cartoon> collection){
			
			List<String> titles = collection.entrySet().stream()
					  .filter(e -> e.getValue().getReleaseDate().getYear() > year)
					  .map(Map.Entry::getKey)
					  .collect(Collectors.toList());
			
			return titles;	
		}
		
		

}
