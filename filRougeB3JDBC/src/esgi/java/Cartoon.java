/*===========================================================================================*/
/* 									Partie Java avancé : Basiques							 */
/*===========================================================================================*/

// Implémentation de la classe Cartoon

package esgi.java;

import java.time.LocalDate;
import java.util.List;

public class Cartoon {
	
	// Partie Attributs
	private String originalTitle;
	private String production;
	private List<String> directors;
	private List<String> musicians;
	private int duration;
	private LocalDate releaseDate;
	private String genre;
	private String durationInHours;
	
	// Partie Constructeur
	public Cartoon(String originalTitle, String production, List<String> directors, List<String> musicians, int duration, LocalDate releaseDate, String genre, String durationInHours) {
		super();
		this.originalTitle = originalTitle;
		this.production = production;
		this.directors = directors;
		this.musicians = musicians;
		this.duration = duration;
		this.releaseDate = releaseDate;
		this.genre = genre;
		// l'attribut durationInHours contient la durée d'un film sous la forme :
		// "1 heures et 15 minutes"
		this.durationInHours = durationInHours;
	}
	// Ce constructeur prend en paramètre le titre du cartoon uniquement et soulève une
	// TooLongTitleException si la taille du titre est strictement supérieur à 35 caractères
	public Cartoon(String originalTitle) {
		super();
		this.originalTitle = originalTitle;
	}
	
	public String getOriginalTitle() {
		return originalTitle;
	}
	
	public void setOriginalTitle(String originalTitle) {
		this.originalTitle = originalTitle;
	}
	
	public String getProduction() {
		return production;
	}
	
	public void setProduction(String production) {
		this.production = production;
	}
	
	public List<String> getDirectors() {
		return directors;
	}
	
	public void setDirectors(List<String> directors) {
		this.directors = directors;
	}
	
	public List<String> getMusicians() {
		return musicians;
	}
	
	public void setMusicians(List<String> musicians) {
		this.musicians = musicians;
	}
	
	public int getDuration() {
		return duration;
	}
	
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	public LocalDate getReleaseDate() {
		return releaseDate;
	}
	
	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}
	
	public String getGenre() {
		return genre;
	}
	
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public String getDurationInHours() {
		return durationInHours;
	}
	
	public void setDurationInHours(String durationInHours) {
		this.durationInHours = durationInHours;
	}
	
	@Override
	public String toString() {
		return "[originalTitle=" +originalTitle+ ", production=" +production+ ", directors="  +directors+ ", musicians=" +musicians+ ", duration=" +duration+ ", releaseDate=" +releaseDate+ ", genre=" +genre+ "]";
	}
	
public void play() throws TooLongTitleException{

		if(this.originalTitle.length() > 35) {
			throw new TooLongTitleException("Titre trop long!" + "\"" + originalTitle + "\"");
		}
	}
	

}
