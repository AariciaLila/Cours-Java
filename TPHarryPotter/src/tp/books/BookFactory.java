/*=====================================================================================*/
/* 										Les romans									   */
/*=====================================================================================*/

// Dans une classe BookFactory, on impl�mente la liste de tous les livres Harry Potter

package tp.books;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//D�finition de la classe
public class BookFactory {
	
	// Partie Instanciation
	private  List<Book> books = Arrays.asList(
			new Book(1, "Harry Potter à l'Ecole des Sorciers", "\"Que cache la trappe du troisi�me �tage ?\""),
			new Book(2, "Harry Potter et la Chambre des Secrets", "Harry r�soudra t'il le myst�re de la chambre des secrets?"),
			new Book(3, "Harry Potter et le Prisonnier d'Azkaban", "Qui est Sirius Black?"),
			new Book(4, "Harry Potter et la coupe de feu", "Qui gagnera le troph� des trois sorciers?"),
			new Book(5, "Harry Potter et l'ordre du Ph�nix", "Harry et ses amis r�ussiront-ils à sauver Sirius Black (Harry en �r�v�)?"),
			new Book(6, "Harry Potter et le prince de sang m�l�", "Qui est le prince de sang-m�l�?"),
			new Book(7, "Harry Potter et les reliques de la mort", "Harry parviendra t'il �retrouver tous les horcruxes et �les d�truires?")
			);
	
	
	public List<Book> getBooks() {
		return books;
	}

	
	public void setBooks(List<Book> books) {
		this.books = books;
	}

	// Partie M�thodes
	
	// 1) M�thode qui permet d'afficher le titre des livres
	public void  printBookTitles() {
		System.out.println("----- Titre des livres -----");
		books.stream()
		.map(e->e.getTitle())
		.forEach(System.out::println);
	}
	
	// 2) M�thode qui permet d'afficher les titres des tomes 1 et 7
	public void  printOnlyTome1AndTome7() {
		System.out.println("----- Titre des tomes -----");
		books.stream()
		.filter(book -> (book.getTomeNumber() ==1 || book.getTomeNumber() ==7 ))
		.map(e->e.getTitle())
		.forEach(System.out::println);	
	}

	// 3) M�thode qui permet d'afficher les titres des livres s�par�s par un |
	// La cha�ne finale ne doit pas comporter de | au d�but et � la fin
	public  String  getTitlesInAString() {
		Book fin = books.get(books.size() - 1);
		String chaine = "";
		System.out.println("----- Titres s�par�s par de |");
		for (Book  book : books) {
			if(fin == book)
				chaine += book.getTitle();
			else {
				chaine += book.getTitle()+"|";
			}
		}	
		return chaine;
	}
	
	// 4) M�thode qui permet de calculer la somme des num�ro de tomes
	public int getTomeNumSum() {
		System.out.println("----- Somme des num�ros de tome -----");
		int numSum = 0;
		for (Book  book : books) {
			numSum = numSum+book.getTomeNumber();
		}	
		return numSum;	
	}
	
	// 5) M�thode qui permet de r�cup�rer les descriptions des livres qui comportent le mot word
	public List<String> getSomeDescriptions(String word){
		System.out.println("----- Descriptions qui comprennet le mot "+word+" -----");
		 List<String> bookDescriptions = books.stream()
	        		.filter(d -> d.getDescription().toLowerCase()
	        		.contains(word.toLowerCase()))
	                .map(Book::getDescription)
	                .collect(Collectors.toList());
		return bookDescriptions;
	}

	// 6) M�thode qui permet de r�cup�rer la taille des titres de livre
	public int[] getTitleSizes() {
		int[] titleSizes = new int[7];
		for (Book  book : books) {
		 int index = book.getTomeNumber()-1;
		 titleSizes[index]= book.getTitle().length();
		}   
		return titleSizes;	
	}
	
	// 7) M�thode qui permet d'afficher le ou les titres dont la taille est la plus grande
	public void printLongestTitles(int[] sizes) {
        int max = Arrays.stream(sizes).max().getAsInt();
		System.out.println("----- Titre(s) le(s) plus long(s) -----");
        for (int i = 0; i != books.size(); i++) {
            if (max == books.get(i).getTitle().length()) {
                System.out.println(books.get(i).getTitle());
            }
        }
    } 

	// 8) M�thode qui permet d'afficher le ou les titres dont la taille est la plus petite
	public void printShortestTitles(int[] sizes) {
        int min = Arrays.stream(sizes).min().getAsInt();
		System.out.println("----- Titre le plus court -----");
        for (int i = 0; i != books.size(); i++) {
            if (min == books.get(i).getTitle().length()) {
                System.out.println(books.get(i).getTitle());
            }
        }
    } 
}
