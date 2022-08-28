/*=====================================================================================*/
/* 									TODO 6 :										   */
/* 							Trouver un autre exemple								   */
/*=====================================================================================*/

package esgi.cours;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class TODO6 {
    
    public static void main(String[] args)  {

    	// on créé directement un objet Consumer
        Consumer<String> greeter = name -> System.out.println("Hello " + name);  
        
        Stream<String> names = Stream.of("Tran", "Nguyen", "Pham");
        
        names.forEach(greeter);
    }
}

// Sortie :
// Hello Tran
// Hello Nguyen
// Hello Pham