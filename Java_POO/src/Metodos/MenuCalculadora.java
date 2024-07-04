package Metodos;

import java.util.Scanner;

public class MenuCalculadora {
	
	private static final int Null = 0;
	SomarMetodos soma = new SomarMetodos();
	MultiplicarMetodos multi = new MultiplicarMetodos();
	DividirMetodos div = new DividirMetodos();
	SubtrairMetodos sub = new SubtrairMetodos();
	
	String ASCII(){
		return      "┍━━━━━━━━━━━━━━━━━━━━━━━┑"
				+ "\n│ C A L C U L A D O R A │" 
				+ "\n┝━━━━━━━━━━━━━━━━━━━━━━━┥"
				+ "\n│ (1) (2) (3)      (+)  │"
				+ "\n│ (4) (5) (6)      (-)  │"
				+ "\n│ (7) (8) (9)      (X)  │"
				+ "\n│(+/-)(2) (.)      (%)  │"
				+ "\n┕━━━━━━━━━━━━━━━━━━━━━━━┙";
	}
	String Opcoes() {
		return "1. Somar"
		+ "\n2. Subtrair"
		+ "\n3. Multiplicar"
		+ "\n4. Dividir";
		
	}
	
	int Operacao(int menu) {
		
		if (menu == 1) 
			return soma.soma();
		if (menu == 2)
			return sub.sub();
		if (menu == 3)
			return multi.multi();
		if (menu == 4)
			return div.div();
		else
			return Null;
		
	}
}