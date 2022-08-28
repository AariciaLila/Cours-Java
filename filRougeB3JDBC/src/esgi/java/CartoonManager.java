/*===========================================================================================*/
/* 									Partie Java avancé : POO								 */
/*===========================================================================================*/

package esgi.java;

import java.util.Map;
import java.util.List;


public interface CartoonManager {
	
	// La méthode getTitleOfMostRecentCartoon permet d'obtenir le titre du cartoon le plus récent
	public String getTitleOfMostRecentCartoon(Map<String, Cartoon> collection);
	
	// La méthode getTitlesOfCartoonFromMusician permet d'obtenir les titres des cartoons qui ont
	// un musicien dont le nom complet comporte la chaîne passée en paramètre.
	// La recherche n'est pas sensible à la casse.
	public List<String> getTitlesOfCartoonFromMusician(String musicians, Map<String, Cartoon> collection);
	
	// La méthode getTitleOfLongestCartoon permet de récupérer le titre du cartoon qui dure le
	// plus longtemps
	public String getTitleOfLongestCartoon(Map<String, Cartoon> collection);
	
	// La méthode getCartoonTitlesWithEvenDuration permert de récupérer les titres des cartoons
	// dont la durée est paire
	public List<String> getCartoonTitlesWithEvenDuration(Map<String, Cartoon> collection);
	
	// La méthode getCartoonTitlesReleasedAfterCertainYear permet de récupérer les titres des
	// cartoos sortis après l'année passée en paramètre
	public List<String> getCartoonTitlesReleasedAfterCertainYear (int year, Map<String, Cartoon> collection);
	

}


