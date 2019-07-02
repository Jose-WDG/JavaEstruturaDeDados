package br.com.caelum.conjuntos;

public class Conjunto<T> {

	public boolean adiciona(T palavra) {
	
		if (palavra != null && !this.contem(palavra)) {
			adiciona(palavra);
			return true;
		}
		return false;
	}

	public void remove(T palavra) {
		// implementação
	}

	public boolean contem(T palavra) {
		// implementação
	}

	public List<T> pegaTodas() {
		// implementação
	}

	public int tamanho() {
		// implementação
	}
}
