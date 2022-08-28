/*=====================================================================================*/
/* 										Les films									   */
/*=====================================================================================*/

// Un film est caract�ris� par un titre, une ann�e de sortie, un r�alisateur et une description

package tp.movies;

//D�finition de la classe
public class Movie {
	
	// Partie Attributs
	private String title;
	private int date;
	private String director;
	private String description;
	
	// Partie Constructeur
	public Movie(String title, int date, String director, String description) {
		super();
		this.title = title;
		this.date = date;
		this.director = director;
		this.description = description;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
