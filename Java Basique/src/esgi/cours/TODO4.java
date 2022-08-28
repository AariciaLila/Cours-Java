/*=====================================================================================*/
/* 											TODO 4 :								   */
/* Implémenter une méthode qui prend en paramètre un tableau de double et qui renvoie  */
/* 				un tableau des arrondis des doubles à l'entier le plus proche		   */
/*=====================================================================================*/

package esgi.cours;

import java.util.Arrays;

public class TODO4 {

	public static void main(String[] args) {
		int[] convertArray = getConvertArray();
		System.out.println(Arrays.toString(convertArray));

	}
	
	private static int[] getConvertArray() {
		double[] tab = {1.2, 3.4, 5.6, 7.8, 9.1};
		int[] value = new int[5];
		int i = 0;
		for (double x : tab) {
			value[i++] = (int)x;
		}
		return value;

	}
}

// Sortie : [1, 3, 5, 7, 9]
