/*====================================================================================*/
/* 										Les romans									  */
/*====================================================================================*/

// Teste de toutes les méthodes dans une classe Main

package tp.books;

import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) {

		BookFactory bookFactory = new BookFactory();
		bookFactory.printBookTitles();
		bookFactory.printOnlyTome1AndTome7();
		System.out.println(bookFactory.getTitlesInAString());
		System.out.print(bookFactory.getTomeNumSum()+"\n");
		System.out.print(bookFactory.getSomeDescriptions("secrets")+"\n");
		System.out.print(bookFactory.getSomeDescriptions("SECRETS")+"\n");
		System.out.print(bookFactory.getSomeDescriptions("HARRY"));
		System.out.println("\n"+"----- Taille des titres de livres -----");
		System.out.println(Arrays.toString(bookFactory.getTitleSizes()));
		bookFactory.printLongestTitles(bookFactory.getTitleSizes());
		bookFactory.printShortestTitles(bookFactory.getTitleSizes());
	}	
}
