package recode.firstlist;

import java.util.Scanner;

public class Question1Version1 {

	public static void main(String[] args) {

		// 1. Escreva um programa que determina e imprime se um n�mero inteiro lido do teclado � par ou �mpar.
		// OBS: Implementar duas vers�es do programa uma usando if-else e outra usando o operador ?:.	
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Type an integer: ");
		int number = reader.nextInt();
		
		if(number % 2 == 0) {
			System.out.println("The number " + number + " is even!");
		} else {
			System.out.println("The number " + number + " is odd!");
		}
		
		reader.close();
	}

}
