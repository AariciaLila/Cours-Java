/*=====================================================================================*/
/* 										Les acteurs									   */
/*=====================================================================================*/

// Dans une classe ActorFactory, on impl�mente la liste des acteurs

package tp.actors;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

//D�finition de la classe
public class ActorFactory {
	
	// Partie Instanciation
	private List<Actor> actors = Arrays.asList(
			new Actor("Daniel Radcliffe", LocalDate.of(1989, 7, 23), "Harry Potter"),
			new Actor("Emma Watson", LocalDate.of(1990, 4, 15), "Hermione Granger"),
			new Actor("Rupert Grint", LocalDate.of(1988, 8, 24), "Ron Weasley"),
			new Actor("Alan Rickman", LocalDate.of(1946, 2, 21),"Severus Rogue"),
			new Actor("Tom Felton", LocalDate.of(1987, 9, 22),"Drago Malefoy"),
			new Actor("Bonnie Wright", LocalDate.of(1991, 2, 17), "Ginnie Weasley"),
			new Actor("Matthew Lewis", LocalDate.of(1989, 6, 27), "Neville Londubat"),
			new Actor("Michael Gambon", LocalDate.of(1940, 10, 19), "Albus Dumbledore")
			);
	
	// Partie M�thodes
	
	// 1) M�thode qui permet d'afficher le pr�nom des acteurs en majuscules
	public void printFirstNameInUppercase() {
		System.out.println("----- Liste des pr�noms en majuscules");
		for(Actor actor : actors) {
			System.out.println(actor.getName().toUpperCase().split(" ")[0]);
		     }	 
	}
	
	// 2) M�thode permettant d'afficher les ann�es de naissance des acteurs
	public void printBirthYearOfActors() {
		System.out.println("----- Ann�es de naissance des acteurs -----");
		actors.stream()
		.map(a->a.getBirthDate().getYear())
		.forEach(System.out::println);
		}
	
	// 3) M�thode pour r�cup�rer le nom de l'acteur le plus jeune
	public String getYoungestActor() {
		String youngestActor = "";
		int year = 1;
		System.out.println("----- Acteur le plus jeune -----");
		for (Actor a : actors) {
			if (a.getBirthDate().getYear() > year) {
				youngestActor = a.getName();
				}
			year = a.getBirthDate().getYear();
		}
		return youngestActor;		
	}
	
	// 4) M�thode pour r�cup�rer le nom de l'acteur le plus vieux
	public String getOldestActor() {
		String oldestActor = "";
		int year = 2022;
		System.out.println("----- Acteur le plus vieux -----");
		for (Actor actor : actors) {
			if (actor.getBirthDate().getYear() < year) {
				oldestActor = actor.getName();
				}
			year = actor.getBirthDate().getYear();
		}
		return oldestActor;		
	}
	
	// 5) M�thode permettant de r�cup�rer la liste des dates de naissance au format <jou><mois en toute lettres><ann�e>
	// ex : 23 juillet 1989
	public String[] getBirthdatesInLongFormat() {
		String [] birthdatesLongFormat= new String[8];
		int index=0;
		System.out.println("----- Dates de naissance au format \"3 juillet 2005\"");
		for (Actor a : actors) {
			birthdatesLongFormat[index]= a.getBirthDate().format(DateTimeFormatter.ofPattern("dd LLLL yyyy"));
			index =index+1;
		}
		return birthdatesLongFormat;
	}
	
	// 6) M�thode qui permet d'afficher l'�ge des acteurs sous la forme "Emma Watson a 31 ans"
	public void printAgeOfActors() {
	int currentYear = LocalDate.now().getYear();
	System.out.println("\n" +"----- Age des acteurs -----");
	for (Actor a : actors) {
		int age = currentYear - a.getBirthDate().getYear();
		System.out.println(a.getName() + " a " + age + " ans");
		}	
	}
	
	// 7) M�thode qui permet d'affocher Le pr�nom des acteurs=Le pr�nom du r�le
	// ex: Emma=Hermione
	public void printFirstNameAndRoleOfActors() {
		System.out.println("----- Pr�nom acteur = Pr�nom role -----");
		for(Actor actor : actors) {
			String realName = actor.getName();
			String roleName = actor.getRole();
	
		    System.out.println(realName.substring(0, realName.indexOf(" ")) + "=" + roleName.substring(0, roleName.indexOf(" ")));			     
		}	
	}
}
