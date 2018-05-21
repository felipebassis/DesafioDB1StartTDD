package br.com.db1.start.geografia.classe;

public class Cidade {
	
	private ListaCidade cidade;
	
	public ListaCidade getCidade() {
		return cidade;
	}

	public void setCidade(ListaCidade cidade) {
		this.cidade = cidade;
	}

	public ListaEstado getEstado() {
		switch(this.cidade) {
			case CURITIBA:
				return ListaEstado.PR;
			case MARINGA:
				return ListaEstado.PR;
			case LONDRINA:
				return ListaEstado.PR;
			case PINHAIS:
				return ListaEstado.PR;
			case CHAPECO:
				return ListaEstado.SC;
			case BLUMENAU:
				return ListaEstado.SC;
			case FLORIANOPOLIS:
				return ListaEstado.SC;
			case PORTOALEGRE:
				return ListaEstado.RS;
			case GRAMADO:
				return ListaEstado.RS;
			default:
				return null;
		}
	}

	public Boolean validarCapital() {
		if(getCidade() == ListaCidade.CURITIBA && getEstado() == ListaEstado.PR) {
			return true;
		}
		else if(getCidade() == ListaCidade.FLORIANOPOLIS && getEstado() == ListaEstado.SC) {
			return true;
		}
		else if(getCidade() == ListaCidade.PORTOALEGRE && getEstado() == ListaEstado.RS) {
			return true;
		}
		else {
			return false;
		}
	}

}
