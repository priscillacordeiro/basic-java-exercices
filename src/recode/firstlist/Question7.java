package recode.firstlist;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {

//		7. Escreva um programa que leia dois n�meros inteiros x e y (maiores ou iguais a zero), calcule e
//		imprima o valor de x elevado a y. OBS: N�o utilizar o m�todo Math.pow(x, y) para calcular a pot�ncia.
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Type an integer: ");
		int x = reader.nextInt();
		System.out.println("Type an integer: ");
		int y = reader.nextInt();
		
		int result = 1;
		
		for(int count = 0; count < y; count++) {
			result *= x;
		}
		
		System.out.println(result);
		
		reader.close();
		
	}

}