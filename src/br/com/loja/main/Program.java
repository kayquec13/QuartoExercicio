package br.com.loja.main;

import org.junit.jupiter.api.Test;

import br.com.loja.controler.ControlaEstoque;
import br.com.loja.controler.ControlaPedido;
import br.com.loja.service.EstoqueServiceImp;

public class Program {
	@Test
	public void main() {

		ControlaEstoque controlaEstoque = new ControlaEstoque();
		ControlaPedido controlaPedido = new ControlaPedido();
		
		//clicou no botão de pesquisar estoque:
		controlaEstoque.pesquisarEstoque();
		controlaEstoque.calculaEstoque();
		
		System.out.println("----------------------------------");
		controlaPedido.pesquisaPedido();
		controlaPedido.calculaPedido();
		System.out.println("----------------------------------");
		
		controlaEstoque.removeEstoque();
		
		System.out.println("----------------------------------");

		controlaEstoque.pesquisarEstoque();
		controlaEstoque.calculaEstoque();

	}
}
