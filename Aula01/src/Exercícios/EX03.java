package Exercícios;

import java.util.Scanner;

public class EX03 {

	public static void main(String[] args) {
		Scanner Dia = new Scanner(System.in);
		System.out.println("Digite um numero para o dia da semana:");
		int Semana = Dia.nextInt();
		
		if(Semana > 7 || Semana < 1) {
			System.out.println("Número Inválido");
		} else {
			if (Semana == 1) {
				System.out.println("Segunda");
			}
			if (Semana == 2) {
				System.out.println("Terça");
			}
			if (Semana == 3) {
				System.out.println("Quarta");
			}
			if (Semana == 4) {
				System.out.println("Quinta");
			}
			if (Semana == 5) {
				System.out.println("Sexta");
			}
			if (Semana == 6) {
				System.out.println("Sábado");
			}
			if (Semana == 7) {
				System.out.println("Domingo");
			}
		}
	}

}
