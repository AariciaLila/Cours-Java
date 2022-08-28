/*=====================================================================================*/
/* 											Exemple 1 :								   */
/*   						Afficher la date actuelle écrite en mots			       */
/*=====================================================================================*/

// Classe Main sans arguments

package esgi.cours;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
	// args : tableau de chaînes de caractère donnant accès aux paramètres du programme
	//        lors de son exécution
	public static void main(String[] args) {
		// création de la date du jour
		Date currentDate = new Date();
		
		// formatage de la date actuelle pour l'écrire en mots
		SimpleDateFormat sdf = new SimpleDateFormat("EEE dd MMMM yyyy");
		
		// affichage de la date actuelle dans la console
		System.out.println(sdf.format(currentDate));

	}

}

// Sortie : dim. 12 décembre 2021