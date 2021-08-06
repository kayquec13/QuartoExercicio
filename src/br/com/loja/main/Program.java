package br.com.loja.main;

import org.junit.jupiter.api.Test;

import br.com.loja.controller.EstoqueServiceImp;
import br.com.loja.controller.PedidoServiceImp;

public class Program {
	@Test
	public void main() {

		EstoqueServiceImp estoqueImp = new EstoqueServiceImp();
		PedidoServiceImp pedidoImp = new PedidoServiceImp();

		estoqueImp.mostrarEstoque();
		estoqueImp.calculaEstoque();

		System.out.println("------------------------------------------------");

		pedidoImp.mostrarPedido();
		pedidoImp.calculaPedido();

		System.out.println("------------------------------------------------");

		estoqueImp.removeEstoque();
		estoqueImp.mostrarEstoque();
		estoqueImp.calculaEstoque();
		System.out.println("------------------------------------------------");

	}
}
