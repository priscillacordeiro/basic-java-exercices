package recode.firstlist;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		
//		6. Escreva um programa que calcula o fatorial de um número inteiro (maior ou igual a zero) lido do
//		teclado.
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Type an integer: ");
		int number = reader.nextInt();
		
		int factorial = 1;
		
		for(int count = 1; count <= number; count++) {
			factorial *= count;
		}
		
		System.out.println(factorial);
		
		reader.close();
		
	}

}