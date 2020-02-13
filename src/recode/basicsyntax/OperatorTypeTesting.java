package recode.basicsyntax;

public class OperatorTypeTesting {

	public static void main(String[] args) {

/*
 * 		1.	Para cada premissa listada abaixo, marcar 
 *		N se ela n�o puder ser compilada, e
 *		C se ela for compilada e n�o produzir o resultado esperado 
 *		OK se ela for compilada e produzir o resultado esperado. 
 *		Reflita sobre as justificativas para cada resposta.
 *		
 *		a.	int a = 2; long b = a; 
 *		OK, "int" tem 32 bits, � menor que "long" com 64 bits. "a" cabe em "b".
 *		b.	long c = 4; int d = c; 
 *		N, "long" � maior que "int", por esse motivo, n�o cabe dentro dele.
 *		c.	boolean bol = false; int g = bol; 
 *		N, s�o tipos diferentes.
 *		d.	int a = 10L; 
 *		N, 10L � um "long" e n�o cabe em "int".
 *		e.	int a = (int)(10L); 
 *		OK, fazendo a convers�o usando "casting", o "long" cabe em "int".
 *		f.	int a = 10; char c = a; 
 *		N, "int" tem tamanho maior que "char" (16 bits), por esse motivo, n�o cabe dentro dele.
 *		g.	double d = 29.0f; 
 *		OK, "float" (32 bits) cabe em "double" (64 bits) pois � menor que ele.
 *		h.	float f = 21.2; 
 *		N, o problema teria sido resolvido com "f" ap�s o valor acima.
 *		i.	double d = 2.0; int a = (int)d; 
 *		OK, mas "casting" vai pegar apenas a parte inteira de "double".
 *		j.	int h = 20000; byte b = (byte)h; 
 *		C, mas n�o ter� o resultado esperado, pois o valor d� "overflow" por conta do "casting".
 */		
		
/*
 * 		2.	Descrever a sa�da padr�o produzida no console para as seguintes por��es de c�digo fonte listadas abaixo. 
 *		Refletir sobre as justificativas para cada resposta.
 *		
 *		a.	int a = 2; int b = a++; System.out.println(b);
 *		2. O valor s� ser� incrementado na pr�xima linha.
 *		b.	int c = 2; int d = (++c); System.out.println(d);
 *		3. O valor foi incrementado na mesma linha.
 *		c.	int e = 0; boolean bol = (2<0) && (++e<3); System.out.println(e);
 *		"(2 < 0)" � "false" e n�o chega a rodar "&& (++e < 3)", por isso o "e" n�o � incrementado e imprime "0".
 *		d.	int f = 1; boolean bol = (2<1) & (f++>4); System.out.println(f);
 *		Apesar de "(2 < 1)" ser "false", o operador "&"  faz com que a condi��o "(f++ > 4)" seja avaliada tamb�m. Portanto "f" � incrementado e imprime "2" no final.
 *		e.	int g = 3; int h= (g++== 4) ? 2:1; System.out.println(h);
 *		Na linha "int h = (g++ == 4)" o "g" ainda � "3" ent�o "3 == 4" � igual a "false". "false" no tern�rio de "int h" � "1".
 */
		
/*		
 * 		3.	Declare vari�veis que sejam capazes de armazenas as seguintes informa��es
 *
 *		a.	Sua Idade 
 *		int age = 28;
 *		b.	A M�dia entre 2 numeros 
 *		double number1 = 20; double number2 = 40; double media = (number1 + number2) / 2;
 *		c.	O seu Sal�rio 
 *		double salary = 1000;
 *		d.	Seu nome, numero, nota do primeiro bimestre, nota do segundo bimestre e media final 
 *		String name = "Priscilla"; 
 *		long number = 12345; 
 *		double firstTwoMonthNote = 9.70; 
 *		double secondTwoMonthNote = 8.40; 
 *		double finalMedia = (firstTwoMonthNote + secondTwoMonthNote) / 2; 
 *		e.	Os 12 meses dos ano (S� o numro do m�s) com os sues respeqtivoas n�meros de dias
 *		int month1 = 31; 
 *		int month2 = 29; 
 *		int month3 = 31; 
 *		int month4 = 30; 
 *		int month5 = 31; 
 *		int month6 = 30;
 *		int month7 = 31; 
 *		int month8 = 31; 
 *		int month9 = 30; 
 *		int month10 = 31; 
 *		int month11 = 30; 
 *		int month12 = 31;
 *		
 *		ou 
 *		int[] months = {31, 29, 31, 30, 31, 30, 33, 31, 30, 31, 30, 31};
 */		
		
	}

}
