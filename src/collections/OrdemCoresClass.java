package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class OrdemCoresClass {

	public static void main(String[] args) {
		// variaveis
		Integer Indice;
		String CoresDigitadas;
		
		//ler dados
		Scanner scanner = new Scanner(System.in);
		
		//collections
		ArrayList<String> cores = new ArrayList<String>();
		
		//laco entrada
		for(Indice = 0; Indice<=4; Indice++) {
			System.out.println("Digite 5 cores: ");
			CoresDigitadas = scanner.next();
			cores.add(CoresDigitadas);
		}
		//laco exibir
		for(String Cores : cores) {
			System.out.println("Todas as cores digitadas: " + Cores.toString());
		}
		//laço ordenar
		Collections.sort(cores);
		for(String Cores : cores) {
			System.out.println("Lista de cores ordenadas por ordem alfabetica: " + Cores.toString());
		}

	}

}
