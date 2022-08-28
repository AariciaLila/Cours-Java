/*=====================================================================================*/
/* 						Une seule entr�e vs pas d'entr�e							   */
/*=====================================================================================*/

// Si le lambda prend un seul param�tre d'entr�e, les () sont inutiles

package esgi.cours;

public interface OneParamLambda {
	int apply(int a);
	
	public static void main(String[] args) {
		OneParamLambda opl = a -> a * a;
		System.out.println(opl.apply(10)); // 100
		
	}

}
