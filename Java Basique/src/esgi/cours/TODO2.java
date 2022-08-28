/*=====================================================================================*/
/* 											TODO 2 :								   */
/* Implémenter une méthode qui prend en entrée un tableau d'entiers et qui renvoie la  */
/* somme des entiers du tableau. Appeler la méthode dans une classe Main pour la tester*/
/*=====================================================================================*/

package esgi.cours;

public class TODO2 {

	public static void main(String[] args) {
		printSumArray();

	}
	
	private static void printSumArray() {
		int[] tab = {1, 2, 3, 4, 5};
		int somme = 0;
		for (int i : tab) {
			somme = somme + i;
		}
		System.out.println("La somme des éléments du tableau est : "+ somme);
	
	}

}