package recode.firstlist;

public class Question4 {

	public static void main(String[] args) {
		
//		4. Escreva um programa que apresente na tela a tabela de convers�o de Real para D�lar, de R$1 a R$100.
//		OBS: Considere a seguinte propor��o R$2,30 = US$ 1,00.
		
		double dolarToReal = 2.30;
		
		for(double real = 1.0; real <= 100; real++) {
			System.out.println("R$ " + real + " -> US$ " + (real / dolarToReal));
		}
		
	}

}