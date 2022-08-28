/*=====================================================================================*/
/* 									Lambda et récursivité							   */
/*=====================================================================================*/

// Factorielle d'un nombre n (n!)

package esgi.cours;

public interface FunctionIntInt {
	int apply(int x);
	
	public static void main(String[] args) {

		FunctionIntInt fact = (x) -> {
			FunctionIntInt [] f = {null};
			f[0] = n -> n ==0? 1: n* f[0].apply(n-1);
			return f[0].apply(x);
		};
		
		System.out.println(fact.apply(5));
		
	}

}

// Sortie :
// 120