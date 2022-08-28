/*=====================================================================================*/
/* 										Exercice 4									   */
/*=====================================================================================*/



package esgi.exercices;

import java.util.Arrays;
import java.util.function.Function;

public class Exercice4 {
	
	// Implémenter la méthode suivante :
	
	static <T, R, Z> Function<T,Z> compose(Function<T, R> f, Function<R, Z> g) {
		return x -> g.apply(f.apply(x));
	}
	
// Dans un main, tester la méthode compose avec T = String, R = Character et Z = Integer
	
	public static void main(String[] args) {

		Function<Double, Double> gof1 = compose(x -> Math.cos(x), x -> x * 2);
		System.out.println(gof1.apply(Math.PI));
		
		Function<String, Boolean> gof2 = compose(x -> x.charAt(0), x -> Character.isDigit(x));
		System.out.println(gof2.apply("9Safinette"));
		System.out.println(gof2.apply("Tomate"));
		
		Function<String, String[]> gof3 = compose(x -> x.concat(x), x -> x.split(" "));
		System.out.println(Arrays.toString(gof3.apply("safia hello ")));
		
	}

}

// Sortie :
// -2.0
// true
// false
// [safia, hello, safia, hello]
