package br.com.treinaweb.estruturadados.listaLigadas;

public class ListaLigada<type> {
	private No<type> primeiroNo;
	private No<type> ultimo;
	private int tamanho;

	public ListaLigada() {
		this.primeiroNo = null;
		this.ultimo = null;
		this.tamanho = 0;
	}

	public void inserir(type elemento) {
		No<type> newNo = new No<type>(elemento);
		if (estaVazia()) {
			this.primeiroNo = newNo;
			this.ultimo = newNo;
		} else {
			this.ultimo.setNext(newNo);
			this.ultimo = newNo;
		}
		this.tamanho++;
	}

	public boolean estaVazia() {
		return this.tamanho == 0;
	}

	public int tamanho() {
		return this.tamanho;
	}

	@Override
	public String toString() {
		if(estaVazia()) {
			return "Lista []";
		}else {
			No<type> noAtual = this.primeiroNo;
			StringBuilder sb = new StringBuilder();
			sb.append("Lista [");
			
			while(noAtual.getNext() != null) {
				sb.append(noAtual.getNext().getType() != null ? noAtual.getNext().getType().toString() : "<NULL>");
				sb.append(",");
				noAtual = noAtual.getNext();
			}	
			sb.append("]");
			return sb.toString();
		}
	
	}

}
