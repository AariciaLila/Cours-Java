/*=====================================================================================*/
/* 									Référencement de méthode						   */
/*=====================================================================================*/

// Lorsque le lambda désigne une méthode existante

package esgi.cours;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;

public class ReferencementDeMethode {
	
	static boolean isNegative(int number) {
		return number < 0;
	}
	
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
		
		Function<String, String> fl = String::new;
		System.out.println(fl.apply("Bonjour"));
		
		IntFunction<String[]> f2 = String[]::new;
		System.out.println(f2.apply(10).length);
		
	}

}

// Sortie :
// [11, 3, 5, 8]
// [-7, -9, -2]
// Bonjour
// 10
