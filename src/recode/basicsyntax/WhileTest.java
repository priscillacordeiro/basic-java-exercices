package recode.basicsyntax;

public class WhileTest {

	public static void main(String[] args) {

/*		2.	Criar um arquivo Java com o nome WhileTest. Inserir neste arquivo um método main e implementar neste a funcionalidade 
 * 		do contador descrito no item 1 DUAS VEZES, usando estruturas while() e do ... while().
 */
		
		int count = 0;
		
		while(count <= 10) {
			System.out.println(count++);
		}
		
		int doCount = 0;
		
		do {
			System.out.println(doCount++);
		} while (doCount <= 10);
		
	}
	
}