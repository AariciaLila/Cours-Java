/*=====================================================================================*/
/* 									M�thodes par d�faut								   */
/*=====================================================================================*/

// - En plus des m�thodes abstraites, une interface peut contenir des m�thodes par d�faut
// - Mot cl� default
// - Ex : interface Fonction comporte deux m�thodes par d�faut: compose et adThen

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
