/*=====================================================================================*/
/* 									TODO 4 :										   */
/* Ecrire une lambda qui prend un double en param�tre et qui calule la racine carr�e   */
/* 								de ce nombre										   */
/*=====================================================================================*/

// Si le lambda prend un seul param�tre d'entr�e, les () sont inutiles

package esgi.cours;

public interface TODO4 {
	double squareRoot(double a);
	
	public static void main(String[] args) {
		TODO4 td = a -> Math.sqrt(a);
		System.out.println(td.squareRoot(5)); // 2.23606797749979
		
	}

}
