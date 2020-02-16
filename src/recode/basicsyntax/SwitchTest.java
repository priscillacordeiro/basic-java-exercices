package recode.basicsyntax;

public class SwitchTest {

	public static void main(String[] args) {

/*		3.	Criar um arquivo Java com o nome SwitchTest. Inserir neste arquivo um método main que inicializa uma variável inteira 
 * 		com 3 e testa o valor da mesma em uma estrutura switch ... case com valores 1,2,3 e 4, nesta ordem. Em cada teste, deve-se 
 * 		imprimir no console o valor testado. Observar o uso da estrutura e o efeito do programa com a estrutura switch ... case 
 * 		usando o break e sem usar o break.
 */
		
		int number = 3;
		
		switch(number) {
			case 1:
				System.out.println(number);
				break;
			case 2:
				System.out.println(number);
				break;
			case 3:
				System.out.println(number);
				break;
			case 4:
				System.out.println(number);
				break;
		}
		
	}

}