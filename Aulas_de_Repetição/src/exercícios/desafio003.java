package exercícios;

import java.util.Scanner;

public class desafio003 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escolha um número inteiro:");
		int numero = entrada.nextInt();
		int contador = 1;
		System.out.println("Números Pares:");
		while (contador <= numero ) {
			System.out.print(contador % 2 == 0? contador + " " : "");
			contador++;
		}
		System.out.println();
		contador = 1;
		System.out.println("Números Ímpares:");
		while (contador <= numero ) {
			System.out.print(contador % 2 != 0? contador + " " : "");
			contador++;
		}
	}
}
