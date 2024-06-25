package Exercícios;

import java.util.Scanner;

public class EX04 {
	public static void main(String[] args) {
		Scanner nota = new Scanner(System.in);
		System.out.println("Digite a 1ª Nota:");
		double nota1 = nota.nextDouble();		
		System.out.println("Digite a 2ª Nota:");
		double nota2 = nota.nextDouble();
		double soma = (nota1+nota2);
		double resultado = (soma/2);
		System.out.printf("O resultado de %f e %f, é de %f", nota1, nota2, resultado);
		
	}
}
