/*=====================================================================================*/
/* 											TODO 2 :								   */
/* Impl�menter une m�thode qui prend en entr�e un tableau d'entiers et qui renvoie la  */
/* somme des entiers du tableau. Appeler la m�thode dans une classe Main pour la tester*/
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
		System.out.println("La somme des �l�ments du tableau est : "+ somme);
	
	}

}