package recode.basicsyntax;

public class OperatorTypeTesting {

	public static void main(String[] args) {

/*
 * 		1.	Para cada premissa listada abaixo, marcar 
 *		N se ela não puder ser compilada, e
 *		C se ela for compilada e não produzir o resultado esperado 
 *		OK se ela for compilada e produzir o resultado esperado. 
 *		Reflita sobre as justificativas para cada resposta.
 *		
 *		a.	int a = 2; long b = a; 
 *		OK, "int" tem 32 bits, é menor que "long" com 64 bits. "a" cabe em "b".
 *		b.	long c = 4; int d = c; 
 *		N, "long" é maior que "int", por esse motivo, não cabe dentro dele.
 *		c.	boolean bol = false; int g = bol; 
 *		N, são tipos diferentes.
 *		d.	int a = 10L; 
 *		N, 10L é um "long" e não cabe em "int".
 *		e.	int a = (int)(10L); 
 *		OK, fazendo a conversão usando "casting", o "long" cabe em "int".
 *		f.	int a = 10; char c = a; 
 *		N, "int" tem tamanho maior que "char" (16 bits), por esse motivo, não cabe dentro dele.
 *		g.	double d = 29.0f; 
 *		OK, "float" (32 bits) cabe em "double" (64 bits) pois é menor que ele.
 *		h.	float f = 21.2; 
 *		N, o problema teria sido resolvido com "f" após o valor acima.
 *		i.	double d = 2.0; int a = (int)d; 
 *		OK, mas "casting" vai pegar apenas a parte inteira de "double".
 *		j.	int h = 20000; byte b = (byte)h; 
 *		C, mas não terá o resultado esperado, pois o valor dá "overflow" por conta do "casting".
 */		
		
/*
 * 		2.	Descrever a saída padrão produzida no console para as seguintes porções de código fonte listadas abaixo. 
 *		Refletir sobre as justificativas para cada resposta.
 *		
 *		a.	int a = 2; int b = a++; System.out.println(b);
 *		2. O valor só será incrementado na próxima linha.
 *		b.	int c = 2; int d = (++c); System.out.println(d);
 *		3. O valor foi incrementado na mesma linha.
 *		c.	int e = 0; boolean bol = (2<0) && (++e<3); System.out.println(e);
 *		"(2 < 0)" é "false" e não chega a rodar "&& (++e < 3)", por isso o "e" não é incrementado e imprime "0".
 *		d.	int f = 1; boolean bol = (2<1) & (f++>4); System.out.println(f);
 *		Apesar de "(2 < 1)" ser "false", o operador "&"  faz com que a condição "(f++ > 4)" seja avaliada também. Portanto "f" é incrementado e imprime "2" no final.
 *		e.	int g = 3; int h= (g++== 4) ? 2:1; System.out.println(h);
 *		Na linha "int h = (g++ == 4)" o "g" ainda é "3" então "3 == 4" é igual a "false". "false" no ternário de "int h" é "1".
 */
		
/*		
 * 		3.	Declare variáveis que sejam capazes de armazenas as seguintes informações
 *
 *		a.	Sua Idade 
 *		int age = 28;
 *		b.	A Média entre 2 numeros 
 *		double number1 = 20; double number2 = 40; double media = (number1 + number2) / 2;
 *		c.	O seu Salário 
 *		double salary = 1000;
 *		d.	Seu nome, numero, nota do primeiro bimestre, nota do segundo bimestre e media final 
 *		String name = "Priscilla"; 
 *		long number = 12345; 
 *		double firstTwoMonthNote = 9.70; 
 *		double secondTwoMonthNote = 8.40; 
 *		double finalMedia = (firstTwoMonthNote + secondTwoMonthNote) / 2; 
 *		e.	Os 12 meses dos ano (Só o numro do mês) com os sues respeqtivoas números de dias
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
