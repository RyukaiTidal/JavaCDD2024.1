package Arrays;

public class No02 {

	public static void main(String[] args) {
		int[] arrayUm = {12,3,5,68,9,6,73,44,456,65,321};
		int[] arrayDois = {43,42,4,8,55,21,2,45};
		
		System.out.println(arrayUm.length > 8? "Tamanho do Array Um - Maior que 8":
			arrayUm.length <8? "Tamanho do Array Um - Menor que 8!" : "Tamanho do Array Dois - igual a 8!");
		
		System.out.println("\nTamanho do ArrayUm =" +arrayUm.length);
		
		System.out.println(arrayDois.length > 8? "\nTamanho do Array Dois - Maior que 8":
			arrayDois.length <8? "\nTamanho do Array Dois - Menor que 8!" : "\nTamanho do Array Dois - igual a 8!");
		
		System.out.println("\nTamanho do ArrayDois =" +arrayDois.length);
	}

}
