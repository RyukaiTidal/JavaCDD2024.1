package Metodos;

import java.util.Scanner;

public class DividirMetodos {
	
	int div(){
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("1.2 Parâmetros"
				+ "\n2.3 Parâmetros.");
		int escolha = entrada.nextInt();
		if (escolha == 1)
			escolha = divd();
		if (escolha == 2)
			escolha = divt();
		return escolha;
	}

	
	int divd() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o primeiro número");
		int a = entrada.nextInt();
		System.out.println("Digite o segundo número");
		int b = entrada.nextInt();
		return a / b;
	}
	int divt () {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o primeiro número");
		int a = entrada.nextInt();
		System.out.println("Digite o segundo número");
		int b = entrada.nextInt();
		System.out.println("Digite o terceiro número");
		int c = entrada.nextInt();
		return a / b / c;
	}
}
