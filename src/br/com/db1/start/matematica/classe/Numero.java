package br.com.db1.start.matematica.classe;

public class Numero {
	
	private Integer numero;

	public Integer getNumero() {
		return numero;
	}

	public Numero(){
		
	}
	
	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Boolean par() {
		if(numero % 2 == 0) {
			return true;
		}
		else {
			return false;
		}
	}

	public Boolean impar() {
		if(!(numero % 2 == 0)) {
			return true;
		}
		else {
			return false;
		}
	}

	public Boolean maiorQueDez() {
		if(numero > 10) {
			return true;
		}
		else {
			return false;
		}
	}

	public Integer dobro() {
		return numero + numero;
	}

	public Boolean primo() {
		Integer divisor = 0;
		for(Integer contador = 1; contador <= numero; contador++) {
			if(numero % contador == 0) {
				divisor++;
			}
		}
		
		if(divisor == 2) {
			return true;
		}
		else {
			return false;
		}
		
		
		
	}
	
	
}
