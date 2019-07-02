package br.com.treinaweb.estruturadados.listaLigadas;

public class No<Type> {
	private Type type;
	private No<Type> next;

	public No() {
		this.next = null;
	}

	public No(Type type) {
		super();
		this.type = type;
		this.next = null;
	}

	public No(Type type, No<Type> next) {
		super();
		this.type = type;
		this.next = next;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type tipe) {
		this.type = tipe;
	}

	public No<Type> getNext() {
		return next;
	}

	public void setNext(No<Type> next) {
		this.next = next;
	}
}
