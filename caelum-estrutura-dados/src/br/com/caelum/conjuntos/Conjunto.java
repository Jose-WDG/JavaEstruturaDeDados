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
		// implementa��o
	}

	public boolean contem(T palavra) {
		// implementa��o
	}

	public List<T> pegaTodas() {
		// implementa��o
	}

	public int tamanho() {
		// implementa��o
	}
}
