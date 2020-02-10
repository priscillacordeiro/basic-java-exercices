package recode.firstlist;

import java.util.Scanner;

public class Question1Version2 {

	public static void main(String[] args) {

		// 1. Escreva um programa que determina e imprime se um número inteiro lido do teclado é par ou ímpar.
		// OBS: Implementar duas versões do programa uma usando if-else e outra usando o operador ?:.	
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Type an integer: ");
		int number = reader.nextInt();
		
		String message = (number % 2 == 0) ? "The number " + number + " is even!" : "The number " + number + " is odd!";
		System.out.println(message);
				
		reader.close();
	}

}
