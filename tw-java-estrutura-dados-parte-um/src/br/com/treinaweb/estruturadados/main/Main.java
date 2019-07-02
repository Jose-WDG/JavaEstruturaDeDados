package br.com.treinaweb.estruturadados.main;

import java.util.LinkedList;
import java.util.Scanner;

import br.com.treinaweb.estruturadados.exceptions.IlegalArgumentException;
import br.com.treinaweb.estruturadados.listaLigadas.ListaLigada;
/*import br.com.treinaweb.estruturadados.vetores.Vetor;*/

public class Main {

	public static void main(String[] args) throws IlegalArgumentException {
		Scanner scanner = new Scanner(System.in);
		fazerListaLigada();
	
		/*
		 * Vetor<String> vetor = new Vetor<String>(5); vetor.inserirEm(0, "José");
		 * vetor.inserirEm(1, "joao"); vetor.inserirEm(2, "mario"); vetor.inserirEm(3,
		 * "maria"); vetor.inserirEm(4, "dodoi");
		 * 
		 * if (vetor.contem("dodoi")) { System.out.println("O elemento tem no vetor.");
		 * } else { System.out.println("O elemento não tem no vetor."); } for (int i =
		 * 0; i < 5; i++) { System.out.println(vetor.recuperar(i)); }
		 */
		/*
		 * System.out.println("Digite a opçŽ¢o desejada: ");
		 * System.out.println("1. Gerenciamento de memoria"); int op =
		 * scanner.nextInt(); switch (op) { case 1: fazerGerenciamentoMemoria(); break;
		 * } scanner.close();
		 */

	}
	LinkedList<E> lista = new LinkedList<E>();
	private static void fazerListaLigada() {
		// TODO Auto-generated method stub
		@SuppressWarnings("unused")
		ListaLigada<String> listaItem = new ListaLigada<String>();
		listaItem.inserir("1 - teclado");
		listaItem.inserir("1 - mause");
		listaItem.inserir("2 - mause");
		System.out.println(listaItem.toString());
	}

}
