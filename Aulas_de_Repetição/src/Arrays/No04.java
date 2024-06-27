package Arrays;

import java.util.Scanner;

public class No04 {

	public static void main(String[] args) {
		double arrayNotas[] = new double[5];
		Scanner entrada = new Scanner(System.in);
		double soma = 0;
		for(int i = 0; i< arrayNotas.length; i++) {
			System.out.printf("Insira a %d ª Nota:",i+1);
			arrayNotas[i] = entrada.nextDouble();
			soma += arrayNotas[i];
		}
		double resultado = soma / arrayNotas.length+1;
		System.out.printf("O resultado da média das notas de 5 alunos é %.1f",resultado);

	}

}
