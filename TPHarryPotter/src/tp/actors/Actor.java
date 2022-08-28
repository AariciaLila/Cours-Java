/*=====================================================================================*/
/* 										Les acteurs									   */
/*=====================================================================================*/

// Un acteur est caract�ris� par son nom (pr�nom + nom de famille), par sa date de
// naissance et par son r�le

package tp.actors;

import java.time.LocalDate;

//D�finition de la classe
public class Actor {
	
	// Partie Attributs
	String name;
	LocalDate birthDate;
	String role;
	
	// Partie Constructeur
	public Actor(String name, LocalDate birthDate, String role) {
		super();
		this.name = name;
		this.birthDate = birthDate;
		this.role = role;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	
	

}
