/*
Fa�a um programa que o usu�rio poder� inserir um nome de cidade. O programa dever� informar:

* Qual o estado que a cidade pertence
* Se � capital ou n�o
* O conjunto de cidades permitidas devem ser as seguintes:
* Curitiba, Maring�, Londrina, Pinhais, Chapec�, Joinvile, Blumenau, Florian�polis, Porto Alegre, Gramado.
*/

package br.com.db1.start.geografia.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.db1.start.geografia.classe.Cidade;
import br.com.db1.start.geografia.classe.ListaCidade;
import br.com.db1.start.geografia.classe.ListaEstado;

public class CidadeTest {
	Cidade cidade = new Cidade();
	
	@Before
	public void init() {
		cidade.setCidade(ListaCidade.CURITIBA);
		Assert.assertTrue(ListaCidade.CURITIBA == cidade.getCidade());
	}
	
	@Test
	public void getEstadoTest() {
		Assert.assertTrue(ListaEstado.PR == cidade.getEstado());
	}
	
	@Test
	public void validarCapitalTest() {
		Assert.assertTrue(cidade.validarCapital());
	}
}
