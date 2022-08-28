/*=====================================================================================*/
/* 										Les films									   */
/*=====================================================================================*/

// Dans une classe MovieFactory, on implémente la liste des films

package tp.movies;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//Définition de la classe
public class MovieFactory {
	
	// Partie Instanciation
	private List<Movie> movies = Arrays.asList(
			new Movie("Harry Potter à l'école des sorciers", 2001, 
					"Chris Colombus", "Le début du destin magique d'un garçon pas comme les autres"),
			new Movie("Harry Potter et la chambre des secrets", 2002, 
					"Chris Colombus","Dans les entrails de Poudlard, le mal se réveille"),
			new Movie("Harry Potter et le prisonnier d'azkaban", 2004, 
					"Alphonso curaon", "Les secrets du passé gissent. Tout ce qui à été imaginé sera transformé"),
			new Movie("Harry Potter et la coupe de feu", 2005, 
					"Mike Newell", "Des heures sombres et difficiles s'annoncent"),
			new Movie("Harry Potter et l'ordre du phénix", 2007, 
					"David Yates", "La rébellion commence à Poudlard"),
			new Movie("Harry Potter et le prince de sang-mêlé", 2009, 
					"David Yates", "De sombres secrets dévoilés pour faire face Ã  la bataille finale"));
	
	// 1) Méthode permettant d'afficher les descriptions des films dans le désordre
	// ex : dévoilés sombres face secrets finale pour faire bataille à De la
	public void printDescriptionInDesorder() {
		System.out.println("----- Descriptions mélangées -----");
		for (Movie  movie : movies) {
		  		List<String> description = Arrays.asList(movie.getDescription().split(" "));
		 		Collections.shuffle(description);
		  		String afterShuffle = "";
		  		for (String character : description)
		  		{
		  			afterShuffle += character+" ";
		  		}
			System.out.println(afterShuffle);	
		}	
	}
	
	// 2) Méthode permettant de récupérer les titres des films réalisés par director
	// La recherche ne doit pas être sensible à la casse
	public String getMovieTitleByDirector(String director) {
		System.out.println("----- Films réalisés par David Yates -----");
		String movieTitleByDirector ="";
		for (Movie  movie : movies) {
			if(movie.getDirector() == director) {
				movieTitleByDirector+= movie.getTitle()+" ";	
			}
		}
		return movieTitleByDirector;					
	}
	
	// 3) Méthode permettant de récupérer le titre des films sortis dans une année paire
	public List<String> getMovieTitleWithReleaseYearPair(){
		System.out.println("----- Films sortis dans une année paire");
		List<String> movieTitles = new ArrayList<>(); 
		for (Movie  movie : movies) {
			if(movie.getDate() %2 ==0) 
				movieTitles.add(movie.getTitle());
		}
		return movieTitles;	
	}
	
	// 4) Méthode permettant de récupérer le titre des films sortis dans une année impaire
	public List<String> getMovieTitleWithReleaseYearOdd(){
		System.out.println("----- Films sortis dans une année impaire");
		List<String> movieTitles = new ArrayList<>(); 
		for (Movie  movie : movies) {
			if(movie.getDate() %2 !=0) 
				movieTitles.add(movie.getTitle());
		}
		return movieTitles;	
	}
	
	// 5) Méthode permettant d'afficher le titre des films dont la description comporte un mot donné
	public void printMoviesByPartOfDescription(String word){
		System.out.println("----- Films dont la descriptions comporte le mot secrets -----");
		for (Movie  movie : movies) {
			if(movie.getDescription().contains(word)) 
				System.out.println(movie.getTitle());
		}
	}

	// 6) Méthode qui permet de récupérer les 3 premiers mots des descriptions
	public String[] get3FirstWordsDescription() {	
		String[] movieTitles = new String[6]; 
		int index=0;
		System.out.println("----- 3 premiers mots des descriptions -----");
		for (Movie  movie : movies) {
			String[] descripstionSplitted =movie.getDescription().split(" ");
			movieTitles[index]= descripstionSplitted[0]+" "+descripstionSplitted[1]+" "+descripstionSplitted[2];
			index=index+1;
		}
		return movieTitles;
	}
}