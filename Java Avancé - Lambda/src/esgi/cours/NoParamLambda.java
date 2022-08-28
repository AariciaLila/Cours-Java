/*=====================================================================================*/
/* 						Une seule entrée vs pas d'entrée							   */
/*=====================================================================================*/

// Si le lambda prend aucun paramètre d'entrée, on met les () vides

package esgi.cours;

import java.io.IOException;
import java.util.Scanner;

public interface NoParamLambda {
	void process() throws IOException;
	
	public static void main(String[] args) {
	NoParamLambda npl = () -> {
		System.out.print("n = ");
		int n = 0;
		try (Scanner s = new Scanner(System.in)){
			n = s.nextInt();
		}
		System.out.println(n*n);
	};
	
	try {
		npl.process();
	} catch (IOException e) {
		e.printStackTrace();
	}
		
	}

}

// Sortie :
// n = (2)
// 4
