/*=====================================================================================*/
/* 											Généricité								   */
/*=====================================================================================*/

// Les fonctions anonymes peuvent être génériques

package esgi.cours;

public interface GenericLambda<T, U, R> {
	T apply(U a, R b);
	
	public static void main(String[] args) {
		GenericLambda<String, String, String> gl = (a, b) -> a.concat(" ").concat(b);
		System.out.println(gl.apply("Hello", "Safia"));
		
	}

}

// Sortie :
// Hello Safia