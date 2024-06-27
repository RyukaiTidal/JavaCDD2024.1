package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class No03 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int arrayUm[] = new int[10];
		for (int i=0; i<arrayUm.length;i++) {
			System.out.printf("Insira o %d Número da ArrayUm:",i+1);
			arrayUm[i] = entrada.nextInt();
		}
		int arrayDois[] = new int[10];
		for (int i=0; i<arrayDois.length;i++) {
			System.out.printf("Insira o %d Número da ArrayDois:",i+1);
			arrayDois[i] = entrada.nextInt();
		}
		int arrayTres[] = new int[10];
		for (int i=0; i<arrayTres.length;i++) {
			System.out.printf("Insira o %d Número da ArrayTres:",i+1);
			arrayTres[i] = entrada.nextInt();
		}
		int arrayQuatro[] = new int[10];
		for (int i=0; i<arrayQuatro.length;i++) {
			System.out.printf("Insira o %d Número da ArrayQuatro:",i+1);
			arrayQuatro[i] = entrada.nextInt();
		}
		
		for(int o = 0; o< arrayUm.length; o++)
			System.out.print(arrayUm[o] + " ");
		System.out.println();
		for(int o = 0; o< arrayDois.length; o++)
			System.out.print(arrayDois[o] + " ");
		System.out.println();
		for(int o = 0; o< arrayTres.length; o++)
			System.out.print(arrayTres[o] + " ");
		System.out.println();
		for(int o = 0; o< arrayQuatro.length; o++)
			System.out.print(arrayQuatro[o] + " ");
	}
	
}
