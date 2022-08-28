/*=====================================================================================*/
/* 									TODO 4 :										   */
/* Ecrire une lambda qui prend un double en paramètre et qui calule la racine carrée   */
/* 								de ce nombre										   */
/*=====================================================================================*/

// Si le lambda prend un seul paramètre d'entrée, les () sont inutiles

package esgi.cours;

public interface TODO4 {
	double squareRoot(double a);
	
	public static void main(String[] args) {
		TODO4 td = a -> Math.sqrt(a);
		System.out.println(td.squareRoot(5)); // 2.23606797749979
		
	}

}
