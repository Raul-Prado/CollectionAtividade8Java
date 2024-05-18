package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class OrdemNumerosClass {

	public static void main(String[] args) {
		// variaveis
		Integer Indice;
		String CoresDigitadas;
		Set<Numeros>;
		//ler dados
		Scanner scanner = new Scanner(System.in);
				
		//collections
		Iterator<Numeros> cores = new ArrayList<String>();
				
		//laco entrada
		for(Indice = 0; Indice<=4; Indice++) {
			System.out.println("Digite 5 cores: ");
			CoresDigitadas = scanner.next();
			cores.add(CoresDigitadas);
		}

	}

}
