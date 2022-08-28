/*====================================================================================*/
/* 										Les films									  */
/*====================================================================================*/

// Teste de toutes les méthodes dans une classe Main

package tp.movies;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		MovieFactory movieFactory = new MovieFactory();
		movieFactory.printDescriptionInDesorder();
		System.out.println(movieFactory.getMovieTitleByDirector("David Yates"));
		System.out.println(movieFactory.getMovieTitleWithReleaseYearPair());
		System.out.println(movieFactory.getMovieTitleWithReleaseYearOdd());
		movieFactory.printMoviesByPartOfDescription("secrets");
		System.out.println(Arrays.toString(movieFactory.get3FirstWordsDescription()));
	
	}
}
