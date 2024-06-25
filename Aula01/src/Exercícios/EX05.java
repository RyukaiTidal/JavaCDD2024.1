package Exercícios;

import java.util.Scanner;

public class EX05 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Você é Masculino ou feminino? F/M:");
		
		char genero = entrada.next().charAt(0);

		System.out.println(genero == 'm' || genero == 'M'? "Afirmativo, Metrosexual de Plástico."
			:genero == 'f' || genero == 'F'? "Afirmativo, Metrosexual de Plástico Rosa.":"Código Incorreto");
	}
}

//		if (genero == 'M' || genero == 'm') {
//
//System.out.println("Afirmativo, Metrosexual de Plástico.");
//
//}else {
//
//if (genero == 'f' || genero == 'F') {
//
//	System.out.println("Afirmativo, Metrosexual de Plástico Rosa.");
//
//} else {
//
//	System.out.println("Dígito Incorreto.");
//
//}
//}