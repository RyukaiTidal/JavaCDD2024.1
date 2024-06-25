package Exercícios;

import java.util.Scanner;

public class EX01 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número:");
		int resultado = entrada.nextInt();
		if (resultado >= 0) {
			System.out.println("Número é Positivo");
		}else{
			System.out.println("Número é Negativo");
		}
	}
}
