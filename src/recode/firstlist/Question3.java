package recode.firstlist;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {

		/*
		 * 3. Escreva um programa que calcula a média do aluno na disciplina e informa se ele passou por média, se
		 * 	ele está reprovado ou se fará prova final. No caso em que o aluno passou ou foi reprovado por média
		 *	deve-se imprimir na tela uma mensagem indicando a sua situação bem como a sua média atingida. Para o
		 *	último caso, além de imprimir a média do aluno o programa também deve indicar quanto ele irá precisar
		 *	na prova final. Considerações:
		 *	a. O aluno irá fazer duas avaliações;
		 *	b. A média para ser aprovado é 7.0;
		 *  c. Se o aluno obtiver média inferior a 4.0 estará reprovado;
		 *  d. Para passar na final o aluno precisa tirar uma nota igual à diferença da sua média obtida para a
		 *	nota máxima (10.0).
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