package aulas;

import java.util.Scanner;

public class EX002 {

	public static void main(String[] args) {
		String[] perguntas = {"Você telefonou para a vítima?","Você esteve no local do crime?",
				"Mora perto da vítima?","Devia algo pra vítima?","Já trabalhou com a vítima?"};
		Scanner entrada = new Scanner(System.in);
		int modCulpa = 0;
		for(int i = 0; i < perguntas.length; i++) {
			
			System.out.println(perguntas[i] + "(S|N:)");
			char Resp = entrada.next().charAt(0);
			while (Resp != 'S' && Resp != 's' && Resp != 'N' && Resp != 'n') {
				
				System.out.println("Desculpe, não entendi. Responda com S pra sim, ou N pra não.");
				Resp = entrada.next().charAt(0);
			}
			
			if (Resp == 'S' || Resp == 's') {
			modCulpa++;
			}
		}
		System.out.println(modCulpa == 5? "Sinto muito, mas você é culpado. Você está preso dentro da lei.":
			modCulpa < 5 && modCulpa > 2? "Sinto muito, mas você é cúmplice. Você está preso dentro da lei.":
				modCulpa == 2? "Hm...ainda tenho minhas dúvidas. Irei investigar a fundo.":
					"Liberado, Você tem Relação Mínima no caso.");
	}
}
