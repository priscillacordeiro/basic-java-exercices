package recode.basicsyntax;

public class Factorial {

	public static void main(String[] args) {

/*		4.	Criar um arquivo Java com o nome Fatorial. Inserir neste arquivo um m�todo main que inicializa uma vari�vel x com um 
 * 		valor qualquer inteiro maior ou igual a zero, calcula o fatorial desta vari�vel x e imprime o valor deste fatorial no console.
 */
		
		int x = 5;
		
		int result = 1;
		
		for(int count = x; count > 0; count--) {
			result *= count;
		}
		System.out.println(result);
		
	}

}
