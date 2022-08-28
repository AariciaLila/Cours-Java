/*===========================================================================================*/
/* 									Partie Java avanc� : POO								 */
/*===========================================================================================*/

package esgi.java;

import java.util.Map;
import java.util.List;


public interface CartoonManager {
	
	// La m�thode getTitleOfMostRecentCartoon permet d'obtenir le titre du cartoon le plus r�cent
	public String getTitleOfMostRecentCartoon(Map<String, Cartoon> collection);
	
	// La m�thode getTitlesOfCartoonFromMusician permet d'obtenir les titres des cartoons qui ont
	// un musicien dont le nom complet comporte la cha�ne pass�e en param�tre.
	// La recherche n'est pas sensible � la casse.
	public List<String> getTitlesOfCartoonFromMusician(String musicians, Map<String, Cartoon> collection);
	
	// La m�thode getTitleOfLongestCartoon permet de r�cup�rer le titre du cartoon qui dure le
	// plus longtemps
	public String getTitleOfLongestCartoon(Map<String, Cartoon> collection);
	
	// La m�thode getCartoonTitlesWithEvenDuration permert de r�cup�rer les titres des cartoons
	// dont la dur�e est paire
	public List<String> getCartoonTitlesWithEvenDuration(Map<String, Cartoon> collection);
	
	// La m�thode getCartoonTitlesReleasedAfterCertainYear permet de r�cup�rer les titres des
	// cartoos sortis apr�s l'ann�e pass�e en param�tre
	public List<String> getCartoonTitlesReleasedAfterCertainYear (int year, Map<String, Cartoon> collection);
	

}


