package Metodos;

import java.util.Scanner;

public class Calculadora {
	
	public static void main(String[] args) {
		MenuCalculadora menu = new MenuCalculadora();
		
		System.out.println(menu.ASCII());
		Scanner entrada = new Scanner(System.in);
		System.out.println(menu.Opcoes());
		int Menu = entrada.nextInt();
		System.out.println(menu.Operacao(Menu)); 
	}
}
