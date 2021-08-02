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
		/** 
		 *  Retira esses dois, faz um CONTROLLER, no construtor desse controller, tu instancia o estoque do repositorio,
		 *  e nesse controller, você vai usar a instancia do estoque do repositorio pra chamar as funções do repositorio
		 *  EstoqueController estoqueController = new EstoqueController();
		 * 	estoqueController.criarEstoque(); --> que vai chamar a funcao que estiver no estoque repo
		 *  estoqueController.mostrarEstoque(); --> vai chamar a função do repo, que vai printar na tela esses caras, retirando
		 * aquela outra função ali
		 * 
		 * */
		/*******EstoqueRepositorio estoqueRepositorio = new EstoqueRepositorio(); ******/
		//EstoqueService estoqueService = new EstoqueServiceImpl(estoqueRepositorio);
		//ControlaEstoque controlaEstoque = new ControlaEstoque(estoqueService);
		
		//O CARA CLICOU PARA MOSTRAR TODOS OS ITENS DO ESTOQUE
		/**** Estoque estoque = controlaEstoque.buscar(); ******/
		//MOSTRAR ITENS NA TELA
		//estoque.mostrarItens();
		
		
		/**
		 * MESMA COISA AQUI
		 */
		/****** PedidoRepositorio pedidoRepositorio = new PedidoRepositorio(); ***********/
		/****** PedidoService pedidoService = new PedidoServiceImpl(pedidoRepositorio); ***********/
		/****** ControlaPedido controlaPedido = new ControlaPedido(pedidoService); ***********/
		

		//Pedido pedido =  controlaPedido.buscar();		
		//System.out.println("------------------------------------------");

		/**
		 * Nessa parte do pedido, com o controller de pedido, você pode usar uma função criarPedido();
		 * e até aí blz, daí na prox, você cria uma, finalizar pedido, que vai fazer as validações de estoque e tudo mais tb
		 */
		pedido.mostrarItens();
		
		pedido.getItens().forEach((item) -> estoqueRepositorio.removeEstoque(item));
		
		
		
				
		
		//Pedidil.itens().foreach {  
		//	controlaEstoque.removeItemEstoque(item);
		//}
		
	}
}
