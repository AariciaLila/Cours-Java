/*=====================================================================================*/
/* 									Méthodes par défaut								   */
/*=====================================================================================*/

// - En plus des méthodes abstraites, une interface peut contenir des méthodes par défaut
// - Mot clé default
// - Ex : interface Fonction comporte deux méthodes par défaut: compose et adThen

package esgi.cours;

import java.util.function.Function;

public class MethodesParDefaut {
    
    public static void main(String[] args)  {

    	// On applique d'abord Math.cos(x)
    	Function<Double, Double> g = x -> x * 2;
    	gof1 = g.compose(x -> Math.cos(x));
    	
    	// On applique d'abord x.charAt(0)
    	Function<String, Character> h = x -> x.charAt(0);
    	gof2 = h.andThen(x -> Character.isDigit(x));
    }
}
