package recode.firstlist;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		
//		5. Escreva um programa que leia dois números inteiros ‘a’ e ‘b’ do teclado, determine e imprima todos os
//		múltiplos de 3 existentes entre ‘a’ e ‘b’. OBS: Lembre-se que nem sempre ‘a’ é maior que ‘b’.
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Type an integer: ");
		int a = reader.nextInt();
		System.out.println("Type an integer: ");
		int b = reader.nextInt();

		int min = Math.min(a, b);
		int max = Math.max(a, b);
		
		for(int number = min; number <= max; number++) {
			if(number % 3 == 0) {
				System.out.println(number);
			}
		}
		
		reader.close();
		
	}

}