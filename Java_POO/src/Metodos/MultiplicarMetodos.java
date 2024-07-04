package Metodos;

import java.util.Scanner;

public class MultiplicarMetodos {
	
	int multi(){
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("1.2 Parâmetros"
				+ "\n2.3 Parâmetros.");
		int escolha = entrada.nextInt();
		if (escolha == 1)
			escolha = multid();
		if (escolha == 2)
			escolha = multit();
		return escolha;
	}
	
	int multid() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o primeiro número");
		int a = entrada.nextInt();
		System.out.println("Digite o segundo número");
		int b = entrada.nextInt();
		return a * b;
	}
	
	int multit () {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o primeiro número");
		int a = entrada.nextInt();
		System.out.println("Digite o segundo número");
		int b = entrada.nextInt();
		System.out.println("Digite o terceiro número");
		int c = entrada.nextInt();
		return a * b * c;
	}
}
