package br.com.loja.main;

import org.junit.jupiter.api.Test;

import br.com.loja.entities.Estoque;
import br.com.loja.entities.Pedido;
import br.com.loja.repositorios.EstoqueRepositorio;
import br.com.loja.repositorios.PedidoRepositorio;
import br.com.loja.servicos.EstoqueService;
import br.com.loja.servicos.PedidoService;
import br.com.loja.servicos.impl.EstoqueServiceImpl;
import br.com.loja.servicos.impl.PedidoServiceImpl;
import br.com.loja.util.ControlaEstoque;
import br.com.loja.util.ControlaPedido;

public class Program {
	@Test
	public void main() {
		EstoqueRepositorio estoqueRepositorio = new EstoqueRepositorio();
		EstoqueService estoqueService = new EstoqueServiceImpl(estoqueRepositorio);
		ControlaEstoque controlaEstoque = new ControlaEstoque(estoqueService);
		
		//O CARA CLICOU PARA MOSTRAR TODOS OS ITENS DO ESTOQUE
		Estoque estoque = controlaEstoque.buscar();
		//MOSTRAR ITENS NA TELA
		estoque.mostrarItens();
		
		
		PedidoRepositorio pedidoRepositorio = new PedidoRepositorio();
		PedidoService pedidoService = new PedidoServiceImpl(pedidoRepositorio);
		ControlaPedido controlaPedido = new ControlaPedido(pedidoService);
		

		Pedido pedido =  controlaPedido.buscar();		
		System.out.println("------------------------------------------");

		pedido.mostrarItens();
		
		pedido.getItens().forEach((item) -> estoqueRepositorio.removeEstoque(item));
		
		
		
				
		
		//Pedidil.itens().foreach {  
		//	controlaEstoque.removeItemEstoque(item);
		//}
		
	}
}
