/*=====================================================================================*/
/* 									Exercice 3										   */
/*=====================================================================================*/

// Implémenter une expression lambda qui concatène deux listes d'entiers

package esgi.exercices;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public interface Exercice3 {
	List<String> add(List<Integer> list1, List<Integer> list2);
	
	public static void main(String[] args) {
		List<String> list3 = new ArrayList<String>(list1);
		Exercice3 ex = (list1,list2) -> ListUtils.union(list1, list2);

		int[] tab1 = {1, 2, 3, 4};
		int[] tab2 = {2, 4};
		System.out.println(ex.count(tab1, tab2));

}
}

// Sortie :
// 6