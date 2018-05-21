/*
Faça um programa que o usuário poderá inserir um nome de cidade. O programa deverá informar:

* Qual o estado que a cidade pertence
* Se é capital ou não
* O conjunto de cidades permitidas devem ser as seguintes:
* Curitiba, Maringá, Londrina, Pinhais, Chapecó, Joinvile, Blumenau, Florianópolis, Porto Alegre, Gramado.
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
