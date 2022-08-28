/*=====================================================================================*/
/* 										Les romans									   */
/*=====================================================================================*/

// Un livre est caractérisé par un n° de tome, un titre et ue description

package tp.books;

//Définition de la classe
public class Book {

	// Partie Attributs
	private int tomeNumber;
	private String title;
	private String description;
	
	// Partie Constructeur
	public Book(int numberTome, String titre, String description) {
		super();
		this.tomeNumber = numberTome;
		this.title = titre;
		this.description = description;
	}
	
	
	public int getTomeNumber() {
		return tomeNumber;
	}
	
	public void setTomeNumber(int tomeNumber) {
		this.tomeNumber = tomeNumber;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
}
