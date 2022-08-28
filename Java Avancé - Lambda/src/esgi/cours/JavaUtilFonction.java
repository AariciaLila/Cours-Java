/*=====================================================================================*/
/* 									java.util.fonction								   */
/*=====================================================================================*/

package esgi.cours;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
//Consumer<T> : représente une procédure à un paramètre de type T
import java.util.function.Consumer;
// Function<T,R> : représente une fonctio à un paramètre de type T qui renvoie un résultat
//                 de type R
import java.util.function.Function;
// Predicate<T> : représente une fonctio booléene à un paramètre de type T
import java.util.function.Predicate;

public class JavaUtilFonction {
	
	public static void main(String[] args) {
		
		// Consumer<T> : exemple 1

		Consumer<String> print = x -> System.out.println(x);
		print.accept("JAVA AVANCE");
		
		// Consumer<T> : exemple 2
		List<String> names = Arrays.asList("safia", "safinette", "théo");
		forEach(names, (String x) -> System.out.println(x.length()));
		
		// Function<T,R> : exemple 1
		Function<String, Integer> function = x -> x.length();
		System.out.println(function.apply("Chocolat"));
		
		// Function<T,R> : exemple 2
		function = x -> new Random().nextInt(x.length()) * 100;
		System.out.println(function.apply("Marionette"));
		
		// Predicate<T> : exemple
		System.out.println("----- Test Predicate -----");
		int[] numbers = {5, 6, 8, 0, 3, 2, 9};
		Predicate<Integer> p = x -> x%2 == 0;
		for(int i = 0; i<numbers.length; i++) {
			if(p.test(numbers[i])) {
				System.out.println(numbers[i]);
			}
		}
		System.out.println("----------");
		p  = x -> x%2 ==1;
		for(int i=0; i<numbers.length; i++) {
			if(p.test(numbers[i])) {
				System.out.println(numbers[i]);
			}
		}
		
			}
	
	// Consumer<T> : exemple 2
	static <T> void forEach(List<T> list, Consumer<T> consumer) {
		for (T t : list) {
			consumer.accept(t);
		}
	
	}

}

// Sortie :
// JAVA AVACE
// 5
// 9
// 4
// 8
// 300 (random)
// ----- Test Predicate -----
// 6
// 8
// 0
// 2
// ----------
// 5
// 3
// 9