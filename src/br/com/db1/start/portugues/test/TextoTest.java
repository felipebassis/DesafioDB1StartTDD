/*
Faça um programa que o usuário poderá inserir um texto. O programa deverá informar:

        * quantidade de caracteres do texto
        * quantidade de espaços em branco no texto
        * quantidade de vogais digitadas
*/

package br.com.db1.start.portugues.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.db1.start.portugues.classe.Texto;


public class TextoTest {

	private Texto texto = new Texto();
	
	@Before
	public void init() {
		texto.setTexto("Desafio DB1 Start");
		Assert.assertTrue(texto.getTexto().equals("Desafio DB1 Start"));
	}
	
	@After
	public void fim() {
		System.out.println("Fim do teste!");
	}
	
	@Test
	public void contarCaracterTest() {
		Assert.assertTrue(17 == texto.contarCaracter());
	}
	
	@Test
	public void contarEspacoEmBrancoTest() {
		Assert.assertTrue(2 == texto.contarEspacoEmBranco());
	}
	
	@Test
	public void contarVogalTest() {
		Assert.assertTrue(5 == texto.contarVogal());
	}
}
