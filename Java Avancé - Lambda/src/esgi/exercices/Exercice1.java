/*=====================================================================================*/
/* 										Exercice 1									   */
/*=====================================================================================*/

// Impl�menter une expression lambda qui concat�ne deux cha�nes de caract�res

package esgi.exercices;

public interface Exercice1 {
	String concate(String a, String b);
	
	public static void main(String[] args) {
		Exercice1 ex = (a,b) -> a + b;
		System.out.println(ex.concate("Bonjour", "Safia"));

}
}

// Sortie :
// BonjourSafia
