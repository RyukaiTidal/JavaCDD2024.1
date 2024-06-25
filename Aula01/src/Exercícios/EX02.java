package Exercícios;

import java.util.Scanner;

public class EX02 {
	public static void main(String[] args) {
		Scanner numero = new Scanner(System.in);
		System.out.println("Digite o 1º Número:");
		int num1 = numero.nextInt();
		System.out.println("Digite o 2º Número:");
		int num2 = numero.nextInt();
		System.out.println("Digite o 3º Número:");
		int num3 = numero.nextInt();
		
		if(num1 >= num2) {
			if(num1 >= num3) {
				System.out.println(num1);
			} else {
				System.out.println(num3);
			}
		} else {
			if (num2 >= num3) {
				System.out.println(num2);
			} else {
				System.out.println(num3);
			}
		}
	}
}
