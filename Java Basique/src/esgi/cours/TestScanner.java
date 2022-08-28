/*=====================================================================================*/
/* 											Exemple 3 :								   */
/*   										  Scanner							       */
/*=====================================================================================*/

// La classe java.util.Scanner permet de lire les entrées du clavier

package esgi.cours;

import java.util.Random;
import java.util.Scanner;

public class TestScanner {

	public static void main(String[] args) {
		
		boolean found =false;
		try (Scanner sc = new Scanner(System.in)){
			
			Random r = new Random();
			int numberToFind = r.nextInt(10);
			
			System.out.println("Veuillez saisir un nombre entre 0 et 9:");
			
			while (!found) {
				int number = sc.nextInt();
				if (number < 0 || number > 9) {
					System.out.println("Le nombre saisi est hors jeu, vous avez perdu");
					break;
				}
				
				if (number == numberToFind) {
					System.out.println("Vous avez gagné");
					found = true;
					break;
				} else if(number > numberToFind) {
					System.out.println("Le nombre à trouver est plus petit");
				} else {
					System.out.println("Le nombre à trouver est plus grand");
				}
			}
		}

	}

}
