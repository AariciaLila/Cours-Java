/*=====================================================================================*/
/* 						Une seule entrée vs pas d'entrée							   */
/*=====================================================================================*/

// Si le lambda prend un seul paramètre d'entrée, les () sont inutiles

package esgi.cours;

public interface OneParamLambda {
	int apply(int a);
	
	public static void main(String[] args) {
		OneParamLambda opl = a -> a * a;
		System.out.println(opl.apply(10)); // 100
		
	}

}
