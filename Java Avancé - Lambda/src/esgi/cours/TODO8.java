/*=====================================================================================*/
/* 									TODO 8 :										   */
/* 							Trouver un autre exemple								   */
/*=====================================================================================*/

package esgi.cours;

import java.util.function.Predicate;

public class TODO8 {

    public static void main(String[] args) {
        
        Predicate<Integer> tester = value -> value % 2 == 1;
        
        int value = 11;
        
        System.out.println(value + " Is an Odd Number? " + tester.test(value));
    }
}

// Sortie :
// 11 Is an Odd Number? true
