package Metodos;

import java.util.Scanner;

public class SubtrairMetodos {
	
	int sub(){
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("1.2 Parâmetros"
				+ "\n2.3 Parâmetros.");
		int escolha = entrada.nextInt();
		if (escolha == 1)
			escolha = subd();
		if (escolha == 2)
			escolha = subt();
		return escolha;
		
	}
	
	int subd() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o primeiro número");
		int a = entrada.nextInt();
		System.out.println("Digite o segundo número");
		int b = entrada.nextInt();
		return a - b;
	}
	
	int subt () {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o primeiro número");
		int a = entrada.nextInt();
		System.out.println("Digite o segundo número");
		int b = entrada.nextInt();
		System.out.println("Digite o terceiro número");
		int c = entrada.nextInt();
		return a - b - c;
	}
}
