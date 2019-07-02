package br.com.treinaweb.estruturadados.exceptions;

public class IlegalArgumentException extends Exception {

	private static final long serialVersionUID = -4945550952185737064L;
	
	public IlegalArgumentException(String erro) {
		System.out.println(erro);
	}
}
