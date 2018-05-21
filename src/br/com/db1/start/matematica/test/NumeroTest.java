/*
Faça um programa que o usuário poderá inserir um número. O programa deverá retornar em tela se o número digitado:

* é ou não PAR
* é ou não IMPAR
* é ou não maior que 10
* o dobro do valor digitado
* é ou não primo
*/

package br.com.db1.start.matematica.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.db1.start.matematica.classe.Numero;

public class NumeroTest {

	private Numero numero = new Numero();
	
	@Before
	public void init() {
		
		numero.setNumero(3);
		Assert.assertTrue(3 == numero.getNumero());
	}
	
	@After
	public void fim() {
		System.out.println("Fim do teste");
	}
	
	@Test
	public void parTest() {
		Assert.assertTrue(!numero.par());;
	}
	
	@Test
	public void imparTest() {
		Assert.assertTrue(numero.impar());
	}
	
	@Test
	public void maiorQueDezTest() {
		Assert.assertTrue(!numero.maiorQueDez());
	}
	
	@Test
	public void dobroTest() {
		Assert.assertTrue(6 == numero.dobro());
	}
	
	@Test
	public void primoTest() {
		Assert.assertTrue(numero.primo());
	}
	
}
