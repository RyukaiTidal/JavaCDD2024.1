package Metodos;

import java.util.Scanner;

public class SomarMetodos {
	
	int soma() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("1.2 Parâmetros"
				+ "\n2.3 Parâmetros.");
		int escolha = entrada.nextInt();
		if (escolha == 1)
			escolha = somard();
		if (escolha == 2)
			escolha = somart();
		return escolha;
	}

	int somard () {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o primeiro número");
		int a = entrada.nextInt();
		System.out.println("Digite o segundo número");
		int b = entrada.nextInt();
		return a + b;
	}
	int somart () {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o primeiro número");
		int a = entrada.nextInt();
		System.out.println("Digite o segundo número");
		int b = entrada.nextInt();
		System.out.println("Digite o terceiro número");
		int c = entrada.nextInt();
		return a + b + c;
	}
	
}
