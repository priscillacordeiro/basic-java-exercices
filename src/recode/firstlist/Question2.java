package recode.firstlist;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		
		/*
		 * Escreva um programa que receba 5 números inteiros do teclado, determine e imprima na tela o maior e
		 * o menor dentre os números lidos bem como a sua diferença.
		 */

		Scanner reader = new Scanner(System.in);
		
		System.out.println("Type 5 integers to find their maximum, minimum and the difference between them!");
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
				
		for(int count = 0; count < 5; count++) {
			System.out.println("Type a number: ");
			int number = reader.nextInt();
			
			if(number < min) {
				min = number;
			} 
			
			if (number > max) {
				max = number;
			}
		}
		
		int difference = max - min;
		
		System.out.println("The maximum value is: " + max);
		System.out.println("The minimum value is: " + min);
		System.out.println("The difference between them is: " + difference);
		
		reader.close();
		
	}
	
}