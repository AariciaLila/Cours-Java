/*=====================================================================================*/
/* 									Lambda en paramètre								   */
/*=====================================================================================*/

// Un des intérêts principaux des lambdas est leur utilisation comme paramètre ou comme
// résultat d'une méthode

package esgi.cours;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class LambdaEnParamètre {
	
	static List<Integer> getSomeNumbers(List<Integer> list, Predicate<Integer> p) {
		List<Integer> positiveNumbers = new ArrayList<>();
		for(Integer i: list) {
			if(p.test(i)) {
				positiveNumbers.add(i);
			}
		}
		return positiveNumbers;
	}

	public static void main(String[] args) {
		// on récupère les nombres positifs de la liste
		System.out.println(getSomeNumbers(Arrays.asList(-7, -9, 11, 3, 5, 8, -2), x -> x> 0));
		// on récupère les nombres négatifs de la liste
		System.out.println(getSomeNumbers(Arrays.asList(-7, -9, 11, 3, 5, 8, -2), x -> x<0));

	}

}

// Sortie :
// [11, 3, 5, 8]
// [-7, -9, -2]
