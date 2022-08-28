/*=====================================================================================*/
/* 									TODO 5 :										   */
/* 		Ecrire une autre expression lambda en utilisant d'autres types de paramètres  */
/*=====================================================================================*/

package esgi.cours;

public interface TODO5<T, U, R> {
	T apply(U a, R b);
	
	public static void main(String[] args) {
		GenericLambda<Integer, Integer, Integer> gl = (a, b) -> Integer.compare(a, b);
		System.out.println(gl.apply(1, 2));
		
	}

}

// Sortie :
// -1