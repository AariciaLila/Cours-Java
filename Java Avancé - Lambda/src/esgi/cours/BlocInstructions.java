/*=====================================================================================*/
/* 								Bloc d'instructions									   */
/*=====================================================================================*/

// Le corps d'une lambda e se limite pas à une seule instruction
// {} pour délimiter le bloc

package esgi.cours;

public interface BlocInstructions {
	int compute(int a, int b);
	
	public static void main(String[] args) {
		// expression lambda qui accepte deux nombres et renvoie leur somme
		BlocInstructions al = (a,b) -> {
		System.out.println("Hello");
		return a + b;
		};
		

	}

}
