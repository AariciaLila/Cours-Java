/*=====================================================================================*/
/* 										Les romans									   */
/*=====================================================================================*/

// Dans une classe BookFactory, on implémente la liste de tous les livres Harry Potter

package tp.books;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Définition de la classe
public class BookFactory {
	
	// Partie Instanciation
	private  List<Book> books = Arrays.asList(
			new Book(1, "Harry Potter Ã  l'Ecole des Sorciers", "\"Que cache la trappe du troisième étage ?\""),
			new Book(2, "Harry Potter et la Chambre des Secrets", "Harry résoudra t'il le mystère de la chambre des secrets?"),
			new Book(3, "Harry Potter et le Prisonnier d'Azkaban", "Qui est Sirius Black?"),
			new Book(4, "Harry Potter et la coupe de feu", "Qui gagnera le trophé des trois sorciers?"),
			new Book(5, "Harry Potter et l'ordre du Phénix", "Harry et ses amis réussiront-ils Ã  sauver Sirius Black (Harry en à rêvé)?"),
			new Book(6, "Harry Potter et le prince de sang mêlé", "Qui est le prince de sang-mêlé?"),
			new Book(7, "Harry Potter et les reliques de la mort", "Harry parviendra t'il à retrouver tous les horcruxes et à les détruires?")
			);
	
	
	public List<Book> getBooks() {
		return books;
	}

	
	public void setBooks(List<Book> books) {
		this.books = books;
	}

	// Partie Méthodes
	
	// 1) Méthode qui permet d'afficher le titre des livres
	public void  printBookTitles() {
		System.out.println("----- Titre des livres -----");
		books.stream()
		.map(e->e.getTitle())
		.forEach(System.out::println);
	}
	
	// 2) Méthode qui permet d'afficher les titres des tomes 1 et 7
	public void  printOnlyTome1AndTome7() {
		System.out.println("----- Titre des tomes -----");
		books.stream()
		.filter(book -> (book.getTomeNumber() ==1 || book.getTomeNumber() ==7 ))
		.map(e->e.getTitle())
		.forEach(System.out::println);	
	}

	// 3) Méthode qui permet d'afficher les titres des livres séparés par un |
	// La chaîne finale ne doit pas comporter de | au début et à la fin
	public  String  getTitlesInAString() {
		Book fin = books.get(books.size() - 1);
		String chaine = "";
		System.out.println("----- Titres séparés par de |");
		for (Book  book : books) {
			if(fin == book)
				chaine += book.getTitle();
			else {
				chaine += book.getTitle()+"|";
			}
		}	
		return chaine;
	}
	
	// 4) Méthode qui permet de calculer la somme des numéro de tomes
	public int getTomeNumSum() {
		System.out.println("----- Somme des numéros de tome -----");
		int numSum = 0;
		for (Book  book : books) {
			numSum = numSum+book.getTomeNumber();
		}	
		return numSum;	
	}
	
	// 5) Méthode qui permet de récupérer les descriptions des livres qui comportent le mot word
	public List<String> getSomeDescriptions(String word){
		System.out.println("----- Descriptions qui comprennet le mot "+word+" -----");
		 List<String> bookDescriptions = books.stream()
	        		.filter(d -> d.getDescription().toLowerCase()
	        		.contains(word.toLowerCase()))
	                .map(Book::getDescription)
	                .collect(Collectors.toList());
		return bookDescriptions;
	}

	// 6) Méthode qui permet de récupérer la taille des titres de livre
	public int[] getTitleSizes() {
		int[] titleSizes = new int[7];
		for (Book  book : books) {
		 int index = book.getTomeNumber()-1;
		 titleSizes[index]= book.getTitle().length();
		}   
		return titleSizes;	
	}
	
	// 7) Méthode qui permet d'afficher le ou les titres dont la taille est la plus grande
	public void printLongestTitles(int[] sizes) {
        int max = Arrays.stream(sizes).max().getAsInt();
		System.out.println("----- Titre(s) le(s) plus long(s) -----");
        for (int i = 0; i != books.size(); i++) {
            if (max == books.get(i).getTitle().length()) {
                System.out.println(books.get(i).getTitle());
            }
        }
    } 

	// 8) Méthode qui permet d'afficher le ou les titres dont la taille est la plus petite
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
