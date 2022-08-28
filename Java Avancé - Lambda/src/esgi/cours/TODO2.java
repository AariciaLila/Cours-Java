/*=====================================================================================*/
/* 									TODO 2 :										   */
/* Ecrire une fonction anonyme qui prend en entrée 3 entiers et qui renvoie un entier  */
/*=====================================================================================*/

package esgi.cours;

public interface TODO2 {
	int compute(int a, int b, int c);
	
	public static void main(String[] args) {
		// expression lambda qui accepte deux nombres et renvoie leur somme
		TODO2 al = (a,b,c) -> a + b + c;
		System.out.println(al.compute(8, 8, 8)); // 24

	}

}
