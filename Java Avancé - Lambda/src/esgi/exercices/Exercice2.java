/*=====================================================================================*/
/* 									Exercice 2										   */
/*=====================================================================================*/

// Implémenter une expression lambda qui renvoie la somme des tailles de deux tableaux

package esgi.exercices;

public interface Exercice2 {
	int count(int[] tab1, int[] tab2);
	
	public static void main(String[] args) {
		Exercice2 ex = (tab1,tab2) -> tab1.length + tab2.length;
		int[] tab1 = {1, 2, 3, 4};
		int[] tab2 = {2, 4};
		System.out.println(ex.count(tab1, tab2));

}
}

// Sortie :
// 6