/*====================================================================================*/
/* 										Les acteurs									  */
/*====================================================================================*/

// Teste de toutes les méthodes dans une classe Main

package tp.actors;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		
		ActorFactory actorFactory = new ActorFactory();
		actorFactory.printFirstNameInUppercase();
		actorFactory.printBirthYearOfActors();
		System.out.println(actorFactory.getYoungestActor());
		System.out.print(actorFactory.getOldestActor()+"\n");
		System.out.print(Arrays.toString(actorFactory.getBirthdatesInLongFormat())+"\n");
		actorFactory.printAgeOfActors();
		actorFactory.printFirstNameAndRoleOfActors();
	}
}
