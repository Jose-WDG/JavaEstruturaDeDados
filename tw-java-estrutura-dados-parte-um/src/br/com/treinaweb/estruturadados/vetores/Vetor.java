package br.com.treinaweb.estruturadados.vetores;

import br.com.treinaweb.estruturadados.exceptions.IlegalArgumentException;

public class Vetor<t> {
	private Object[] elementos;
	// Constructor
	public Vetor(int capacidade) {
		this.elementos = new Object[capacidade];
	}
	
	public Vetor() {
		this.elementos = new Object[3];
	}
	
	public int tamanho() {
		return this.elementos.length;
	}
	
	public boolean contem(t elemento) {
		
		for(int i = 0 ; i < tamanho() ; i++ ) {
			t elem = recuperar(i);
			if(elem != null && elem.equals(elemento)) {
				return true; 
			}
			
		}
		return  false;
	}
	
	public void inserirEm(int posicao, t nome) throws IlegalArgumentException {
		
		if(posicao > this.elementos.length) {
			throw new IlegalArgumentException("A posição é inválida.");
		}else {
			this.elementos[posicao] = nome;
		}
		
	}

	@SuppressWarnings("unchecked")
	public t recuperar(int posicao) {
		return (t)this.elementos[posicao];
	}

}
