package recode.firstlist;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {

		/*
		 * 3. Escreva um programa que calcula a m�dia do aluno na disciplina e informa se ele passou por m�dia, se
		 * 	ele est� reprovado ou se far� prova final. No caso em que o aluno passou ou foi reprovado por m�dia
		 *	deve-se imprimir na tela uma mensagem indicando a sua situa��o bem como a sua m�dia atingida. Para o
		 *	�ltimo caso, al�m de imprimir a m�dia do aluno o programa tamb�m deve indicar quanto ele ir� precisar
		 *	na prova final. Considera��es:
		 *	a. O aluno ir� fazer duas avalia��es;
		 *	b. A m�dia para ser aprovado � 7.0;
		 *  c. Se o aluno obtiver m�dia inferior a 4.0 estar� reprovado;
		 *  d. Para passar na final o aluno precisa tirar uma nota igual � diferen�a da sua m�dia obtida para a
		 *	nota m�xima (10.0).
		 */
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Type your first grade: ");
		double grade1 = reader.nextDouble();
		System.out.println("Type your second grade: ");
		double grade2 = reader.nextDouble();
		
		double average = (grade1 + grade2) / 2;
		
		if(average >= 7) {
			System.out.println("You were approved by average! Your average is " + average);
		} else if(average >= 4 && average < 7) {
			double averageFinalExam = 10 - average;
			System.out.println("You were not approved by average. Your average is " + average 
					+ ". You need " + averageFinalExam + " points to pass the final exam.");
		} else {
			System.out.println("You were reproved! Your average is " + average);
		}
		
		reader.close();
		
	} 

}