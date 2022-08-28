/*=====================================================================================*/
/* 										Les films									   */
/*=====================================================================================*/

// Dans une classe MovieFactory, on impl�mente la liste des films

package tp.movies;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//D�finition de la classe
public class MovieFactory {
	
	// Partie Instanciation
	private List<Movie> movies = Arrays.asList(
			new Movie("Harry Potter � l'�cole des sorciers", 2001, 
					"Chris Colombus", "Le d�but du destin magique d'un gar�on pas comme les autres"),
			new Movie("Harry Potter et la chambre des secrets", 2002, 
					"Chris Colombus","Dans les entrails de Poudlard, le mal se r�veille"),
			new Movie("Harry Potter et le prisonnier d'azkaban", 2004, 
					"Alphonso curaon", "Les secrets du pass� gissent. Tout ce qui � �t� imagin� sera transform�"),
			new Movie("Harry Potter et la coupe de feu", 2005, 
					"Mike Newell", "Des heures sombres et difficiles s'annoncent"),
			new Movie("Harry Potter et l'ordre du ph�nix", 2007, 
					"David Yates", "La r�bellion commence � Poudlard"),
			new Movie("Harry Potter et le prince de sang-m�l�", 2009, 
					"David Yates", "De sombres secrets d�voil�s pour faire face à la bataille finale"));
	
	// 1) M�thode permettant d'afficher les descriptions des films dans le d�sordre
	// ex : d�voil�s sombres face secrets finale pour faire bataille � De la
	public void printDescriptionInDesorder() {
		System.out.println("----- Descriptions m�lang�es -----");
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
	
	// 2) M�thode permettant de r�cup�rer les titres des films r�alis�s par director
	// La recherche ne doit pas �tre sensible � la casse
	public String getMovieTitleByDirector(String director) {
		System.out.println("----- Films r�alis�s par David Yates -----");
		String movieTitleByDirector ="";
		for (Movie  movie : movies) {
			if(movie.getDirector() == director) {
				movieTitleByDirector+= movie.getTitle()+" ";	
			}
		}
		return movieTitleByDirector;					
	}
	
	// 3) M�thode permettant de r�cup�rer le titre des films sortis dans une ann�e paire
	public List<String> getMovieTitleWithReleaseYearPair(){
		System.out.println("----- Films sortis dans une ann�e paire");
		List<String> movieTitles = new ArrayList<>(); 
		for (Movie  movie : movies) {
			if(movie.getDate() %2 ==0) 
				movieTitles.add(movie.getTitle());
		}
		return movieTitles;	
	}
	
	// 4) M�thode permettant de r�cup�rer le titre des films sortis dans une ann�e impaire
	public List<String> getMovieTitleWithReleaseYearOdd(){
		System.out.println("----- Films sortis dans une ann�e impaire");
		List<String> movieTitles = new ArrayList<>(); 
		for (Movie  movie : movies) {
			if(movie.getDate() %2 !=0) 
				movieTitles.add(movie.getTitle());
		}
		return movieTitles;	
	}
	
	// 5) M�thode permettant d'afficher le titre des films dont la description comporte un mot donn�
	public void printMoviesByPartOfDescription(String word){
		System.out.println("----- Films dont la descriptions comporte le mot secrets -----");
		for (Movie  movie : movies) {
			if(movie.getDescription().contains(word)) 
				System.out.println(movie.getTitle());
		}
	}

	// 6) M�thode qui permet de r�cup�rer les 3 premiers mots des descriptions
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