package br.com.db1.start.portugues.classe;

public class Texto {
	
	private String texto;

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public String getTexto() {
		return texto;
	}

	public Integer contarCaracter() {
		return texto.length();
	}

	public Integer contarEspacoEmBranco() {
		String texto = this.texto;
		
		texto = texto.replaceAll(" ", "");
		
		return this.texto.length() - texto.length();
	}

	public Integer contarVogal() {
		String texto = this.texto;
		
		texto = texto.toLowerCase();
		
		texto = texto.replaceAll("a", "");
		texto = texto.replaceAll("e", "");
		texto = texto.replaceAll("i", "");
		texto = texto.replaceAll("o", "");
		texto = texto.replaceAll("u", "");
		
		return this.texto.length() - texto.length();
	}
	

}
