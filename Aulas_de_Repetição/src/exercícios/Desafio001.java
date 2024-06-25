package exercícios;

import java.util.Scanner;

public class Desafio001 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite quantos alunos tem na sala: ");
		int qtdAlunos = entrada.nextInt();
		int i = 1;
		float soma = 0;
		while (i <= qtdAlunos) {
			System.out.printf("Digite a nota do %dº Aluno da Sala:", i);
			soma = soma + entrada.nextFloat();
			i++;
		}
		double calculo = soma / qtdAlunos;
		System.out.printf("A Média aritmética da sala de %d Alunos é de %1.2f", qtdAlunos, calculo);
	}
}
