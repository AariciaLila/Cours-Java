/*=====================================================================================*/
/* 										Déclaration									   */
/*=====================================================================================*/

// - Lambda expressions = fonctions anonymes = lambda
// - Verion 8 Java
// - Programmation fonctionnelle
// - Anonyme = fonction sans nom

// (x,y) -> x + y
// Fonction anonyme = interface en java = interface fonctionnelle
// Ne contient qu'une unique méthode abstraite

package esgi.cours;

public interface IntLambda {
	int compute(int a, int b);
	
	// TODO 2 : Ecrire une fonction anonyme qui prend en entrée 3 entiers et qui
	//          renvoie un entier
	
	public static void main(String[] args) {
		// expression lambda qui accepte deux nombres et renvoie leur somme
		IntLambda al = (a,b) -> a + b;
		System.out.println(al.compute(8, 8)); // 16
		
		// TODO 1 : Ecrire une autre expression lambda correspondant au type IntLambda
		IntLambda al2 = (a,b) -> a - b;
		System.out.println(al2.compute(8, 8)); // 0
		
		// TODO 3 : Ecrire une expression lambda correspondant au type IntLambda
		//          mais avec un bloc d'instruction
		IntLambda al3 = (a,b) -> {
		System.out.println("Hello");
		return a + b;
		};
		System.out.println(al3.compute(8, 8)); // Hello // 16
		

	}

}
