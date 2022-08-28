/*=====================================================================================*/
/* 											Exemple 1 :								   */
/*   						Afficher la date actuelle �crite en mots			       */
/*=====================================================================================*/

// Classe Main sans arguments

package esgi.cours;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
	// args : tableau de cha�nes de caract�re donnant acc�s aux param�tres du programme
	//        lors de son ex�cution
	public static void main(String[] args) {
		// cr�ation de la date du jour
		Date currentDate = new Date();
		
		// formatage de la date actuelle pour l'�crire en mots
		SimpleDateFormat sdf = new SimpleDateFormat("EEE dd MMMM yyyy");
		
		// affichage de la date actuelle dans la console
		System.out.println(sdf.format(currentDate));

	}

}

// Sortie : dim. 12 d�cembre 2021