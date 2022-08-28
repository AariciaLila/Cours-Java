/*=====================================================================================*/
/* 									TODO 7 :										   */
/* 							Trouver un autre exemple								   */
/*=====================================================================================*/

package esgi.cours;

import java.util.function.Function;

public class TODO7 {

    public static void main(String[] args) {
        
        Function<String, Integer> func = (text) -> text.length();
        
        int length = func.apply("Function interface tutorial");
        
        System.out.println("Length: " + length);
    }
}

// Sortie :
// Length: 27