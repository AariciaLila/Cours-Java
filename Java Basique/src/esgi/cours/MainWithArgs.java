/*=====================================================================================*/
/* 											Exemple 2 :								   */
/*   								Classe Main avec arguments					       */
/*=====================================================================================*/

// Pour définir dans eclipse les arguments: Run as sur la classe > Run configurations
// onglets Arguments (framboise fraise pomme poire prune raisin)

package esgi.cours;

public class MainWithArgs {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<args.length; i++) {
			sb.append(args[i]);
			if(i != args.length -1) {
				sb.append(",");
			}
		}
		
		System.out.println(sb.toString());

	}

}

// Sortie : framboise,fraise,pomme,poire,prune,raisin
